package com.hugorandom.metallistix.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class OrePlaced {

    public static final Holder<PlacedFeature> SOLIMA_PLACED = PlacementUtils.register("solima_placed",
            WorldConfig.FLOWER_SOLIMA, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DISPROSIO_PLACED = PlacementUtils.register("disprosio_placed",
            WorldConfig.DISPROSIO_ORE, OreConfig.commonOrePlacement(10, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(50))));
    public static final Holder<PlacedFeature> FRANITOLINA_PLACED = PlacementUtils.register("franitolina_placed",
            WorldConfig.FRANITOLINA_ORE, OreConfig.commonOrePlacement(7, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(64))));
    public static final Holder<PlacedFeature> ALEZARITA_PLACED = PlacementUtils.register("alezarita_placed",
            WorldConfig.ALEZARITA_ORE, OreConfig.commonOrePlacement(10, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(5),VerticalAnchor.absolute(115))));
    public static final Holder<PlacedFeature> HALIX_PLACED = PlacementUtils.register("halix_placed",
            WorldConfig.HALIX_ORE, OreConfig.commonOrePlacement(10, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(5),VerticalAnchor.absolute(115))));
    public static final Holder<PlacedFeature> MIGUELITIO_PLACED = PlacementUtils.register("miguelitio_placed",
            WorldConfig.MIGUELITIO_ORE, OreConfig.commonOrePlacement(9, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(5),VerticalAnchor.absolute(100))));
}
