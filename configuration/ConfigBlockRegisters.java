package net.shinemod.configuration;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;

public class ConfigBlockRegisters {
	@Init
	public static void blockRegisters(){
		//Register Blocks
		GameRegistry.registerBlock(ItemBlockHolder.BlueOre, "BlueOre");
		GameRegistry.registerBlock(ItemBlockHolder.YellowOre, "YellowOre");
		GameRegistry.registerBlock(ItemBlockHolder.SilverOre, "SilverOre");
		GameRegistry.registerBlock(ItemBlockHolder.RedOre, "RedOre");
		GameRegistry.registerBlock(ItemBlockHolder.GreenOre, "GreenOre");
		GameRegistry.registerBlock(ItemBlockHolder.PinkOre, "PinkOre");
		GameRegistry.registerBlock(ItemBlockHolder.PurpleOre, "PurpleOre");
		GameRegistry.registerBlock(ItemBlockHolder.BlackOre, "BlackOre");
		GameRegistry.registerBlock(ItemBlockHolder.BasicCube, "BasicCube");
		GameRegistry.registerBlock(ItemBlockHolder.SDirt, "ShrineDirt");
		GameRegistry.registerBlock(ItemBlockHolder.SGrass, "ShrineGrass");
		GameRegistry.registerBlock(ItemBlockHolder.SStone, "ShrineStone");
		GameRegistry.registerBlock(ItemBlockHolder.BlueBlock, "BlueBlock");
		GameRegistry.registerBlock(ItemBlockHolder.WhiteBlock, "WhiteBlock");
		GameRegistry.registerBlock(ItemBlockHolder.YellowBlock, "YellowBlock");
		GameRegistry.registerBlock(ItemBlockHolder.RedBlock, "RedBlock");
		GameRegistry.registerBlock(ItemBlockHolder.GreenBlock, "GreenBlock");
		GameRegistry.registerBlock(ItemBlockHolder.PinkBlock, "PinkBlock");
		GameRegistry.registerBlock(ItemBlockHolder.PurpleBlock, "PurpleBlock");
		GameRegistry.registerBlock(ItemBlockHolder.BlackBlock, "BlackBlock");
		GameRegistry.registerBlock(ItemBlockHolder.RainbowBlock, "RainbowBlock");
		GameRegistry.registerBlock(ItemBlockHolder.BlackWhiteBlock, "BlackWhiteBlock");
		GameRegistry.registerBlock(ItemBlockHolder.BlackWhiteOre, "BlackWhiteOre");
		GameRegistry.registerBlock(ItemBlockHolder.ShineLogs, "ShineLog");
		GameRegistry.registerBlock(ItemBlockHolder.ShineLeaves, "ShineLeaves");
		GameRegistry.registerBlock(ItemBlockHolder.RainbowOre, "RainbowOre");
		GameRegistry.registerBlock(ItemBlockHolder.EclipseLogs, "EclipseLog");
		GameRegistry.registerBlock(ItemBlockHolder.EclipseLeaves, "EclipseLeaves");
		GameRegistry.registerBlock(ItemBlockHolder.EDirt, "EclipseDirt");
		GameRegistry.registerBlock(ItemBlockHolder.EGrass, "EclipseGrass");
		GameRegistry.registerBlock(ItemBlockHolder.EStone, "EclipseStone");
		GameRegistry.registerBlock(ItemBlockHolder.EclipseBlock, "EclipseBlock");
		GameRegistry.registerBlock(ItemBlockHolder.CrypticBlock, "CrypticBlock");
		GameRegistry.registerBlock(ItemBlockHolder.CrypticLogs, "CrypticLog");
		GameRegistry.registerBlock(ItemBlockHolder.CrypticLeaves, "CrypticLeaves");
		GameRegistry.registerBlock(ItemBlockHolder.CDirt, "CrypticDirt");
		GameRegistry.registerBlock(ItemBlockHolder.CGrass, "CrypticGrass");
		GameRegistry.registerBlock(ItemBlockHolder.CStone, "CrypticStone");
		GameRegistry.registerBlock(ItemBlockHolder.FusionOre, "FusionOre");
	}
}
