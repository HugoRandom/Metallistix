package com.hugorandom.metallistix.items;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.sounds.SoundsInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class Items2Init {

    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Metallistix.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<net.minecraft.world.item.Item> DISPROSIO_DISC =
            ITEMS.register("disprosio_disc", () -> 
                    new DiscItem(1, SoundsInit.DISPROSIO_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_DISC =
            ITEMS.register("franitolina_disc", () -> 
                    new DiscItem(1, SoundsInit.FRANITOLINA_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> MELITONILA_DISC =
            ITEMS.register("melitonila_disc", () -> 
                    new DiscItem(1, SoundsInit.MELITONILA_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_DISC =
            ITEMS.register("alezarita_disc", () -> 
                    new DiscItem(1, SoundsInit.ALEZARITA_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> HALIX_DISC =
            ITEMS.register("halix_disc", () -> 
                    new DiscItem(1, SoundsInit.HALIX_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_DISC =
            ITEMS.register("miguelitio_disc", () -> 
                    new DiscItem(1, SoundsInit.MIGUELITIO_DISC));

    public static final RegistryObject<Item> UMC = ITEMS.register("umc",
            UMCItem::new);
    public static final RegistryObject<Item> METALLISTIX_AMULET = ITEMS.register("metallistix_amulet",
            AmuletItem::new);
    public static final RegistryObject<Item> DIMENSIONAL_RESONATOR = ITEMS.register("dimensional_resonator",
            TeleporterItem::new);
}
