package com.hugorandom.metallistix.items;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GemItem extends Item{

    public GemItem() {
        super(new Item.Properties()
                .tab(ItemGroupTabs.METALLISTIX_ITEMS)
                .rarity(Rarity.UNCOMMON)
                .stacksTo(16)
                .setNoRepair());
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.metallistix.gem"));
    }
}
