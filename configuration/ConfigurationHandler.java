package net.shinemod.configuration;

import java.io.File;
import java.lang.ref.Reference;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import net.shinemod.mod_shinepack;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
	public static Configuration config;
	
	public static void init(File file){
		config = new Configuration(file);
		
		try{
			config.load();
		
			//any time you want to make a block that will be a biome block, use .getTerrainBlock(). any other block use .getBlock.
			
			/* Blue-Set-Config */
			ConfigurationInts.TutorialHelmetID = config.get(config.CATEGORY_ITEM, "royal_helmet", 502).getInt();
			ConfigurationInts.TutorialPlateID = config.get(config.CATEGORY_ITEM, "royal_plate", 511).getInt();
			ConfigurationInts.TutorialLegsID = config.get(config.CATEGORY_ITEM, "royal_leggings", 529).getInt();
			ConfigurationInts.TutorialBootsID = config.get(config.CATEGORY_ITEM, "royal_boots", 668).getInt();
			ConfigurationInts.BlueIngotID = config.get(config.CATEGORY_ITEM, "royal_ingot", 632).getInt();
			ConfigurationInts.BlueDustID = config.get(config.CATEGORY_ITEM, "royal_dust", 623).getInt();
			ConfigurationInts.BlueToolFragmentID = config.get(config.CATEGORY_ITEM, "royal_toolfragment", 641).getInt();
			ConfigurationInts.BlueSwordID = config.get(config.CATEGORY_ITEM, "royal_sword", 538).getInt();
			ConfigurationInts.BluePickaxeID = config.get(config.CATEGORY_ITEM, "royal_pickaxe", 546).getInt();
			ConfigurationInts.BlueSpadeID = config.get(config.CATEGORY_ITEM, "royal_spade", 555).getInt();
			ConfigurationInts.BlueAxeID = config.get(config.CATEGORY_ITEM, "royal_axe", 604).getInt();
			ConfigurationInts.BlueOreID = config.getBlock(config.CATEGORY_BLOCK, "royal_ore", 652).getInt();
			ConfigurationInts.BlueBlockID = config.getBlock(config.CATEGORY_BLOCK, "royal_block", 700).getInt();
			ConfigurationInts.BluePaxelID = config.get(config.CATEGORY_ITEM, "royal_paxel", 800).getInt();
			
			/* Spawn-Eggs-Config */
			ConfigurationInts.RespawnEggs = config.get(config.CATEGORY_GENERAL, "does_shinetoolpack_contain_spawneggs", false).getBoolean(false);
			/* Yellow-Set-Config */
			ConfigurationInts.YellowHelmetID = config.get(config.CATEGORY_ITEM, "coral_helmet", 500).getInt();
			ConfigurationInts.YellowPlateID = config.get(config.CATEGORY_ITEM, "coral_plate", 509).getInt();
			ConfigurationInts.YellowLegsID = config.get(config.CATEGORY_ITEM, "coral_leggings", 518).getInt();
			ConfigurationInts.YellowBootsID = config.get(config.CATEGORY_ITEM, "coral_boots", 527).getInt();
			ConfigurationInts.YellowIngotID = config.get(config.CATEGORY_ITEM, "coral_ingot", 630).getInt();
			ConfigurationInts.YellowDustID = config.get(config.CATEGORY_ITEM, "coral_dust", 611).getInt();
			ConfigurationInts.YellowToolFragmentID = config.get(config.CATEGORY_ITEM, "coral_toolfragment", 639).getInt();
			ConfigurationInts.YellowSwordID = config.get(config.CATEGORY_ITEM, "coral_sword", 536).getInt();
			ConfigurationInts.YellowPickaxeID = config.get(config.CATEGORY_ITEM, "coral_pickaxe", 669).getInt();
			ConfigurationInts.YellowSpadeID = config.get(config.CATEGORY_ITEM, "coral_spade", 553).getInt();
			ConfigurationInts.YellowAxeID = config.get(config.CATEGORY_ITEM, "coral_axe", 602).getInt();
			ConfigurationInts.YellowOreID = config.getBlock(config.CATEGORY_BLOCK, "coral_ore", 650).getInt();
			ConfigurationInts.YellowBlockID = config.getBlock(config.CATEGORY_BLOCK, "coral_block", 701).getInt();
			/*White-Set-Config */
			ConfigurationInts.WhiteHelmetID = config.get(config.CATEGORY_ITEM, "snow_helmet", 501).getInt();
			ConfigurationInts.WhitePlateID = config.get(config.CATEGORY_ITEM, "snow_plate", 510).getInt();
			ConfigurationInts.WhiteLegsID = config.get(config.CATEGORY_ITEM, "snow_leggings", 519).getInt();
			ConfigurationInts.WhiteBootsID = config.get(config.CATEGORY_ITEM, "snow_boots", 528).getInt();
			ConfigurationInts.WhiteIngotID = config.get(config.CATEGORY_ITEM, "snow_ingot", 631).getInt();
			ConfigurationInts.SilverIngotID = config.get(config.CATEGORY_ITEM, "snow_ingot", 649).getInt();
			ConfigurationInts.SilverDustID = config.get(config.CATEGORY_ITEM, "snow_dust", 622).getInt();
			ConfigurationInts.WhitePowderID = config.get(config.CATEGORY_ITEM, "snow_dust", 648).getInt();
			ConfigurationInts.WhiteToolFragmentID = config.get(config.CATEGORY_ITEM, "snow_toolfragment", 640).getInt();
			ConfigurationInts.WhiteSwordID = config.get(config.CATEGORY_ITEM, "snow_sword", 537).getInt();
			ConfigurationInts.WhitePickaxeID = config.get(config.CATEGORY_ITEM, "snow_pickaxe", 545).getInt();
			ConfigurationInts.WhiteSpadeID = config.get(config.CATEGORY_ITEM, "snow_spade", 554).getInt();
			ConfigurationInts.WhiteAxeID = config.get(config.CATEGORY_ITEM, "snow_axe", 603).getInt();
			ConfigurationInts.SilverOreID = config.getBlock(config.CATEGORY_BLOCK, "snow_ore", 651).getInt();
			ConfigurationInts.WhiteBlockID = config.getBlock(config.CATEGORY_BLOCK, "snow_block", 702).getInt();
			/*Red-Set-Config*/
			ConfigurationInts.RedHelmetID = config.get(config.CATEGORY_ITEM, "lust_helmet", 503).getInt();
			ConfigurationInts.RedPlateID = config.get(config.CATEGORY_ITEM, "lust_plate", 512).getInt();
			ConfigurationInts.RedLegsID = config.get(config.CATEGORY_ITEM, "lust_leggings", 521).getInt();
			ConfigurationInts.RedBootsID = config.get(config.CATEGORY_ITEM, "lust_boots", 530).getInt();
			ConfigurationInts.RedIngotID = config.get(config.CATEGORY_ITEM, "lust_ingot", 633).getInt();
			ConfigurationInts.RedDustID = config.get(config.CATEGORY_ITEM, "lust_dust", 624).getInt();
			ConfigurationInts.RedToolFragmentID = config.get(config.CATEGORY_ITEM, "lust_toolfragment", 642).getInt();
			ConfigurationInts.RedSwordID = config.get(config.CATEGORY_ITEM, "lust_sword", 539).getInt();
			ConfigurationInts.RedPickaxeID = config.get(config.CATEGORY_ITEM, "lust_pickaxe", 547).getInt();
			ConfigurationInts.RedSpadeID = config.get(config.CATEGORY_ITEM, "lust_spade", 556).getInt();
			ConfigurationInts.RedAxeID = config.get(config.CATEGORY_ITEM, "lust_axe", 605).getInt();
			ConfigurationInts.RedOreID = config.getBlock(config.CATEGORY_BLOCK, "lust_ore", 653).getInt();
			ConfigurationInts.RedBlockID = config.getBlock(config.CATEGORY_BLOCK, "lust_block", 703).getInt();
			ConfigurationInts.RedPaxelID = config.get(config.CATEGORY_ITEM, "lust_paxel", 801).getInt();
			/*Green-Set-Config*/
			ConfigurationInts.GreenHelmetID = config.get(config.CATEGORY_ITEM, "lime_helmet", 504).getInt();
			ConfigurationInts.GreenPlateID = config.get(config.CATEGORY_ITEM, "lime_plate", 513).getInt();
			ConfigurationInts.GreenLegsID = config.get(config.CATEGORY_ITEM, "lime_leggings", 522).getInt();
			ConfigurationInts.GreenBootsID = config.get(config.CATEGORY_ITEM, "lime_boots", 531).getInt();
			ConfigurationInts.GreenIngotID = config.get(config.CATEGORY_ITEM, "lime_ingot", 634).getInt();
			ConfigurationInts.GreenDustID = config.get(config.CATEGORY_ITEM, "lime_dust", 625).getInt();
			ConfigurationInts.GreenToolFragmentID = config.get(config.CATEGORY_ITEM, "lime_toolfragment", 643).getInt();
			ConfigurationInts.GreenSwordID = config.get(config.CATEGORY_ITEM, "lime_sword", 540).getInt();
			ConfigurationInts.GreenPickaxeID = config.get(config.CATEGORY_ITEM, "lime_pickaxe", 548).getInt();
			ConfigurationInts.GreenSpadeID = config.get(config.CATEGORY_ITEM, "lime_spade", 557).getInt();
			ConfigurationInts.GreenAxeID = config.get(config.CATEGORY_ITEM, "lime_axe", 571).getInt();
			ConfigurationInts.GreenOreID = config.getBlock(config.CATEGORY_BLOCK, "lime_ore", 654).getInt();
			ConfigurationInts.GreenBlockID = config.getBlock(config.CATEGORY_BLOCK, "lime_block", 704).getInt();
			ConfigurationInts.GreenPaxelID = config.get(config.CATEGORY_ITEM, "lime_paxel", 802).getInt();
			/*Pink-Set-Config */
			ConfigurationInts.PinkHelmetID = config.get(config.CATEGORY_ITEM, "magenta_helmet", 505).getInt();
			ConfigurationInts.PinkPlateID = config.get(config.CATEGORY_ITEM, "magenta_plate", 514).getInt();
			ConfigurationInts.PinkLegsID = config.get(config.CATEGORY_ITEM, "magenta_leggings", 523).getInt();
			ConfigurationInts.PinkBootsID = config.get(config.CATEGORY_ITEM, "magenta_boots", 532).getInt();
			ConfigurationInts.PinkIngotID = config.get(config.CATEGORY_ITEM, "magenta_ingot", 635).getInt();
			ConfigurationInts.PinkDustID = config.get(config.CATEGORY_ITEM, "magenta_dust", 626).getInt();
			ConfigurationInts.PinkToolFragmentID = config.get(config.CATEGORY_ITEM, "magenta_toolfragment", 644).getInt();
			ConfigurationInts.PinkSwordID = config.get(config.CATEGORY_ITEM, "magenta_sword", 541).getInt();
			ConfigurationInts.PinkPickaxeID = config.get(config.CATEGORY_ITEM, "magenta_pickaxe", 549).getInt();
			ConfigurationInts.PinkSpadeID = config.get(config.CATEGORY_ITEM, "magenta_spade", 558).getInt();
			ConfigurationInts.PinkAxeID = config.get(config.CATEGORY_ITEM, "magenta_axe", 606).getInt();
			ConfigurationInts.PinkOreID = config.getBlock(config.CATEGORY_BLOCK, "magenta_ore", 665).getInt();
			ConfigurationInts.PinkBlockID = config.getBlock(config.CATEGORY_BLOCK, "magenta_block", 705).getInt();
			ConfigurationInts.PinkPaxelID = config.get(config.CATEGORY_ITEM, "magenta_paxel", 803).getInt();
			/*Purple-Set-Config */
			ConfigurationInts.PurpleHelmetID = config.get(config.CATEGORY_ITEM, "violet_helmet", 506).getInt();
			ConfigurationInts.PurplePlateID = config.get(config.CATEGORY_ITEM, "violet_plate", 515).getInt();
			ConfigurationInts.PurpleLegsID = config.get(config.CATEGORY_ITEM, "violet_leggings", 524).getInt();
			ConfigurationInts.PurpleBootsID = config.get(config.CATEGORY_ITEM, "violet_boots", 533).getInt();
			ConfigurationInts.PurpleIngotID = config.get(config.CATEGORY_ITEM, "violet_ingot", 636).getInt();
			ConfigurationInts.PurpleDustID = config.get(config.CATEGORY_ITEM, "violet_dust", 627).getInt();
			ConfigurationInts.PurpleToolFragmentID = config.get(config.CATEGORY_ITEM, "violet_toolfragment", 645).getInt();
			ConfigurationInts.PurpleSwordID = config.get(config.CATEGORY_ITEM, "violet_sword", 542).getInt();
			ConfigurationInts.PurplePickaxeID = config.get(config.CATEGORY_ITEM, "violet_pickaxe", 550).getInt();
			ConfigurationInts.PurpleSpadeID = config.get(config.CATEGORY_ITEM, "violet_spade", 559).getInt();
			ConfigurationInts.PurpleAxeID = config.get(config.CATEGORY_ITEM, "violet_axe", 607).getInt();
			ConfigurationInts.PurpleOreID = config.getBlock(config.CATEGORY_BLOCK, "violet_ore", 666).getInt();
			ConfigurationInts.PurpleBlockID = config.getBlock(config.CATEGORY_BLOCK, "violet_block", 706).getInt();
			ConfigurationInts.PurplePaxelID = config.get(config.CATEGORY_ITEM, "violet_paxel", 804).getInt();
			/*Black-Set-Config */
			ConfigurationInts.BlackHelmetID = config.get(config.CATEGORY_ITEM, "licorice_helmet", 507).getInt();
			ConfigurationInts.BlackPlateID = config.get(config.CATEGORY_ITEM, "licorice_plate", 516).getInt();
			ConfigurationInts.BlackLegsID = config.get(config.CATEGORY_ITEM, "licorice_leggings", 525).getInt();
			ConfigurationInts.BlackBootsID = config.get(config.CATEGORY_ITEM, "licorice_boots", 534).getInt();
			ConfigurationInts.BlackIngotID = config.get(config.CATEGORY_ITEM, "licorice_ingot", 637).getInt();
			ConfigurationInts.BlackDustID = config.get(config.CATEGORY_ITEM, "licorice_dust", 628).getInt();
			ConfigurationInts.BlackToolFragmentID = config.get(config.CATEGORY_ITEM, "licorice_toolfragment", 646).getInt();
			ConfigurationInts.BlackSwordID = config.get(config.CATEGORY_ITEM, "licorice_sword", 543).getInt();
			ConfigurationInts.BlackPickaxeID = config.get(config.CATEGORY_ITEM, "licorice_pickaxe", 551).getInt();
			ConfigurationInts.BlackSpadeID = config.get(config.CATEGORY_ITEM, "licorice_spade", 600).getInt();
			ConfigurationInts.BlackAxeID = config.get(config.CATEGORY_ITEM, "licorice_axe", 608).getInt();
			ConfigurationInts.BlackOreID = config.getBlock(config.CATEGORY_BLOCK, "licorice_ore", 667).getInt();
			ConfigurationInts.BlackBlockID = config.getBlock(config.CATEGORY_BLOCK, "licorice_block", 707).getInt();
			ConfigurationInts.BlackPaxelID = config.get(config.CATEGORY_ITEM, "licorice_paxel", 805).getInt();
			/*BlackWhite-Set-Config */
			ConfigurationInts.BlackWhiteHelmetID = config.get(config.CATEGORY_ITEM, "twilight_helmet", 900).getInt();
			ConfigurationInts.BlackWhitePlateID = config.get(config.CATEGORY_ITEM, "twilight_plate", 901).getInt();
			ConfigurationInts.BlackWhiteLegsID = config.get(config.CATEGORY_ITEM, "twilight_leggings", 902).getInt();
			ConfigurationInts.BlackWhiteBootsID = config.get(config.CATEGORY_ITEM, "twilight_boots", 903).getInt();
			ConfigurationInts.BlackWhiteIngotID = config.get(config.CATEGORY_ITEM, "twilight_ingot", 904).getInt();
			ConfigurationInts.BlackWhiteDustID = config.get(config.CATEGORY_ITEM, "twilight_dust", 910).getInt();
			ConfigurationInts.BlackWhiteToolFragmentID = config.get(config.CATEGORY_ITEM, "twilight_toolfragment", 905).getInt();
			ConfigurationInts.BlackWhiteSwordID = config.get(config.CATEGORY_ITEM, "twilight_sword", 906).getInt();
			ConfigurationInts.BlackWhitePickaxeID = config.get(config.CATEGORY_ITEM, "twilight_pickaxe", 907).getInt();
			ConfigurationInts.BlackWhiteSpadeID = config.get(config.CATEGORY_ITEM, "twilight_spade", 908).getInt();
			ConfigurationInts.BlackWhiteAxeID = config.get(config.CATEGORY_ITEM, "twilight_axe", 909).getInt();
			ConfigurationInts.BlackWhiteOreID = config.getBlock(config.CATEGORY_BLOCK, "twilight_ore", 911).getInt();
			ConfigurationInts.BlackWhiteBlockID = config.getBlock(config.CATEGORY_BLOCK, "twilight_block", 912).getInt();
			ConfigurationInts.BlackWhitePaxelID = config.get(config.CATEGORY_ITEM, "twilight_paxel", 913).getInt();
			ConfigurationInts.BlackWhiteMixedIngotID = config.get(config.CATEGORY_ITEM, "twilight_mixedingot", 914).getInt();
			/*Rainbow-Set-Config */
			ConfigurationInts.RainbowHelmetID = config.get(config.CATEGORY_ITEM, "rainbow_helmet", 508).getInt();
			ConfigurationInts.RainbowPlateID = config.get(config.CATEGORY_ITEM, "rainbow_plate", 517).getInt();
			ConfigurationInts.RainbowLegsID = config.get(config.CATEGORY_ITEM, "rainbow_leggings", 526).getInt();
			ConfigurationInts.RainbowBootsID = config.get(config.CATEGORY_ITEM, "rainbow_boots", 535).getInt();
			ConfigurationInts.RainbowIngotID = config.get(config.CATEGORY_ITEM, "rainbow_ingot", 647).getInt();
			ConfigurationInts.RainbowDustID = config.get(config.CATEGORY_ITEM, "rainbow_dust", 629).getInt();
			ConfigurationInts.RainbowToolFragmentID = config.get(config.CATEGORY_ITEM, "rainbow_toolfragment", 638).getInt();
			ConfigurationInts.RainbowSwordID = config.get(config.CATEGORY_ITEM, "rainbow_sword", 544).getInt();
			ConfigurationInts.RainbowPickaxeID = config.get(config.CATEGORY_ITEM, "rainbow_pickaxe", 552).getInt();
			ConfigurationInts.RainbowSpadeID = config.get(config.CATEGORY_ITEM, "rainbow_spade", 601).getInt();
			ConfigurationInts.RainbowAxeID = config.get(config.CATEGORY_ITEM, "rainbow_axe", 609).getInt();
			ConfigurationInts.RainbowOreID = config.getBlock(config.CATEGORY_BLOCK, "rainbow_ore", 1200).getInt();
			ConfigurationInts.RainbowBlockID = config.getBlock(config.CATEGORY_BLOCK, "rainbow_block", 708).getInt();
			ConfigurationInts.RainbowPaxelID = config.get(config.CATEGORY_ITEM, "rainbow_paxel", 806).getInt();
			/*Dimensional-Stuff */
			ConfigurationInts.ShineFireID = config.get(config.CATEGORY_ITEM, "shine_fire", 1014).getInt();
			ConfigurationInts.portalID = config.get(config.CATEGORY_GENERAL, "shine_portal", 200).getInt();
			ConfigurationInts.SDirtID = config.getTerrainBlock(config.CATEGORY_BLOCK, "shine_dirt", 250, null).getInt();
			ConfigurationInts.SGrassID = config.getTerrainBlock(config.CATEGORY_BLOCK, "shine_grass", 251, null).getInt();
			ConfigurationInts.SStoneID = config.getTerrainBlock(config.CATEGORY_BLOCK, "shine_stone", 252, null).getInt();
			ConfigurationInts.BlazerID = config.get(config.CATEGORY_ITEM, "blazer", 1013).getInt();
			ConfigurationInts.ShinerID = config.get(config.CATEGORY_ITEM, "shiner", 1015).getInt();
			ConfigurationInts.ShineLeavesID = config.getTerrainBlock(config.CATEGORY_BLOCK, "shine_leaves", 253, null).getInt();
			ConfigurationInts.ShineLogsID = config.getTerrainBlock(config.CATEGORY_BLOCK, "shine_logs", 254, null).getInt();
			ConfigurationInts.ShineID = config.get(config.CATEGORY_GENERAL, "shine_biome", 23).getInt();
			ConfigurationInts.EclipseID = config.get(config.CATEGORY_GENERAL, "eclipse_biome", 24).getInt();
			ConfigurationInts.EDirtID = config.getTerrainBlock(config.CATEGORY_BLOCK, "eclipse_dirt", 249, null).getInt();
			ConfigurationInts.EStoneID = config.getTerrainBlock(config.CATEGORY_BLOCK, "eclipse_stone", 248, null).getInt();
			ConfigurationInts.EGrassID = config.getTerrainBlock(config.CATEGORY_BLOCK, "eclipse_grass", 255, null).getInt();
			ConfigurationInts.EclipsePortalID = config.get(config.CATEGORY_BLOCK, "eclipse_portal", 201).getInt();
			ConfigurationInts.EclipseLogsID = config.getTerrainBlock(config.CATEGORY_BLOCK, "eclipse_logs", 246, null).getInt();
			ConfigurationInts.EclipseLeavesID = config.getTerrainBlock(config.CATEGORY_BLOCK, "eclipse_leaves", 247, null).getInt();
			ConfigurationInts.EclipseBlockID = config.get(config.CATEGORY_BLOCK, "eclipse_block", 245).getInt();
			ConfigurationInts.CrypticBlockID = config.get(config.CATEGORY_BLOCK, "cryptic_block", 244).getInt();
			ConfigurationInts.CrypticID = config.get(config.CATEGORY_GENERAL, "cryptic_biome", 25).getInt();
			ConfigurationInts.CDirtID = config.getTerrainBlock(config.CATEGORY_BLOCK, "cryptic_dirt", 242, null).getInt();
			ConfigurationInts.CStoneID = config.getTerrainBlock(config.CATEGORY_BLOCK, "cryptic_stone", 241, null).getInt();
			ConfigurationInts.CGrassID = config.getTerrainBlock(config.CATEGORY_BLOCK, "cryptic_grass", 243, null).getInt();
			ConfigurationInts.CrypticPortalID = config.get(config.CATEGORY_ITEM, "cryptic_portal", 202).getInt();
			ConfigurationInts.CrypticLogsID = config.getTerrainBlock(config.CATEGORY_BLOCK, "cryptic_logs", 238, null).getInt();
			ConfigurationInts.CrypticLeavesID = config.getTerrainBlock(config.CATEGORY_BLOCK, "cryptic_leaves", 239, null).getInt();
			ConfigurationInts.ShineDimensionID = config.get(config.CATEGORY_GENERAL, "shine_dimension", 20).getInt();
			ConfigurationInts.EclipseDimensionID = config.get(config.CATEGORY_GENERAL, "eclipse_dimension", 21).getInt();
			ConfigurationInts.CrypticDimensionID = config.get(config.CATEGORY_GENERAL, "cryptic_dimension", 22).getInt();
		}
		catch(Exception e){
			FMLLog.log(Level.SEVERE, Reference.class + "has a problem loading the config file");
			
		}
		finally{
			config.save();
		}
	}
}
