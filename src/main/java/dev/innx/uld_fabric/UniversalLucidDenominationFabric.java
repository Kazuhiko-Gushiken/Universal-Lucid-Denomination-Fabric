package dev.innx.uld_fabric;

import dev.innx.uld_fabric.item.ModItemGroups;
import dev.innx.uld_fabric.item.ModItems;
import dev.innx.uld_fabric.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniversalLucidDenominationFabric implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "uld_fabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();
		LOGGER.info("Hello Fabric world!");
	}
}