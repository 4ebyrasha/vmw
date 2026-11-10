/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.network;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import com.vicmatskiv.weaponlib.network.PermitMessage;
import com.vicmatskiv.weaponlib.state.ExtendedState;
import com.vicmatskiv.weaponlib.state.ManagedState;
import com.vicmatskiv.weaponlib.state.Permit;
import com.vicmatskiv.weaponlib.state.PermitManager;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NetworkPermitManager
implements PermitManager,
CompatibleMessageHandler<PermitMessage, CompatibleMessage> {
    private static final Logger logger = LogManager.getLogger(NetworkPermitManager.class);
    private ModContext modContext;
    private Map<UUID, Object> permitCallbacks = new HashMap<UUID, Object>();
    private Map<Class<?>, BiConsumer<Permit<?>, ?>> evaluators = new HashMap();

    public NetworkPermitManager(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void request(P permit, E extendedState, BiConsumer<P, E> callback) {
        this.permitCallbacks.put(permit.getUuid(), callback);
        this.modContext.getChannel().getChannel().sendToServer((IMessage)new PermitMessage(permit, extendedState));
    }

    @Override
    public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void registerEvaluator(Class<? extends P> permitClass, Class<? extends E> esClass, BiConsumer<P, E> evaluator) {
        this.evaluators.put(permitClass, (p, c) -> {
            logger.debug("Processing permit {} for instance {}", p, c);
            evaluator.accept(permitClass.cast(p), esClass.cast(c));
        });
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(PermitMessage permitMessage, CompatibleMessageContext ctx) {
        Permit<?> permit = permitMessage.getPermit();
        Object extendedState = permitMessage.getContext();
        if (ctx.isServerSide()) {
            if (extendedState instanceof PlayerContext) {
                ((PlayerContext)extendedState).setPlayer((EntityLivingBase)ctx.getPlayer());
            }
            ctx.runInMainThread(() -> {
                BiConsumer<Permit<?>, ?> evaluator = this.evaluators.get(permit.getClass());
                if (evaluator != null) {
                    evaluator.accept(permit, extendedState);
                }
                PermitMessage message = new PermitMessage(permit, extendedState);
                this.modContext.getChannel().getChannel().sendTo((IMessage)message, (EntityPlayerMP)ctx.getPlayer());
            });
        } else {
            CompatibilityProvider.compatibility.runInMainClientThread(() -> {
                BiConsumer callback;
                if (extendedState instanceof PlayerContext) {
                    ((PlayerContext)extendedState).setPlayer((EntityLivingBase)CompatibilityProvider.compatibility.clientPlayer());
                }
                if ((callback = (BiConsumer)this.permitCallbacks.remove(permit.getUuid())) != null) {
                    callback.accept(permit, extendedState);
                }
            });
        }
        return null;
    }
}

