package com.hugorandom.metallistix.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final String KEY_CATEGORY_METALLISTIX = "key.category.metallistix.metallistix";
    public static final String KEY_VITAMINS = "key.metallistix.vitamins";

    public static final KeyMapping VITAMINS_KEY = new KeyMapping(KEY_VITAMINS, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V, KEY_CATEGORY_METALLISTIX);
}