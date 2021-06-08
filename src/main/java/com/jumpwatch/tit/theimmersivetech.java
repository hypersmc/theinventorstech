package com.jumpwatch.tit;

import com.jumpwatch.tit.Registry.BlockRegistry;
import com.jumpwatch.tit.Registry.TileentityRegistry;
import com.jumpwatch.tit.Registry.theimmersiveregistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("theimmersivetech")
public class theimmersivetech
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "theimmersivetech";
    public theimmersivetech() {
        LOGGER.info("Starting Registry");
        theimmersiveregistry.register();
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, BlockRegistry::registerItems);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, BlockRegistry::registerBlocks);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(TileEntityType.class, TileentityRegistry::registerTileEntities);
        MinecraftForge.EVENT_BUS.register(this);
    }


}
