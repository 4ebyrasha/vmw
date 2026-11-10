/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.launchwrapper.IClassTransformer
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.MethodVisitor
 *  org.objectweb.asm.Opcodes
 */
package com.vicmatskiv.weaponlib.core;

import com.vicmatskiv.weaponlib.ClassInfo;
import com.vicmatskiv.weaponlib.OptimizedCubeList;
import com.vicmatskiv.weaponlib.compatibility.CompatibleClassInfoProvider;
import net.minecraft.item.ItemBlock;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class WeaponlibClassTransformer
implements IClassTransformer {
    private static ClassInfo entityRendererClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/renderer/EntityRenderer");
    private static ClassInfo renderBipedClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/renderer/entity/RenderBiped");
    private static ClassInfo modelBipedClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/model/ModelBiped");
    private static ClassInfo modelPlayerClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/model/ModelPlayer");
    private static ClassInfo renderLivingBaseClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/renderer/entity/RenderLivingBase");
    private static ClassInfo modelBaseClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/model/ModelBase");
    private static ClassInfo layerArmorBaseClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/renderer/entity/layers/LayerArmorBase");
    private static ClassInfo layerHeldItemClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/renderer/entity/layers/LayerHeldItem");
    private static ClassInfo entityPlayerSPClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/entity/EntityPlayerSP");
    private static ClassInfo entityPlayerMPClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/entity/player/EntityPlayerMP");
    private static ClassInfo inventoryChangeTriggerClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/advancements/critereon/InventoryChangeTrigger");
    private static ClassInfo entityPlayerClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/entity/player/EntityPlayer");
    private static ClassInfo entityLivingBaseClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/entity/EntityLivingBase");
    private static ClassInfo modelRendererClassInfo = CompatibleClassInfoProvider.getInstance().getClassInfo("net/minecraft/client/model/ModelRenderer");

    public byte[] transform(String par1, String className, byte[] bytecode) {
        if (entityRendererClassInfo.classMatches(className) || renderBipedClassInfo != null && renderBipedClassInfo.classMatches(className) || modelBipedClassInfo != null && modelBipedClassInfo.classMatches(className) || modelPlayerClassInfo != null && modelPlayerClassInfo.classMatches(className) || renderLivingBaseClassInfo != null && renderLivingBaseClassInfo.classMatches(className) || layerArmorBaseClassInfo != null && layerArmorBaseClassInfo.classMatches(className) || layerHeldItemClassInfo != null && layerHeldItemClassInfo.classMatches(className) || entityPlayerSPClassInfo != null && entityPlayerSPClassInfo.classMatches(className) || entityPlayerMPClassInfo != null && entityPlayerMPClassInfo.classMatches(className) || entityLivingBaseClassInfo != null && entityLivingBaseClassInfo.classMatches(className) || modelRendererClassInfo != null && modelRendererClassInfo.classMatches(className)) {
            ClassReader cr = new ClassReader(bytecode);
            ClassWriter cw = new ClassWriter(cr, 1);
            CVTransform cv = new CVTransform((ClassVisitor)cw);
            cr.accept((ClassVisitor)cv, 0);
            return cw.toByteArray();
        }
        return bytecode;
    }

    private static class CVTransform
    extends ClassVisitor {
        String classname;

        public CVTransform(ClassVisitor cv) {
            super(262144, cv);
        }

        public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
            this.classname = name;
            this.cv.visit(version, access, name, signature, superName, interfaces);
        }

        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
            if (entityRendererClassInfo.methodMatches("setupCameraTransform", "(FI)V", this.classname, name, desc)) {
                return new SetupCameraTransformMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (entityRendererClassInfo.methodMatches("setupViewBobbing", "(F)V", this.classname, name, desc)) {
                return new SetupViewBobbingMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (entityRendererClassInfo.methodMatches("hurtCameraEffect", "(F)V", this.classname, name, desc)) {
                return new HurtCameraEffectMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (renderBipedClassInfo != null && renderBipedClassInfo.methodMatches("renderEquippedItems", "(Lnet/minecraft/entity/EntityLiving;F)V", this.classname, name, desc)) {
                return new RenderEquippedItemsMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (renderLivingBaseClassInfo != null && renderLivingBaseClassInfo.methodMatches("renderModel", "(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V", this.classname, name, desc)) {
                return new RenderModelMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (layerArmorBaseClassInfo != null && layerArmorBaseClassInfo.methodMatches("renderArmorLayer", "(Lnet/minecraft/entity/EntityLivingBase;FFFFFFFLnet/minecraft/inventory/EntityEquipmentSlot;)V", this.classname, name, desc)) {
                return new RenderArmorLayerMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (layerHeldItemClassInfo != null && layerHeldItemClassInfo.methodMatches("renderHeldItem", "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V", this.classname, name, desc)) {
                return new RenderHeldItemMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions), !name.equals("renderHeldItem"));
            }
            if (entityPlayerSPClassInfo != null && entityPlayerSPClassInfo.methodMatches("isSneaking", "()Z", this.classname, name, desc)) {
                return new IsSneakingMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (entityPlayerSPClassInfo != null && entityPlayerSPClassInfo.methodMatches("updateEntityActionState", "()V", this.classname, name, desc)) {
                return new UpdateEntityActionStateMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (entityPlayerMPClassInfo != null && entityPlayerMPClassInfo.methodMatches("sendSlotContents", "(Lnet/minecraft/inventory/Container;ILnet/minecraft/item/ItemStack;)V", this.classname, name, desc)) {
                return new SendSlotContentsMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions), !name.equals("sendSlotContents"));
            }
            if (entityLivingBaseClassInfo != null && entityLivingBaseClassInfo.methodMatches("attackEntityFrom", "(Lnet/minecraft/util/DamageSource;F)Z", this.classname, name, desc)) {
                return new AttackEntityFromMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (entityLivingBaseClassInfo != null && entityLivingBaseClassInfo.methodMatches("attackEntityFrom", "(Lnet/minecraft/util/DamageSource;F)Z", this.classname, name, desc)) {
                return new AttackEntityFromMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (modelRendererClassInfo.classMatches(this.classname) && name.equals("<init>")) {
                return new ModelRendererConstructorVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions));
            }
            if (modelRendererClassInfo != null && modelRendererClassInfo.methodMatches("render", "(F)V", this.classname, name, desc)) {
                return new ModelRendererRenderMethodVisitor(this.cv.visitMethod(access, name, desc, signature, exceptions), !name.equals("render"));
            }
            return this.cv.visitMethod(access, name, desc, signature, exceptions);
        }
    }

    private static class AttackEntityFromMethodVisitor
    extends MethodVisitor {
        public AttackEntityFromMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitLdcInsn(Object cst) {
            if (cst instanceof Float && cst.equals(Float.valueOf(0.4f))) {
                this.mv.visitVarInsn(25, 1);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/ServerInterceptors", "getKnockback", "(Lnet/minecraft/util/DamageSource;)F", false);
            } else {
                super.visitLdcInsn(cst);
            }
        }

        public void visitFieldInsn(int opcode, String owner, String name, String desc) {
            super.visitFieldInsn(opcode, owner, name, desc);
            if (opcode == 180 && (owner.equals("bnl") || owner.equals("net/minecraft/util/MovementInput")) && (name.equals("jump") || name.equals("g"))) {
                Label l6 = new Label();
                this.mv.visitJumpInsn(153, l6);
                this.mv.visitVarInsn(25, 0);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "isProning", "(Lnet/minecraft/entity/player/EntityPlayer;)Z", false);
                this.mv.visitJumpInsn(154, l6);
                this.mv.visitInsn(4);
                Label l7 = new Label();
                this.mv.visitJumpInsn(167, l7);
                this.mv.visitLabel(l6);
                this.mv.visitFrame(4, 0, null, 1, new Object[]{owner});
                this.mv.visitInsn(3);
                this.mv.visitLabel(l7);
                this.mv.visitFrame(0, 1, new Object[]{owner}, 2, new Object[]{owner, Opcodes.INTEGER});
            }
        }
    }

    private static class ModelRendererRenderMethodVisitor
    extends MethodVisitor {
        private boolean transformed;
        private boolean notchMode;

        public ModelRendererRenderMethodVisitor(MethodVisitor mv, boolean notchMode) {
            super(262144, mv);
            this.notchMode = notchMode;
        }

        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            if (!this.transformed && opcode == 154) {
                String fieldName = "cubeList";
                if (this.notchMode) {
                    fieldName = modelRendererClassInfo.getNotchFieldName(fieldName);
                }
                this.mv.visitVarInsn(25, 0);
                this.mv.visitFieldInsn(180, modelRendererClassInfo.getMcpClassName(), fieldName, "Ljava/util/List;");
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "shouldRender", "(Ljava/util/List;)Z", false);
                this.mv.visitJumpInsn(153, label);
                this.transformed = true;
            }
        }
    }

    private static class ModelRendererConstructorVisitor
    extends MethodVisitor {
        public ModelRendererConstructorVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if (opcode == 184 && owner.equals("com/google/common/collect/Lists") && name.equals("newArrayList")) {
                String cubeListClassName = OptimizedCubeList.class.getName().replace('.', '/');
                this.mv.visitMethodInsn(184, cubeListClassName, "newList", "()L" + cubeListClassName + ";", false);
            } else {
                super.visitMethodInsn(opcode, owner, name, desc, itf);
            }
        }
    }

    private static class SendSlotContentsMethodVisitor
    extends MethodVisitor {
        private boolean notchMode;

        public SendSlotContentsMethodVisitor(MethodVisitor mv, boolean notchMode) {
            super(262144, mv);
            this.notchMode = notchMode;
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            super.visitMethodInsn(opcode, owner, name, desc, itf);
            if (inventoryChangeTriggerClassInfo.methodMatches("trigger", "(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/player/InventoryPlayer;)V", owner, name, desc)) {
                this.mv.visitVarInsn(25, 0);
                this.mv.visitVarInsn(25, 0);
                String fieldName = "inventory";
                if (this.notchMode) {
                    fieldName = entityPlayerClassInfo.getNotchFieldName(fieldName);
                }
                this.mv.visitFieldInsn(180, "net/minecraft/entity/player/EntityPlayerMP", fieldName, "Lnet/minecraft/entity/player/InventoryPlayer;");
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/ServerInterceptors", "onSlotContentChange", "(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/player/InventoryPlayer;)V", false);
            }
        }
    }

    private static class UpdateEntityActionStateMethodVisitor
    extends MethodVisitor {
        public UpdateEntityActionStateMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitFieldInsn(int opcode, String owner, String name, String desc) {
            super.visitFieldInsn(opcode, owner, name, desc);
            if (opcode == 180 && (owner.equals("bnl") || owner.equals("net/minecraft/util/MovementInput")) && (name.equals("jump") || name.equals("g"))) {
                Label l6 = new Label();
                this.mv.visitJumpInsn(153, l6);
                this.mv.visitVarInsn(25, 0);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "isProning", "(Lnet/minecraft/entity/player/EntityPlayer;)Z", false);
                this.mv.visitJumpInsn(154, l6);
                this.mv.visitInsn(4);
                Label l7 = new Label();
                this.mv.visitJumpInsn(167, l7);
                this.mv.visitLabel(l6);
                this.mv.visitFrame(4, 0, null, 1, new Object[]{owner});
                this.mv.visitInsn(3);
                this.mv.visitLabel(l7);
                this.mv.visitFrame(0, 1, new Object[]{owner}, 2, new Object[]{owner, Opcodes.INTEGER});
            }
        }
    }

    private static class IsSneakingMethodVisitor
    extends MethodVisitor {
        public IsSneakingMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitJumpInsn(int opcode, Label label) {
            this.mv.visitJumpInsn(opcode, label);
            if (opcode == 154) {
                this.mv.visitVarInsn(25, 0);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "isProning", "(Lnet/minecraft/entity/player/EntityPlayer;)Z", false);
                this.mv.visitJumpInsn(154, label);
            }
        }
    }

    private static class RenderHeldItemMethodVisitor
    extends MethodVisitor {
        private boolean notchMode;

        public RenderHeldItemMethodVisitor(MethodVisitor mv, boolean notchMode) {
            super(262144, mv);
            this.notchMode = notchMode;
        }

        public void visitVarInsn(int opcode, int var) {
            super.visitVarInsn(opcode, var);
            if (opcode == 25 && var == 0) {
                String fieldName = "livingEntityRenderer";
                if (this.notchMode) {
                    fieldName = layerHeldItemClassInfo.getNotchFieldName(fieldName);
                }
                this.mv.visitFieldInsn(180, "net/minecraft/client/renderer/entity/layers/LayerHeldItem", fieldName, "Lnet/minecraft/client/renderer/entity/RenderLivingBase;");
                this.mv.visitVarInsn(25, 1);
                this.mv.visitVarInsn(25, 2);
                this.mv.visitVarInsn(25, 3);
            }
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if (layerHeldItemClassInfo.methodMatches("translateToHand", "(Lnet/minecraft/util/EnumHandSide;)V", owner, name, desc)) {
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "positionItemSide", "(Lnet/minecraft/client/renderer/entity/RenderLivingBase;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V", false);
            } else {
                super.visitMethodInsn(opcode, owner, name, desc, itf);
            }
        }
    }

    private static class RenderArmorLayerMethodVisitor
    extends MethodVisitor {
        public RenderArmorLayerMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if (modelBaseClassInfo.methodMatches("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", owner, name, desc)) {
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "renderArmorLayer", "(Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/entity/Entity;FFFFFF)V", false);
            } else {
                super.visitMethodInsn(opcode, owner, name, desc, itf);
            }
        }
    }

    private static class RenderModelMethodVisitor
    extends MethodVisitor {
        public RenderModelMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if (modelBaseClassInfo.methodMatches("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", owner, name, desc)) {
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "render2", "(Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/entity/Entity;FFFFFF)V", false);
            } else {
                super.visitMethodInsn(opcode, owner, name, desc, itf);
            }
        }
    }

    private static class RenderMethodVisitor
    extends MethodVisitor {
        public RenderMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitCode() {
            Label l0 = new Label();
            this.mv.visitLabel(l0);
            this.mv.visitVarInsn(25, 0);
            this.mv.visitVarInsn(25, 1);
            this.mv.visitVarInsn(23, 2);
            this.mv.visitVarInsn(23, 3);
            this.mv.visitVarInsn(23, 4);
            this.mv.visitVarInsn(23, 5);
            this.mv.visitVarInsn(23, 6);
            this.mv.visitVarInsn(23, 7);
            this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "render", "(Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/entity/Entity;FFFFFF)Z", false);
            Label l1 = new Label();
            this.mv.visitJumpInsn(154, l1);
            Label l2 = new Label();
            this.mv.visitLabel(l2);
            this.mv.visitInsn(177);
            this.mv.visitLabel(l1);
            this.mv.visitFrame(3, 0, null, 0, null);
            super.visitCode();
        }
    }

    private static class RenderEquippedItemsMethodVisitor
    extends MethodVisitor {
        private String itemBlockClassName = ItemBlock.class.getName().replace('.', '/');

        public RenderEquippedItemsMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitTypeInsn(int opcode, String type) {
            if (opcode == 193 && type.equals(this.itemBlockClassName)) {
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "is3dRenderableItem", "(Lnet/minecraft/item/Item;)Z", false);
            } else {
                super.visitTypeInsn(opcode, type);
            }
        }
    }

    private static class SetupCameraTransformMethodVisitor
    extends MethodVisitor {
        public SetupCameraTransformMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc) {
            if (entityRendererClassInfo.methodMatches("hurtCameraEffect", "(F)V", owner, name, desc)) {
                super.visitMethodInsn(opcode, owner, name, desc);
                this.mv.visitVarInsn(23, 1);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "setupCameraTransformAfterHurtCameraEffect", "(F)V");
                return;
            }
            this.mv.visitMethodInsn(opcode, owner, name, desc);
        }

        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            if (opcode == 158) {
                this.mv.visitVarInsn(23, 1);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "nauseaCameraEffect", "(F)Z", false);
                this.mv.visitJumpInsn(153, label);
            }
        }
    }

    private static class HurtCameraEffectMethodVisitor
    extends MethodVisitor {
        private boolean visited;

        public HurtCameraEffectMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            if (!this.visited && opcode == 153) {
                this.mv.visitVarInsn(23, 1);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "hurtCameraEffect", "(F)Z", false);
                this.mv.visitJumpInsn(153, label);
                this.visited = true;
            }
        }
    }

    private static class SetupViewBobbingMethodVisitor
    extends MethodVisitor {
        public SetupViewBobbingMethodVisitor(MethodVisitor mv) {
            super(262144, mv);
        }

        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            if (opcode == 153) {
                this.mv.visitVarInsn(23, 1);
                this.mv.visitMethodInsn(184, "com/vicmatskiv/weaponlib/compatibility/Interceptors", "setupViewBobbing", "(F)Z", false);
                this.mv.visitJumpInsn(153, label);
            }
        }
    }
}

