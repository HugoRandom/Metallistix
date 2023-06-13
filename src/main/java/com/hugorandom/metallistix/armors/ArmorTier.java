package com.hugorandom.metallistix.armors;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.items.Items1Init;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ArmorTier implements ArmorMaterial {

    // Armaduras Normales - Standar Armors
    DISPROSIO("disprosio", 26, new int[]{3, 6, 8, 3}, 25,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.1F,
            () -> {return Ingredient.of(Items1Init.DISPROSIO_INGOT.get()); }),
    FRANITOLINA("franitolina", 30, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
            () -> { return Ingredient.of(Items1Init.FRANITOLINA_INGOT.get()); }),
    MELITONILA("melitonila", 30, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
            () -> { return Ingredient.of(Items1Init.MELITONILA_INGOT.get()); }),
    ALEZARITA("alezarita", 33, new int[]{3, 6, 8, 3}, 12,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.1F,
            () -> { return Ingredient.of(Items1Init.ALEZARITA_INGOT.get()); }),
    HALIX("halix", 34, new int[]{3, 6, 8, 3}, 13,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
            () -> { return Ingredient.of(Items1Init.HALIX_INGOT.get()); }),
    MIGUELITIO("miguelitio", 35, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
            () -> {return Ingredient.of(Items1Init.MIGUELITIO_INGOT.get()); }),

    // Armaduras Mejoradas - Uograded Armors
    DISPROSIO_UPGRADED("disprosio", 30, new int[]{4, 7, 9, 4}, 27,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F,
            () -> {return Ingredient.of(Items1Init.DISPROSIO_INGOT.get()); }),
    FRANITOLINA_UPGRADED("franitolina", 34, new int[]{4, 7, 9, 4}, 22,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> { return Ingredient.of(Items1Init.FRANITOLINA_INGOT.get()); }),
    MELITONILA_UPGRADED("melitonila", 34, new int[]{4, 7, 9, 4}, 17,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.0F,
            () -> { return Ingredient.of(Items1Init.MELITONILA_INGOT.get()); }),
    ALEZARITA_UPGRADED("alezarita", 37, new int[]{4, 7, 9, 4}, 14,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F,
            () -> { return Ingredient.of(Items1Init.ALEZARITA_INGOT.get()); }),
    HALIX_UPGRADED("halix", 39, new int[]{4, 7, 9, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> { return Ingredient.of(Items1Init.HALIX_INGOT.get()); }),
    MIGUELITIO_UPGRADED("miguelitio", 39, new int[]{4, 7, 9, 4}, 12,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F,
            () -> {return Ingredient.of(Items1Init.MIGUELITIO_INGOT.get()); });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ArmorTier(String pName, int pDurabilityMultiplier, int[] pSlotProtections,
                      int pEnchantmentValue, SoundEvent pSound, float pToughness,
                      float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return Metallistix.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}