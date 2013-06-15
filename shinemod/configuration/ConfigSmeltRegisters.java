package net.shinemod.configuration;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;

public class ConfigSmeltRegisters {
	@Init
	public static void SmeltRegisters(){
		 ModLoader.addSmelting(ItemBlockHolder.YellowOre.blockID, new ItemStack(ItemBlockHolder.YellowIngot, 1));                        //(YellowOre.blockID, new ItemStack(mod_tutorial.YellowIngot, 1), 0.35);
		 ModLoader.addSmelting(ItemBlockHolder.YellowIngot.itemID, new ItemStack(ItemBlockHolder.YellowDust, 1));   
		 ModLoader.addSmelting(ItemBlockHolder.SilverIngot.itemID, new ItemStack(ItemBlockHolder.SilverDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.SilverOre.blockID, new ItemStack(ItemBlockHolder.SilverIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.WhitePowder.itemID, new ItemStack(ItemBlockHolder.WhiteIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BlueOre.blockID, new ItemStack(ItemBlockHolder.BlueIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BlueIngot.itemID, new ItemStack(ItemBlockHolder.BlueDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.RedOre.blockID, new ItemStack(ItemBlockHolder.RedIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.RedIngot.itemID, new ItemStack(ItemBlockHolder.RedDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.GreenOre.blockID, new ItemStack(ItemBlockHolder.GreenIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.GreenIngot.itemID, new ItemStack(ItemBlockHolder.GreenDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.PinkOre.blockID, new ItemStack(ItemBlockHolder.PinkIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.PinkIngot.itemID, new ItemStack(ItemBlockHolder.PinkDust,1 ));
		 ModLoader.addSmelting(ItemBlockHolder.PurpleOre.blockID, new ItemStack(ItemBlockHolder.PurpleIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.PurpleIngot.itemID, new ItemStack(ItemBlockHolder.PurpleDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BlackOre.blockID, new ItemStack(ItemBlockHolder.BlackIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BlackIngot.itemID, new ItemStack(ItemBlockHolder.BlackDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.RainbowIngot.itemID, new ItemStack(ItemBlockHolder.RainbowDust, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BasicCube.blockID, new ItemStack(ItemBlockHolder.RainbowIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BlackWhiteIngot.itemID, new ItemStack(ItemBlockHolder.BlackWhiteDust,1));
		 ModLoader.addSmelting(ItemBlockHolder.BlackWhiteMixedIngot.itemID, new ItemStack(ItemBlockHolder.BlackWhiteIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.RainbowOre.blockID, new ItemStack(ItemBlockHolder.RainbowIngot, 1));
		 ModLoader.addSmelting(ItemBlockHolder.BlackWhiteOre.blockID, new ItemStack(ItemBlockHolder.BlackWhiteIngot, 1));
	}
}
