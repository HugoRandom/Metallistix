package com.hugorandom.metallistix.foods;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PillDouble extends Item {

    public PillDouble(MobEffect effect, int duration, int amplifier) {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .food(PILLS(effect, duration, amplifier))
                .tab(ItemGroupTabs.METALLISTIX_FOODS));
    }

    public static FoodProperties PILLS(MobEffect pEffect, int duration, int amplifier){
        return new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(pEffect, duration, amplifier), 1.0f)
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
