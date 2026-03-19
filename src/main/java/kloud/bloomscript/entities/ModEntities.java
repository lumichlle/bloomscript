package kloud.bloomscript.entities;

import kloud.bloomscript.projectiles.FlowerProjectile;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FlowerProjectile> FLOWER_PROJECTILE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("bloomscript", "flower_projectile"),
            EntityType.Builder.<FlowerProjectile>create(FlowerProjectile::new, SpawnGroup.MISC)
                    .dimensions(0.25F, 0.25F) // How big is the hit-box?
                    .maxTrackingRange(10)      // How far away can players see it?
                    .trackingTickInterval(10) // How often does it update position?
                    .build()
    );

    // 2. A method to call in your Main Mod class to "wake up" this registry
    public static void registerModEntities() {
        // This can technically be empty, calling it just ensures the static fields above are loaded
    }
}
