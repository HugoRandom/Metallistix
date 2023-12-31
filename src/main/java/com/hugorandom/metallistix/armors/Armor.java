package com.hugorandom.metallistix.armors;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Rarity;

public class Armor extends ArmorItem {
    public Armor(ArmorMaterial pMaterial, EquipmentSlot pSlot) {
        super(pMaterial, pSlot,
                new Properties()
                        .tab(ItemGroupTabs.METALLISTIX_TOOLS)
                        .rarity(Rarity.COMMON)
                        .stacksTo(1));
    }
}