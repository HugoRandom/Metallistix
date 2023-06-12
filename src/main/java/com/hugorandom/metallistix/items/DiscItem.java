package com.hugorandom.metallistix.items;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

import java.util.function.Supplier;

public class DiscItem extends RecordItem {

    public DiscItem(int comparatorValue, Supplier<SoundEvent> soundSupplier) {
        super(comparatorValue, soundSupplier,
                new Properties()
                        .tab(ItemGroupTabs.METALLISTIX_ITEMS)
                        .rarity(Rarity.COMMON)
                        .stacksTo(1)
                        .setNoRepair());
    }
}
