package com.hugorandom.metallistix.util;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.screens.slots.recipes.UpgradingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Recipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Metallistix.MOD_ID);

    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }

    public static final RegistryObject<RecipeSerializer<UpgradingRecipe>> UPGRADING_SERIALIZER =
            SERIALIZERS.register("upgrading", () -> UpgradingRecipe.Serializer.INSTANCE);
}
