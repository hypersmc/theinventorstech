package com.jumpwatch.tit.Blocks.Machines.Multiblocks.CoreDrill.Blocks;

import com.jumpwatch.tit.Blocks.Machines.Multiblocks.CoreDrill.Base.MinerBaseBlock;
import com.jumpwatch.tit.Blocks.Machines.Multiblocks.CoreDrill.Tiles.MinerPowerTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


import static com.jumpwatch.tit.Blocks.Machines.Multiblocks.CoreDrill.Blocks.MinerPowerBlock.ConnectionState.*;
import net.minecraft.block.AbstractBlock.Properties;

public class MinerPowerBlock extends MinerBaseBlock {

    public static MinerPowerBlock INSTANCE;
    public MinerPowerBlock(Properties properties){
        super();
        //registerDefaultState(defaultBlockState().setValue(CONNECTION_STATE_ENUM_PROPERTY, DISCONNECTED));

    }
    public enum ConnectionState implements IStringSerializable {
        CONNECTED,
        DISCONNECTED;

        public static final EnumProperty<ConnectionState> CONNECTION_STATE_ENUM_PROPERTY = EnumProperty.create("connectionstate", ConnectionState.class);

        @Override
        public String getSerializedName() {
            return toString().toLowerCase();
        }
    }

    @Override
    protected void createBlockStateDefinition(@Nonnull StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(CONNECTION_STATE_ENUM_PROPERTY);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new MinerPowerTile();
    }

    @Override
    public boolean isGoodForExterior() {
        return true;
    }
}
