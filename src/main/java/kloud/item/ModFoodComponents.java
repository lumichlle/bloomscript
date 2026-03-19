package kloud.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent MAGIC_SOUP = new FoodComponent.Builder().snack().alwaysEdible().nutrition(10).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 500), 1.0f).build();
}
