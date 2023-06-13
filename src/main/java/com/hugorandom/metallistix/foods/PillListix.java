package com.hugorandom.metallistix.foods;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PillListix extends Item {

    public PillListix() {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .food(Unstable())
                .tab(ItemGroupTabs.METALLISTIX_FOODS));
    }

    public static FoodProperties Unstable(){
        return new FoodProperties.Builder()
                .nutrition(2)
                .saturationMod(0.2f)
                .alwaysEat()
                .fast()
                .build();
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent(
                "tooltip.metallistix." + pStack.getItem().asItem()));
    }
}