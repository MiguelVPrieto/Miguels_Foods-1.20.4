package net.blavblav.miguelsfoods.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COCONUT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f)
            .build();
}
