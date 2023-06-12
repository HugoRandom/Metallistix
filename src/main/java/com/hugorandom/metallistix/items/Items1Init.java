package com.hugorandom.metallistix.items;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items1Init {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Metallistix.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    // Lingotes - Ingots
    public static final RegistryObject<Item> DISPROSIO_INGOT =
            ITEMS.register("disprosio_ingot", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_INGOT =
            ITEMS.register("franitolina_ingot", CommonItem::new);
    public static final RegistryObject<Item> MELUNA_INGOT =
            ITEMS.register("meluna_ingot", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_INGOT =
            ITEMS.register("alezarita_ingot", CommonItem::new);
    public static final RegistryObject<Item> HALIX_INGOT =
            ITEMS.register("halix_ingot", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_INGOT =
            ITEMS.register("miguelitio_ingot", CommonItem::new);

    // Pepitas
    public static final RegistryObject<Item> DISPROSIO_NUGGET =
            ITEMS.register("disprosio_nugget", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_NUGGET =
            ITEMS.register("franitolina_nugget", CommonItem::new);
    public static final RegistryObject<Item> MELUNA_NUGGET =
            ITEMS.register("meluna_nugget", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_NUGGET =
            ITEMS.register("alezarita_nugget", CommonItem::new);
    public static final RegistryObject<Item> HALIX_NUGGET =
            ITEMS.register("halix_nugget", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_NUGGET =
            ITEMS.register("miguelitio_nugget", CommonItem::new);

    // Mineral en Bruto - RAW
    public static final RegistryObject<Item> RAW_DISPROSIO =
            ITEMS.register("raw_disprosio", CommonItem::new);
    public static final RegistryObject<Item> RAW_FRANITOLINA =
            ITEMS.register("raw_franitolina", CommonItem::new);
    public static final RegistryObject<Item> RAW_MELUNA =
            ITEMS.register("raw_meluna", CommonItem::new);
    public static final RegistryObject<Item> RAW_ALEZARITA =
            ITEMS.register("raw_alezarita", CommonItem::new);
    public static final RegistryObject<Item> RAW_HALIX =
            ITEMS.register("raw_halix", CommonItem::new);
    public static final RegistryObject<Item> RAW_MIGUELITIO =
            ITEMS.register("raw_miguelitio", CommonItem::new);

    // Polvos No españoles
    public static final RegistryObject<Item> DISPROSIO_DUST =
            ITEMS.register("disprosio_dust", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_DUST =
            ITEMS.register("franitolina_dust", CommonItem::new);
    public static final RegistryObject<Item> MELUNA_DUST =
            ITEMS.register("meluna_dust", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_DUST =
            ITEMS.register("alezarita_dust", CommonItem::new);
    public static final RegistryObject<Item> HALIX_DUST =
            ITEMS.register("halix_dust", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_DUST =
            ITEMS.register("miguelitio_dust", CommonItem::new);

    // Gemas
    public static final RegistryObject<Item> DISPROSIO_GEM =
            ITEMS.register("disprosio_gem", GemItem::new);
    public static final RegistryObject<Item> FRANITOLINA_GEM =
            ITEMS.register("franitolina_gem", GemItem::new);
    public static final RegistryObject<Item> MELUNA_GEM =
            ITEMS.register("meluna_gem", GemItem::new);
    public static final RegistryObject<Item> ALEZARITA_GEM =
            ITEMS.register("alezarita_gem", GemItem::new);
    public static final RegistryObject<Item> HALIX_GEM =
            ITEMS.register("halix_gem", GemItem::new);
    public static final RegistryObject<Item> MIGUELITIO_GEM =
            ITEMS.register("miguelitio_gem", GemItem::new);

}
