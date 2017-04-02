package com.kyahco.rotf;

import com.kyahco.rotf.common.common.BlockBitcoinOre;
import com.kyahco.rotf.common.item.ItemBitcoinium;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


@Mod(modid = RotfMod.MODID, version = RotfMod.VERSION)
public class RotfMod
{
    public static final String MODID = "rotf";
    public static final String VERSION = "0.1.0";

    public static Block blockBitcoinOre;
    public static Item itemBitcoinium;


    @EventHandler
    public void preinit(FMLPreInitializationEvent evnt){
        itemBitcoinium = new ItemBitcoinium();
        GameRegistry.registerItem(itemBitcoinium, "Bitcoinium");

        blockBitcoinOre = new BlockBitcoinOre();
        GameRegistry.registerBlock(blockBitcoinOre, "BitcoinOre");

        GameRegistry.addSmelting(new ItemStack(RotfMod.blockBitcoinOre), new ItemStack(RotfMod.itemBitcoinium), 0.1F);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
