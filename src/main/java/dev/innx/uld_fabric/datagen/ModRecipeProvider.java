package dev.innx.uld_fabric.datagen;

import dev.innx.uld_fabric.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_ULD, 1)
                .input(ModItems.COPPER_ULD).input(ModItems.COPPER_ULD).input(ModItems.COPPER_ULD).input(ModItems.COPPER_ULD).input(ModItems.COPPER_ULD).input(ModItems.COPPER_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_ULD, 1)
                .input(ModItems.BRONZE_ULD).input(ModItems.BRONZE_ULD).input(ModItems.BRONZE_ULD).input(ModItems.BRONZE_ULD).input(ModItems.BRONZE_ULD).input(ModItems.BRONZE_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_ULD, 1)
                .input(ModItems.SILVER_ULD).input(ModItems.SILVER_ULD).input(ModItems.SILVER_ULD).input(ModItems.SILVER_ULD).input(ModItems.SILVER_ULD).input(ModItems.SILVER_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_ULD, 1)
                .input(ModItems.GOLD_ULD).input(ModItems.GOLD_ULD).input(ModItems.GOLD_ULD).input(ModItems.GOLD_ULD).input(ModItems.GOLD_ULD).input(ModItems.GOLD_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PALLADIUM_ULD, 1)
                .input(ModItems.PLATINUM_ULD).input(ModItems.PLATINUM_ULD).input(ModItems.PLATINUM_ULD).input(ModItems.PLATINUM_ULD).input(ModItems.PLATINUM_ULD).input(ModItems.PLATINUM_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_ULD, 1)
                .input(ModItems.PALLADIUM_ULD).input(ModItems.PALLADIUM_ULD).input(ModItems.PALLADIUM_ULD).input(ModItems.PALLADIUM_ULD).input(ModItems.PALLADIUM_ULD).input(ModItems.PALLADIUM_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PALLADIUM_ULD, 6)
                .input(ModItems.MITHRIL_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_ULD, 6)
                .input(ModItems.PALLADIUM_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_ULD, 6)
                .input(ModItems.PLATINUM_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_ULD, 6)
                .input(ModItems.GOLD_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_ULD, 6)
                .input(ModItems.SILVER_ULD);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_ULD, 6)
                .input(ModItems.BRONZE_ULD);
    }
}
