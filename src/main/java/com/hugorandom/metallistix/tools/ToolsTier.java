package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.items.Items1Init;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolsTier {

    public static final ForgeTier DISPROSIO = new ForgeTier(3, 1581, 7.5f, 3.0f, 22,
            BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(Items1Init.DISPROSIO_INGOT.get()));
    public static final ForgeTier FRANITOLINA = new ForgeTier(3, 1615, 7.5f, 3.0f, 16,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.FRANITOLINA_INGOT.get()));
    public static final ForgeTier MELITONILA = new ForgeTier(3, 1631, 7.5f, 3.0f, 20,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.MELITONILA_INGOT.get()));
    public static final ForgeTier ALEZARITA = new ForgeTier(3, 1661, 8.5f, 3.5f, 13,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.ALEZARITA_INGOT.get()));
    public static final ForgeTier HALIX = new ForgeTier(3, 1698, 8.5f, 3.5f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.HALIX_INGOT.get()));
    public static final ForgeTier MIGUELITIO = new ForgeTier(3, 1722, 8.5f, 3.5f, 13,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.MIGUELITIO_INGOT.get()));
}
