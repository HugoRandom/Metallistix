package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.items.Items1Init;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolsTier {

    public static final ForgeTier DISPROSIO = new ForgeTier(2, 897, 6.0f, 3f, 30,
            BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(Items1Init.DISPROSIO_INGOT.get()));
    public static final ForgeTier FRANITOLINA = new ForgeTier(3, 1126, 7.5f, 4.0f, 20,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.FRANITOLINA_INGOT.get()));
    public static final ForgeTier MELUNA = new ForgeTier(4, 1626, 8.5f, 4.5f, 25,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.FRANITOLINA_INGOT.get()));
    public static final ForgeTier ALEZARITA = new ForgeTier(4, 1561, 8.0f, 4.5f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.ALEZARITA_INGOT.get()));
    public static final ForgeTier HALIX = new ForgeTier(4, 1896, 10.0f, 4.5f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.HALIX_INGOT.get()));
    public static final ForgeTier MIGUELITIO = new ForgeTier(4, 1924, 8.5f, 4.5f, 16,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.MIGUELITIO_INGOT.get()));
}
