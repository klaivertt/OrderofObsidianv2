package fr.klaivert.orderofobsidian.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties EMERALD_APPLE = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.8F).effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 400, 0), 1).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 800, 0), 1).alwaysEat().build();
    public static final FoodProperties OBSIDIAN_APPLE = (new FoodProperties.Builder()).nutrition(8).saturationMod(2F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0), 1).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0), 1).alwaysEat().build();
    public static final FoodProperties DIAMOND_APPLE = (new FoodProperties.Builder()).nutrition(14).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.REGENERATION, 1800, 2), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), 1).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 0), 1).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 0), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 4), 1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 1).alwaysEat().build();
    public static final FoodProperties NETHERITE_APPLE = (new FoodProperties.Builder()).nutrition(20).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 4), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 2), 1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2400, 2), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2800, 4), 1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 2), 1).alwaysEat().build();
    public static final FoodProperties CANDY_APPLE = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.8F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0), 1).alwaysEat().build();
    public static final FoodProperties PENDORITE_APPLE = (new FoodProperties.Builder()).nutrition(20).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 4), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 2), 1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 4), 1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1).alwaysEat().build();
    public static final FoodProperties OXYS_APPLE = (new FoodProperties.Builder()).nutrition(20).saturationMod(2.5F).effect(new MobEffectInstance(MobEffects.REGENERATION, 2500, 5), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 3), 1).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 2500, 3), 1).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 5), 1).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 3), 1).alwaysEat().build();
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties FRIED_EGG = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties COOKED_RICE = (new FoodProperties.Builder()).fast().nutrition(5).saturationMod(0.7f).build();
    public static final FoodProperties SUSHI = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.5f).build();
    public static final FoodProperties CHIPS = (new FoodProperties.Builder()).fast().nutrition(6).saturationMod(1f).build();
}
