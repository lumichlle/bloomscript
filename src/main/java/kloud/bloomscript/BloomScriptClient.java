package kloud.bloomscript;

import kloud.bloomscript.entities.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class BloomScriptClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.FLOWER_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
