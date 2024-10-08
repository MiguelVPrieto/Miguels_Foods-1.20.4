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

    public static final FoodProperties RICE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.9f)
            .build();

    public static final FoodProperties ONION = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100), 1.0f)
            .build();

    public static final FoodProperties GRAPE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100), 1.0f)
            .build();

    public static final FoodProperties BEAN = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f)
            .build();

    public static final FoodProperties LETTUCE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 1.0f)
            .build();

    public static final FoodProperties CABBAGE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 50), 1.0f)
            .build();

    public static final FoodProperties BEER = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600), 1.0f)
            .build();

    public static final FoodProperties TACO = new FoodProperties.Builder()
            .nutrition(8)
            .saturationMod(1.5f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 50), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f)
            .build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 50), 1.0f)
            .build();

    public static final FoodProperties BUTTER = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200), 1.0f)
            .build();

    public static final FoodProperties TOMATO_SAUCE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.5f)
            .build();

    public static final FoodProperties PIZZA = new FoodProperties.Builder()
            .nutrition(12)
            .saturationMod(2.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f)
            .build();

    public static final FoodProperties COXINHA = new FoodProperties.Builder()
            .nutrition(10)
            .saturationMod(2.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f)
            .build();

    public static final FoodProperties BRIGADEIRO = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(1.5f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1200), 1.0f)
            .build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(1.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200), 1.0f)
            .build();

    public static final FoodProperties CHOCOLATE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(1.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 300), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1.0f)
            .build();
}
