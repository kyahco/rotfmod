package com.kyahco.rotf.common.item;

/**
 * Created by Kaia "Kyahco" Parks on 4/1/17.
 */

import com.kyahco.rotf.RotfMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBitcoinium extends Item {

    public ItemBitcoinium(){
        setUnlocalizedName(RotfMod.MODID + ":" + "ItemBitcoinium");
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
