package dev.innx.uld_fabric.datagen;

import dev.innx.uld_fabric.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COPPER_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_ULD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULD_PRONUNCIATION_MUSIC_DISC, Models.GENERATED);


    }
}
