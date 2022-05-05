package fr.klaivert.orderofobsidian.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties FRIED_EGG = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties COOKED_RICE = (new FoodProperties.Builder()).fast().nutrition(5).saturationMod(0.7f).build();
    public static final FoodProperties SUSHI = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.5f).build();
    public static final FoodProperties CHIPS = (new FoodProperties.Builder()).fast().nutrition(6).saturationMod(1f).build();

}
