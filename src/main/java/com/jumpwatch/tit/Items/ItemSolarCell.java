package com.jumpwatch.tit.Items;

import com.jumpwatch.tit.Registry.theinventorsregistry;
import com.jumpwatch.tit.theinventorstech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

import net.minecraft.item.Item.Properties;

public class ItemSolarCell extends Item {
    public ItemSolarCell() {
        super(new Properties().tab(theinventorsregistry.TIT_Group1).stacksTo(64).setNoRepair());
        setRegistryName(new ResourceLocation(theinventorstech.MOD_ID, "solarcell"));
    }
}
