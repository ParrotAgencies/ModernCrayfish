package com.ModernCrayfish.objects.blocks;

import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class MedicineCabinetBlock extends ContainerBlock implements IWaterLoggable {

    public MedicineCabinetBlock(Properties properties){
        super(properties);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return null;
    }


    BarrelBlock

}
