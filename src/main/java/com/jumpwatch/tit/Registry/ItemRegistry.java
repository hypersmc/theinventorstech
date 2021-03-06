package com.jumpwatch.tit.Registry;


import com.jumpwatch.tit.Items.ItemSolarCell;
import com.jumpwatch.tit.Items.item.ItemCrushedCopper;
import com.jumpwatch.tit.Items.item.ItemIronPlate;
import com.jumpwatch.tit.Items.ItemVoltmeter;
import com.jumpwatch.tit.Items.ItemWrench;
import com.jumpwatch.tit.Items.item.ItemRawCasserite;
import com.jumpwatch.tit.Items.item.ItemRawRutile;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;

public class ItemRegistry {

    static void register() {}


    //Item list
    /*
     * Example:
     *
     *   public static final RegistryObject<Item> testitem = globalreg.ITEMS.register("test_item", () -> new testItem(new Item.Properties().durability(300)));
     */
    //public static final RegistryObject<Item> CopperItem =  theinventorsregistry.ITEMS.register("copper_ore", () -> new BlockItem(BlockRegistry.BlockCopperOre.get(), new Item.Properties().tab()))

    public static final ItemWrench WRENCH = new ItemWrench();
    public static final ItemVoltmeter VOLTMETER = new ItemVoltmeter();
    public static final ItemIronPlate ITEM_IRON_PLATE = new ItemIronPlate();
    public static final ItemCrushedCopper ItemCrushedCopper = new ItemCrushedCopper();
    public static final ItemRawCasserite ItemRawCasserite = new ItemRawCasserite();
    public static final ItemRawRutile ItemRawRutile = new ItemRawRutile();
    public static final ItemSolarCell ItemSolarCell = new ItemSolarCell();
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                WRENCH,
                VOLTMETER,
                ITEM_IRON_PLATE,
                ItemCrushedCopper,
                ItemSolarCell,
                ItemRawCasserite,
                ItemRawRutile
        );
    }


}
