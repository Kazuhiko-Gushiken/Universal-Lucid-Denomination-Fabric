package dev.innx.uld_fabric.sound;

import dev.innx.uld_fabric.UniversalLucidDenominationFabric;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent ULD_PRONUNCIATION = registerSoundEvent("uld_pronunciation");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(UniversalLucidDenominationFabric.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        UniversalLucidDenominationFabric.LOGGER.info("Registering Sounds for " + UniversalLucidDenominationFabric.MOD_ID);
    }
}
