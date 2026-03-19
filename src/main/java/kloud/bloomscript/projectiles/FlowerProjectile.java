package kloud.bloomscript.projectiles;

import kloud.bloomscript.entities.ModEntities;
import kloud.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class FlowerProjectile extends ThrownItemEntity {

    public FlowerProjectile(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public FlowerProjectile(World world, LivingEntity owner) {
        // You will need to register this EntityType in your ModEntities class!
        super(ModEntities.FLOWER_PROJECTILE, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.MAGIC_PETAL;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity target = entityHitResult.getEntity();
        target.damage(this.getWorld().getDamageSources().thrown(this, this.getOwner()), 10.0F);
    }
}
