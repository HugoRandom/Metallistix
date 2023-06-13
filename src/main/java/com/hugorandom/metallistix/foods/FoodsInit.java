package com.hugorandom.metallistix.foods;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodsInit {

    public static final DeferredRegister<Item> FOODS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Metallistix.MOD_ID);
    public static void register(IEventBus eventBus){
        FOODS.register(eventBus);
    }

    // Comidas iniciales
    public static final RegistryObject<Item> DISPROSIO_CAKE = FOODS.register("disprosio_cake",() ->
            new EffectFood(MobEffects.FIRE_RESISTANCE, 600, 0, 10, 0.6f));
    public static final RegistryObject<Item> FRAOPU = FOODS.register("fraopu",() ->
            new EffectFood(MobEffects.REGENERATION, 400, 0, 6, 1.0f));
    public static final RegistryObject<Item> ALEZARITA_CHICKEN = FOODS.register("alezarita_chicken",() ->
            new EffectFood(MobEffects.FIRE_RESISTANCE, 600, 0, 11, 0.9f));
    public static final RegistryObject<Item> HALIX_SMOOTHIE = FOODS.register("halix_smoothie",
            Smoothie::new);
    public static final RegistryObject<Item> PEPENNE = FOODS.register("pepenne",
            Pepenne::new);

    // Manzanas
    public static final RegistryObject<Item> DISPROSIO_APPLE = FOODS.register("disprosio_apple", () ->
            new Apples(2000));
    public static final RegistryObject<Item> FRANITOLINA_APPLE = FOODS.register("franitolina_apple", () ->
            new Apples(2100));
    public static final RegistryObject<Item> MELITONILA_APPLE = FOODS.register("melitonila_apple", () ->
            new Apples(2200));
    public static final RegistryObject<Item> ALEZARITA_APPLE = FOODS.register("alezarita_apple", () ->
            new Apples(3000));
    public static final RegistryObject<Item> HALIX_APPLE = FOODS.register("halix_apple", () ->
            new Apples(3000));
    public static final RegistryObject<Item> MIGUELITIO_APPLE = FOODS.register("miguelitio_apple", () ->
            new Apples(3000));

    // Pildoras normales
    public static final RegistryObject<Item> BLANK_PILL = FOODS.register("blank_pill", ()->
            new Pill(MobEffects.HUNGER, 600, 0));
    public static final RegistryObject<Item> DISPROSIO_PILL = FOODS.register("disprosio_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> FRANITOLINA_PILL = FOODS.register("franitolina_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> MELITONILA_PILL = FOODS.register("melitonila_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> ALEZARITA_PILL = FOODS.register("alezarita_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> HALIX_PILL = FOODS.register("halix_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> MIGUELITIO_PILL = FOODS.register("miguelitio_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));

    // Pildoras fuertes
    public static final RegistryObject<Item> C42_PILL = FOODS.register("c42_pill", ()->
            new PillDouble(MobEffects.FIRE_RESISTANCE, 1200, 0));    // Disprosio
    public static final RegistryObject<Item> L7_PILL = FOODS.register("l7_pill", ()->
            new PillDouble(MobEffects.LUCK, 2400, 1));               // Franitolina
    public static final RegistryObject<Item> I12_PILL = FOODS.register("i12_pill", ()->
            new PillDouble(MobEffects.SATURATION, 600, 0));          // Melitonila
    public static final RegistryObject<Item> A24_PILL = FOODS.register("a24_pill", ()->
            new PillDouble(MobEffects.WATER_BREATHING, 1200, 0));    // Alezarita
    public static final RegistryObject<Item> F50_PILL = FOODS.register("f50_pill", ()->
            new PillDouble(MobEffects.DIG_SPEED, 600, 1));           // Halix
    public static final RegistryObject<Item> P2_PILL = FOODS.register("p2_pill", ()->
            new PillDouble(MobEffects.DOLPHINS_GRACE, 1200, 0));     // Miguelitio

    public static final RegistryObject<Item> LISTIX_PILL = FOODS.register("listix_pill", PillListix::new);

    // Cafes
    public static final RegistryObject<Item> COFFEE_CHEMICAL = FOODS.register("coffee_chemical", ()->
            new EffectFood(MobEffects.CONFUSION, 80, 0, 1, 0.1F));
    public static final RegistryObject<Item> COFFEE_CUP = FOODS.register("coffee_cup", ()->
            new EffectFood(MobEffects.POISON, 100, 0,1, 0.1F));
    public static final RegistryObject<Item> COFFEE_ESPRESSO = FOODS.register("coffee_espresso", ()->
            new Coffees(7, 0.6F));
    public static final RegistryObject<Item> COFFEE_AMERICANO = FOODS.register("coffee_americano", ()->
            new Coffees(8, 0.6F));
    public static final RegistryObject<Item> COFFEE_LATTE = FOODS.register("coffee_latte", ()->
            new Coffees(9, 0.7F));
    public static final RegistryObject<Item> COFFEE_LUNGO = FOODS.register("coffee_lungo", ()->
            new Coffees(9, 0.8F));
    public static final RegistryObject<Item> COFFEE_CAPPUCCINO = FOODS.register("coffee_cappuccino", ()->
            new Coffees(10, 0.7F));
    public static final RegistryObject<Item> COFFEE_BOMBON = FOODS.register("coffee_bombon", ()->
            new Coffees(7, 0.9F));
    public static final RegistryObject<Item> COFFEE_CAFELECHE = FOODS.register("coffee_cafeleche", ()->
            new Coffees(8, 0.7F));
    public static final RegistryObject<Item> COFFEE_IRISH = FOODS.register("coffee_irish", ()->
            new Coffees(10, 0.8F));
    public static final RegistryObject<Item> COFFEE_MOCCA = FOODS.register("coffee_mocca", ()->
            new Coffees(11, 1F));
    public static final RegistryObject<Item> COFFEE_CARAJILLO = FOODS.register("coffee_carajillo", ()->
            new Coffees(8, 0.9F));
}