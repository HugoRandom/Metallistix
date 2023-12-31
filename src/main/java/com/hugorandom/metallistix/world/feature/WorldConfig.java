package com.hugorandom.metallistix.world.feature;

import com.hugorandom.metallistix.blocks.BlocksInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class WorldConfig {

    public static final List<OreConfiguration.TargetBlockState> DISPROSIO_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.DISPROSIO_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_DISPROSIO_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> FRANITOLINA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.FRANITOLINA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_FRANITOLINA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> MELITONILA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.MELITONILA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_MELITONILA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ALEZARITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, BlocksInit.ALEZARITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> HALIX_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, BlocksInit.HALIX_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> MIGUELITIO_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, BlocksInit.MIGUELITIO_ORE.get().defaultBlockState())
    );

    // Flores - Flowers
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SOLIMA =
            FeatureUtils.register("flower_solima", Feature.FLOWER,
                    new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksInit.SOLIMA.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_FERMIN =
            FeatureUtils.register("flower_fermin", Feature.FLOWER,
                    new RandomPatchConfiguration(10, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksInit.FERMIN.get())))));

    // Minerales - Ores
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DISPROSIO_ORE =
            FeatureUtils.register("disprosio_ore", Feature.ORE, new OreConfiguration(DISPROSIO_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FRANITOLINA_ORE =
            FeatureUtils.register("franitolina_ore", Feature.ORE, new OreConfiguration(FRANITOLINA_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MELITONILA_ORE =
            FeatureUtils.register("melitonila_ore", Feature.ORE, new OreConfiguration(MELITONILA_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALEZARITA_ORE =
            FeatureUtils.register("alezarita_ore", Feature.ORE, new OreConfiguration(ALEZARITA_SPAWN, 2));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HALIX_ORE =
            FeatureUtils.register("halix_ore", Feature.ORE, new OreConfiguration(HALIX_SPAWN, 2));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MIGUELITIO_ORE =
            FeatureUtils.register("miguelitio_ore", Feature.ORE, new OreConfiguration(MIGUELITIO_SPAWN, 2));
}
