/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.stats.StatisticsManager
 *  net.minecraft.world.World
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.world.World;

public class CompatiblePlayerCreatureWrapper
extends EntityPlayerSP {
    private EntityLivingBase entityLiving;

    public CompatiblePlayerCreatureWrapper(Minecraft mc, World world) {
        super(mc, world, mc.func_147114_u(), new StatisticsManager(), null);
    }

    public void setEntityLiving(EntityLivingBase entityLiving) {
        this.entityLiving = entityLiving;
        if (entityLiving != null) {
            this.updateCoordinates();
        }
    }

    public EntityLivingBase getEntityLiving() {
        return this.entityLiving;
    }

    public void updateCoordinates() {
        this.field_70165_t = this.entityLiving.field_70165_t;
        this.field_70163_u = this.entityLiving.field_70163_u;
        this.field_70161_v = this.entityLiving.field_70161_v;
        this.field_70142_S = this.entityLiving.field_70142_S;
        this.field_70137_T = this.entityLiving.field_70137_T;
        this.field_70136_U = this.entityLiving.field_70136_U;
        this.field_70131_O = this.entityLiving.field_70131_O;
        this.field_71109_bG = this.entityLiving.field_70177_z;
        this.field_70726_aT = this.entityLiving.field_70726_aT;
        this.field_70177_z = this.entityLiving.field_70177_z;
        this.field_70125_A = this.entityLiving.field_70125_A;
        this.field_70759_as = this.entityLiving.field_70759_as;
        this.field_70159_w = this.entityLiving.field_70159_w;
        this.field_70181_x = this.entityLiving.field_70181_x;
        this.field_70179_y = this.entityLiving.field_70179_y;
        this.field_70176_ah = this.entityLiving.field_70176_ah;
        this.field_70162_ai = this.entityLiving.field_70162_ai;
        this.field_70164_aj = this.entityLiving.field_70164_aj;
        this.field_70175_ag = this.entityLiving.field_70175_ag;
        this.field_70720_be = this.entityLiving.field_70720_be;
        this.field_70739_aP = this.entityLiving.field_70739_aP;
        this.field_71093_bK = this.entityLiving.field_71093_bK;
        this.field_96093_i = this.entityLiving.func_110124_au();
        this.field_184619_aG = this.entityLiving.field_184619_aG;
        this.field_70721_aZ = this.entityLiving.field_70721_aZ;
        this.field_70131_O = this.entityLiving.field_70131_O;
        this.field_191988_bg = this.entityLiving.field_191988_bg;
        this.field_70173_aa = this.entityLiving.field_70173_aa;
    }

    public float func_175156_o() {
        return 0.5f;
    }

    public boolean func_175144_cb() {
        return false;
    }
}

