package com.hugorandom.metallistix.armors;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArmorsInit {

    public static final DeferredRegister<Item> ARMORS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Metallistix.MOD_ID);

    public static void register(IEventBus eventBus){ ARMORS.register(eventBus); }

    // Cascos - Helmets
    public static final RegistryObject<Item> DISPROSIO_HELMET =
            ARMORS.register("disprosio_helmet",
            () -> new Armor(ArmorTier.DISPROSIO, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> FRANITOLINA_HELMET =
            ARMORS.register("franitolina_helmet",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MELITONILA_HELMET =
            ARMORS.register("melitonila_helmet",
            () -> new Armor(ArmorTier.MELITONILA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ALEZARITA_HELMET =
            ARMORS.register("alezarita_helmet",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> HALIX_HELMET =
            ARMORS.register("halix_helmet",
            () -> new Armor(ArmorTier.HALIX, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MIGUELITIO_HELMET =
            ARMORS.register("miguelitio_helmet",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.HEAD));

    // Pecheras/Petos - Chestplate
    public static final RegistryObject<Item> DISPROSIO_CHESTPLATE =
            ARMORS.register("disprosio_chestplate",
            () -> new Armor(ArmorTier.DISPROSIO, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> FRANITOLINA_CHESTPLATE =
            ARMORS.register("franitolina_chestplate",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MELITONILA_CHESTPLATE =
            ARMORS.register("melitonila_chestplate",
            () -> new Armor(ArmorTier.MELITONILA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ALEZARITA_CHESTPLATE =
            ARMORS.register("alezarita_chestplate",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> HALIX_CHESTPLATE =
            ARMORS.register("halix_chestplate",
            () -> new Armor(ArmorTier.HALIX, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MIGUELITIO_CHESTPLATE =
            ARMORS.register("miguelitio_chestplate",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.CHEST));

    // Pantalones - Leggings
    public static final RegistryObject<Item> DISPROSIO_LEGGINGS =
            ARMORS.register("disprosio_leggings",
            () -> new Armor(ArmorTier.DISPROSIO, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> FRANITOLINA_LEGGINGS =
            ARMORS.register("franitolina_leggings",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MELITONILA_LEGGINGS =
            ARMORS.register("melitonila_leggings",
            () -> new Armor(ArmorTier.MELITONILA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ALEZARITA_LEGGINGS =
            ARMORS.register("alezarita_leggings",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> HALIX_LEGGINGS =
            ARMORS.register("halix_leggings",
            () -> new Armor(ArmorTier.HALIX, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MIGUELITIO_LEGGINGS =
            ARMORS.register("miguelitio_leggings",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.LEGS));

    // Botas - Boots
    public static final RegistryObject<Item> DISPROSIO_BOOTS =
            ARMORS.register("disprosio_boots",
            () -> new Armor(ArmorTier.DISPROSIO, EquipmentSlot.FEET));
    public static final RegistryObject<Item> FRANITOLINA_BOOTS =
            ARMORS.register("franitolina_boots",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MELITONILA_BOOTS =
            ARMORS.register("melitonila_boots",
            () -> new Armor(ArmorTier.MELITONILA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> ALEZARITA_BOOTS =
            ARMORS.register("alezarita_boots",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> HALIX_BOOTS =
            ARMORS.register("halix_boots",
            () -> new Armor(ArmorTier.HALIX, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MIGUELITIO_BOOTS =
            ARMORS.register("miguelitio_boots",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.FEET));

    // Cascos mejorados - Helmets upgraded
    public static final RegistryObject<Item> DISPROSIO_HELMET_UPGRADED =
            ARMORS.register("disprosio_helmet_upgraded",
            () -> new ArmorU(ArmorTier.DISPROSIO_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> FRANITOLINA_HELMET_UPGRADED =
            ARMORS.register("franitolina_helmet_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MELITONILA_HELMET_UPGRADED =
            ARMORS.register("melitonila_helmet_upgraded",
            () -> new ArmorU(ArmorTier.MELITONILA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ALEZARITA_HELMET_UPGRADED =
            ARMORS.register("alezarita_helmet_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> HALIX_HELMET_UPGRADED =
            ARMORS.register("halix_helmet_upgraded",
            () -> new ArmorU(ArmorTier.HALIX_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MIGUELITIO_HELMET_UPGRADED =
            ARMORS.register("miguelitio_helmet_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.HEAD));

    // Pecheras/Petos Mejoradas - Chestplate upgraded
    public static final RegistryObject<Item> DISPROSIO_CHESTPLATE_UPGRADED =
            ARMORS.register("disprosio_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.DISPROSIO_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> FRANITOLINA_CHESTPLATE_UPGRADED =
            ARMORS.register("franitolina_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MELITONILA_CHESTPLATE_UPGRADED =
            ARMORS.register("melitonila_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.MELITONILA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ALEZARITA_CHESTPLATE_UPGRADED =
            ARMORS.register("alezarita_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> HALIX_CHESTPLATE_UPGRADED =
            ARMORS.register("halix_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.HALIX_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MIGUELITIO_CHESTPLATE_UPGRADED =
            ARMORS.register("miguelitio_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.CHEST));

    // Pantalones Mejorados - Leggings upgraded
    public static final RegistryObject<Item> DISPROSIO_LEGGINGS_UPGRADED =
            ARMORS.register("disprosio_leggings_upgraded",
            () -> new ArmorU(ArmorTier.DISPROSIO_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> FRANITOLINA_LEGGINGS_UPGRADED =
            ARMORS.register("franitolina_leggings_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MELITONILA_LEGGINGS_UPGRADED =
            ARMORS.register("melitonila_leggings_upgraded",
            () -> new ArmorU(ArmorTier.MELITONILA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ALEZARITA_LEGGINGS_UPGRADED =
            ARMORS.register("alezarita_leggings_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> HALIX_LEGGINGS_UPGRADED =
            ARMORS.register("halix_leggings_upgraded",
            () -> new ArmorU(ArmorTier.HALIX_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MIGUELITIO_LEGGINGS_UPGRADED =
            ARMORS.register("miguelitio_leggings_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.LEGS));

    // Botas Mejoradas - Boots upgraded
    public static final RegistryObject<Item> DISPROSIO_BOOTS_UPGRADED =
            ARMORS.register("disprosio_boots_upgraded",
            () -> new ArmorU(ArmorTier.DISPROSIO_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> FRANITOLINA_BOOTS_UPGRADED =
            ARMORS.register("franitolina_boots_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MELITONILA_BOOTS_UPGRADED =
            ARMORS.register("melitonila_boots_upgraded",
            () -> new ArmorU(ArmorTier.MELITONILA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> ALEZARITA_BOOTS_UPGRADED =
            ARMORS.register("alezarita_boots_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> HALIX_BOOTS_UPGRADED =
            ARMORS.register("halix_boots_upgraded",
            () -> new ArmorU(ArmorTier.HALIX_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MIGUELITIO_BOOTS_UPGRADED =
            ARMORS.register("miguelitio_boots_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.FEET));
}