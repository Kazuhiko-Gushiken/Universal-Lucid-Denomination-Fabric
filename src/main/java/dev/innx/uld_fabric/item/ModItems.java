package dev.innx.uld_fabric.item;

import dev.innx.uld_fabric.UniversalLucidDenominationFabric;
import dev.innx.uld_fabric.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COPPER_ULD = registerItem("copper_uld", new Item(new FabricItemSettings()));
    public static final Item BRONZE_ULD = registerItem("bronze_uld", new Item(new FabricItemSettings()));
    public static final Item SILVER_ULD = registerItem("silver_uld", new Item(new FabricItemSettings()));
    public static final Item GOLD_ULD = registerItem("gold_uld", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_ULD = registerItem("platinum_uld", new Item(new FabricItemSettings()));
    public static final Item PALLADIUM_ULD = registerItem("palladium_uld", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_ULD = registerItem("mithril_uld", new Item(new FabricItemSettings()));
    public static final Item ULD_PRONUNCIATION_MUSIC_DISC = registerItem("uld_pronunciation_music_disc",
            new MusicDiscItem(7, ModSounds.ULD_PRONUNCIATION, new FabricItemSettings().maxCount(1), 52));
    public static final Item AK_COIN = registerItem("ak_coin", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_ULD);
        entries.add(BRONZE_ULD);
        entries.add(SILVER_ULD);
        entries.add(GOLD_ULD);
        entries.add(PLATINUM_ULD);
        entries.add(PALLADIUM_ULD);
        entries.add(MITHRIL_ULD);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UniversalLucidDenominationFabric.MOD_ID, name), item);
    }
    public static void registerModItems() {
        UniversalLucidDenominationFabric.LOGGER.info("Regisering Mod Items for " + UniversalLucidDenominationFabric.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
