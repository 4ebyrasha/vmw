/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 */
package com.vicmatskiv.weaponlib.compatibility;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.material.Material;

public class CompatibleMaterial {
    private static Map<Material, CompatibleMaterial> materials = new HashMap<Material, CompatibleMaterial>();
    public static final CompatibleMaterial AIR = new CompatibleMaterial(Material.field_151579_a);
    public static final CompatibleMaterial GRASS = new CompatibleMaterial(Material.field_151577_b);
    public static final CompatibleMaterial GROUND = new CompatibleMaterial(Material.field_151578_c);
    public static final CompatibleMaterial WOOD = new CompatibleMaterial(Material.field_151575_d);
    public static final CompatibleMaterial ROCK = new CompatibleMaterial(Material.field_151576_e);
    public static final CompatibleMaterial IRON = new CompatibleMaterial(Material.field_151573_f);
    public static final CompatibleMaterial ANVIL = new CompatibleMaterial(Material.field_151574_g);
    public static final CompatibleMaterial WATER = new CompatibleMaterial(Material.field_151586_h);
    public static final CompatibleMaterial LAVA = new CompatibleMaterial(Material.field_151587_i);
    public static final CompatibleMaterial LEAVES = new CompatibleMaterial(Material.field_151584_j);
    public static final CompatibleMaterial PLANTS = new CompatibleMaterial(Material.field_151585_k);
    public static final CompatibleMaterial VINE = new CompatibleMaterial(Material.field_151582_l);
    public static final CompatibleMaterial SPONGE = new CompatibleMaterial(Material.field_151583_m);
    public static final CompatibleMaterial CLOTH = new CompatibleMaterial(Material.field_151580_n);
    public static final CompatibleMaterial FIRE = new CompatibleMaterial(Material.field_151581_o);
    public static final CompatibleMaterial SAND = new CompatibleMaterial(Material.field_151595_p);
    public static final CompatibleMaterial CIRCUITS = new CompatibleMaterial(Material.field_151594_q);
    public static final CompatibleMaterial CARPET = new CompatibleMaterial(Material.field_151593_r);
    public static final CompatibleMaterial GLASS = new CompatibleMaterial(Material.field_151592_s);
    public static final CompatibleMaterial REDSTONE_LIGHT = new CompatibleMaterial(Material.field_151591_t);
    public static final CompatibleMaterial TNT = new CompatibleMaterial(Material.field_151590_u);
    public static final CompatibleMaterial CORAL = new CompatibleMaterial(Material.field_151589_v);
    public static final CompatibleMaterial ICE = new CompatibleMaterial(Material.field_151588_w);
    public static final CompatibleMaterial PACKEDICE = new CompatibleMaterial(Material.field_151598_x);
    public static final CompatibleMaterial SNOW = new CompatibleMaterial(Material.field_151597_y);
    public static final CompatibleMaterial CRAFTED_SNOW = new CompatibleMaterial(Material.field_151596_z);
    public static final CompatibleMaterial CACTUS = new CompatibleMaterial(Material.field_151570_A);
    public static final CompatibleMaterial CLAY = new CompatibleMaterial(Material.field_151571_B);
    public static final CompatibleMaterial GOURD = new CompatibleMaterial(Material.field_151572_C);
    public static final CompatibleMaterial DRAGON_EGG = new CompatibleMaterial(Material.field_151566_D);
    public static final CompatibleMaterial PORTAL = new CompatibleMaterial(Material.field_151567_E);
    public static final CompatibleMaterial CAKE = new CompatibleMaterial(Material.field_151568_F);
    public static final CompatibleMaterial WEB = new CompatibleMaterial(Material.field_151569_G);
    private Material material;

    public CompatibleMaterial(Material material) {
        this.material = material;
        materials.put(material, this);
    }

    public Material getMaterial() {
        return this.material;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.material == null ? 0 : this.material.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        CompatibleMaterial other = (CompatibleMaterial)obj;
        return !(this.material == null ? other.material != null : !this.material.equals(other.material));
    }

    static CompatibleMaterial getMaterial(Material material) {
        return materials.get(material);
    }
}

