package kloud.bloomscript.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent BLEWP = registerSoundEvent("blewp");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of("bloomscript", name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        // Just to initialize the class
    }
}
