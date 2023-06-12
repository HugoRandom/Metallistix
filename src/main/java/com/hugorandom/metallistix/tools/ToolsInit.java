package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolsInit {

    public static final DeferredRegister<Item> TOOLS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Metallistix.MOD_ID);

    public static void register(IEventBus eventBus){ TOOLS.register(eventBus); };

    // Espadas - Swords
    public static final RegistryObject<Item> DISPROSIO_SWORD = TOOLS.register("disprosio_sword",
            () -> new Sword(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_SWORD = TOOLS.register("franitolina_sword",
            () -> new Sword(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELUNA_SWORD = TOOLS.register("meluna_sword",
            () -> new Sword(ToolsTier.MELUNA));
    public static final RegistryObject<Item> ALEZARITA_SWORD = TOOLS.register("alezarita_sword",
            () -> new Sword(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALIX_SWORD = TOOLS.register("halix_sword",
            () -> new Sword(ToolsTier.HALIX));
    public static final RegistryObject<Item> MIGUELITIO_SWORD = TOOLS.register("miguelitio_sword",
            () -> new Sword(ToolsTier.MIGUELITIO));

    // Picos - Pickaxes
    public static final RegistryObject<Item> DISPROSIO_PICKAXE = TOOLS.register("disprosio_pickaxe",
            () -> new Pickaxe(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_PICKAXE = TOOLS.register("franitolina_pickaxe",
            () -> new Pickaxe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELUNA_PICKAXE = TOOLS.register("meluna_pickaxe",
            () -> new Pickaxe(ToolsTier.MELUNA));
    public static final RegistryObject<Item> ALEZARITA_PICKAXE = TOOLS.register("alezarita_pickaxe",
            () -> new Pickaxe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALIX_PICKAXE = TOOLS.register("halix_pickaxe",
            () -> new Pickaxe(ToolsTier.HALIX));
    public static final RegistryObject<Item> MIGUELITIO_PICKAXE = TOOLS.register("miguelitio_pickaxe",
            () -> new Pickaxe(ToolsTier.MIGUELITIO));

    // Hachas - Axes
    public static final RegistryObject<Item> DISPROSIO_AXE = TOOLS.register("disprosio_axe",
            () -> new Axe(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_AXE = TOOLS.register("franitolina_axe",
            () -> new Axe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELUNA_AXE = TOOLS.register("meluna_axe",
            () -> new Axe(ToolsTier.MELUNA));
    public static final RegistryObject<Item> ALEZARITA_AXE = TOOLS.register("alezarita_axe",
            () -> new Axe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALIX_AXE = TOOLS.register("halix_axe",
            () -> new Axe(ToolsTier.HALIX));
    public static final RegistryObject<Item> MIGUELITIO_AXE = TOOLS.register("miguelitio_axe",
            () -> new Axe(ToolsTier.MIGUELITIO));

    // Palas - Shovels
    public static final RegistryObject<Item> DISPROSIO_SHOVEL = TOOLS.register("disprosio_shovel",
            () -> new Shovel(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_SHOVEL = TOOLS.register("franitolina_shovel",
            () -> new Shovel(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELUNA_SHOVEL = TOOLS.register("meluna_shovel",
            () -> new Shovel(ToolsTier.MELUNA));
    public static final RegistryObject<Item> ALEZARITA_SHOVEL = TOOLS.register("alezarita_shovel",
            () -> new Shovel(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALIX_SHOVEL = TOOLS.register("halix_shovel",
            () -> new Shovel(ToolsTier.HALIX));
    public static final RegistryObject<Item> MIGUELITIO_SHOVEL = TOOLS.register("miguelitio_shovel",
            () -> new Shovel(ToolsTier.MIGUELITIO));

    // Azadas - Hoes
    public static final RegistryObject<Item> DISPROSIO_HOE = TOOLS.register("disprosio_hoe",
            () -> new Hoe(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_HOE = TOOLS.register("franitolina_hoe",
            () -> new Hoe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELUNA_HOE = TOOLS.register("meluna_hoe",
            () -> new Hoe(ToolsTier.MELUNA));
    public static final RegistryObject<Item> ALEZARITA_HOE = TOOLS.register("alezarita_hoe",
            () -> new Hoe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALIX_HOE = TOOLS.register("halix_hoe",
            () -> new Hoe(ToolsTier.HALIX));
    public static final RegistryObject<Item> MIGUELITIO_HOE = TOOLS.register("miguelitio_hoe",
            () -> new Hoe(ToolsTier.MIGUELITIO));
}
