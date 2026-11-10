/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 */
package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms;

public enum CompatibleTransformType {
    NONE,
    THIRD_PERSON_LEFT_HAND,
    THIRD_PERSON_RIGHT_HAND,
    FIRST_PERSON_LEFT_HAND,
    FIRST_PERSON_RIGHT_HAND,
    HEAD,
    GUI,
    GROUND,
    FIXED;


    public static CompatibleTransformType fromItemRenderType(ItemCameraTransforms.TransformType itemRenderType) {
        CompatibleTransformType result = null;
        switch (itemRenderType) {
            case NONE: {
                result = NONE;
                break;
            }
            case THIRD_PERSON_LEFT_HAND: {
                result = THIRD_PERSON_LEFT_HAND;
                break;
            }
            case THIRD_PERSON_RIGHT_HAND: {
                result = THIRD_PERSON_RIGHT_HAND;
                break;
            }
            case FIRST_PERSON_LEFT_HAND: {
                result = FIRST_PERSON_LEFT_HAND;
                break;
            }
            case FIRST_PERSON_RIGHT_HAND: {
                result = FIRST_PERSON_RIGHT_HAND;
                break;
            }
            case HEAD: {
                result = HEAD;
                break;
            }
            case GUI: {
                result = GUI;
                break;
            }
            case GROUND: {
                result = GROUND;
                break;
            }
            case FIXED: {
                result = FIXED;
            }
        }
        return result;
    }
}

