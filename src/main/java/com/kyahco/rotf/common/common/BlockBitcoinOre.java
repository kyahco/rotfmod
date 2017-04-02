package com.kyahco.rotf.common.common;
/**
 * Created by Kaia "Kyahco" Parks on 4/1/17.
 */

import com.kyahco.rotf.RotfMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBitcoinOre extends Block{

    public BlockBitcoinOre(){
        super(Material.rock);
        setBlockName(RotfMod.MODID + ":" + "BitcoinOre");
        setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped (int meta, Random par2Random, int par3){
        return Item.getItemFromBlock(this);
    }
}
