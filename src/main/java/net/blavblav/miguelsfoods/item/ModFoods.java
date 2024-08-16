package net.blavblav.miguelsfoods.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COCONUT = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f)
            .build();

    public static final FoodProperties OPENED_COCONUT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300), 1.0f)
            .build();

    public static final FoodProperties COCONUT_WATER = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 100), 1.0f)
            .build();
}
