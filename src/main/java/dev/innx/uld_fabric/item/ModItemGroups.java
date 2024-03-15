package dev.innx.uld_fabric.item;

import dev.innx.uld_fabric.UniversalLucidDenominationFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ULD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(UniversalLucidDenominationFabric.MOD_ID, "uld"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.uld_fabric"))
                    .icon(() -> new ItemStack(ModItems.MITHRIL_ULD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_ULD);
                        entries.add(ModItems.BRONZE_ULD);
                        entries.add(ModItems.SILVER_ULD);
                        entries.add(ModItems.GOLD_ULD);
                        entries.add(ModItems.PLATINUM_ULD);
                        entries.add(ModItems.PALLADIUM_ULD);
                        entries.add(ModItems.MITHRIL_ULD);
                        entries.add(ModItems.ULD_PRONUNCIATION_MUSIC_DISC);
    }).build());

    public static void registerItemGroups() {
        UniversalLucidDenominationFabric.LOGGER.info("Registering Item Groups for " + UniversalLucidDenominationFabric.MOD_ID);
    }
}
