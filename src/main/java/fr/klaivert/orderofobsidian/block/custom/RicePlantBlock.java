package fr.klaivert.orderofobsidian.block.custom;

import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class RicePlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public RicePlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.RICE_SEEDS.get();
    }
}
