package com.jumpwatch.tit.Utils;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;

public class BlockStates {
    public static final BooleanProperty PORT_DIRECTION = BooleanProperty.create("port_direction");
    public static final BooleanProperty ACTIVITY = BooleanProperty.create("active");
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.values());
}