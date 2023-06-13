package com.hugorandom.metallistix.world.dimensions;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
public class DimensionsInit {

    public static final ResourceKey<Level> MAPASHE_DIM_KEY =
            ResourceKey.create(Registry.DIMENSION_REGISTRY,
                    new ResourceLocation(Metallistix.MOD_ID, "mapashe"));

    public static final ResourceKey<DimensionType> METALLISTIX_DIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, MAPASHE_DIM_KEY.getRegistryName());

    public static void register(){
        System.out.println("Registering Dimensions for " + Metallistix.MOD_ID);
    }
}