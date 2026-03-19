package kloud.item;

import kloud.bloomscript.projectiles.FlowerProjectile;
import kloud.bloomscript.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MagicWandItem extends Item {


    public MagicWandItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (!world.isClient) {
            FlowerProjectile projectile = new FlowerProjectile(world, user);

            projectile.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 4.5F, 0.5F);

            world.spawnEntity(projectile);

            // cooldown :D 20 ticks, 1 sec
            //user.getItemCooldownManager().set(this, 20);

        }

        if (world.isClient) {
            world.playSound(user, user.getBlockPos(), ModSounds.BLEWP, SoundCategory.PLAYERS, 5.0F, 1.0F);
        }

        return TypedActionResult.success(itemStack, world.isClient());

    }

}
