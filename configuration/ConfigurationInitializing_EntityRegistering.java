package net.shinemod.configuration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.shinemod.BlackArmor;
import net.shinemod.BlackWhiteArmor;
import net.shinemod.CGrass;
import net.shinemod.DimensionalLog;
import net.shinemod.EGrass;
import net.shinemod.GreenArmor;
import net.shinemod.ItemPaxel;
import net.shinemod.MyItemAxe;
import net.shinemod.MyItemPickaxe;
import net.shinemod.MyItemSpade;
import net.shinemod.MyItemSword;
import net.shinemod.PinkArmor;
import net.shinemod.PurpleArmor;
import net.shinemod.RainbowArmor;
import net.shinemod.RedArmor;
import net.shinemod.SGrass;
import net.shinemod.ShineBlock;
import net.shinemod.ShineEnumToolArmorMaterials;
import net.shinemod.ShineFire;
import net.shinemod.ShineItem;
import net.shinemod.Shiner;
import net.shinemod.TutArmor;
import net.shinemod.WhiteArmor;
import net.shinemod.YellowArmor;
import net.shinemod.mod_shinepack;
import net.shinemod.creatures.ShineChicken;
import net.shinemod.creatures.ShineCow;
import net.shinemod.creatures.ShineCreeper;
import net.shinemod.creatures.ShinePig;
import net.shinemod.creatures.ShineSheep;
import net.shinemod.creatures.ShineSkeleton;
import net.shinemod.creatures.ShineSpider;
import net.shinemod.creatures.ShineZombie;
import net.shinemod.dimensions.BiomeCryptic;
import net.shinemod.dimensions.BiomeEclipse;
import net.shinemod.dimensions.BiomeShine;
import net.shinemod.dimensions.CrypticPortal;
import net.shinemod.dimensions.CrypticWorldProvider;
import net.shinemod.dimensions.EclipsePortal;
import net.shinemod.dimensions.EclipseWorldProvider;
import net.shinemod.dimensions.ShrinePortal;
import net.shinemod.dimensions.WorldProviderShrine;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ConfigurationInitializing_EntityRegistering {
	//This is in here for special mod purposes.
	public static BiomeGenBase Shine;
	
	@Init
	public static void Initalize(){
		
		ItemBlockHolder.BasicCube = new ShineBlock(1001, Material.rock, "BasicCube").setHardness(3.0F).setUnlocalizedName("BasicCube").setCreativeTab(mod_shinepack.tabJVCraft);
		//DimensionalThings
		ItemBlockHolder.portal = (ShrinePortal)new ShrinePortal(ConfigurationInts.portalID).setHardness(-1.0F).setStepSound(Block.soundGrassFootstep).setLightValue(0.75F).setUnlocalizedName("SPortal").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EclipsePortal = (EclipsePortal) new EclipsePortal(ConfigurationInts.EclipsePortalID).setHardness(-1.0F).setStepSound(Block.soundGrassFootstep).setLightValue(0.75F).setUnlocalizedName("EPortal").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CrypticPortal = (CrypticPortal) new CrypticPortal(ConfigurationInts.CrypticPortalID).setHardness(-1.0F).setStepSound(Block.soundGrassFootstep).setLightValue(0.75F).setUnlocalizedName("CPortal").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.SGrass = new SGrass(ConfigurationInts.SGrassID).setUnlocalizedName("SGrass").setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.SDirt = new ShineBlock(ConfigurationInts.SDirtID, Material.ground, "SDirt").setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("SDirt").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.SStone = new ShineBlock(ConfigurationInts.SStoneID, Material.rock, "SStone").setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("SStone").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.Blazer = new ShineItem(ConfigurationInts.BlazerID).setUnlocalizedName("Blazer").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.ShineFire = new ShineFire(ConfigurationInts.ShineFireID).setUnlocalizedName("ShineFire").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.Shiner = new Shiner(ConfigurationInts.ShinerID).setUnlocalizedName("Shiner").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.ShineLeaves = new ShineBlock(ConfigurationInts.ShineLeavesID, Material.leaves, "ShineLeaves").setUnlocalizedName("ShineLeaves").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.ShineLogs = new DimensionalLog(ConfigurationInts.ShineLogsID, Material.wood, "shinetree_top", "shinetree_side", "shinetree_bottom").setUnlocalizedName("ShineLog").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EGrass = new EGrass(ConfigurationInts.EGrassID).setUnlocalizedName("EGrass").setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EDirt = new ShineBlock(ConfigurationInts.EDirtID, Material.ground, "EDirt").setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("EDirt").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EStone = new ShineBlock(ConfigurationInts.EStoneID, Material.rock, "EStone").setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("EStone").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EclipseLeaves = new ShineBlock(ConfigurationInts.EclipseLeavesID, Material.leaves, "EclipseLeaves").setUnlocalizedName("EclipseLeaves").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EclipseLogs = new DimensionalLog(ConfigurationInts.EclipseLogsID, Material.wood, "eclipsetree_top", "eclipsetree_side", "eclipsetree_bottom").setUnlocalizedName("EclipseLogs").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.EclipseBlock = new ShineBlock(ConfigurationInts.EclipseBlockID, Material.iron, "EclipseBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("EclipseBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CrypticBlock = new ShineBlock(ConfigurationInts.CrypticBlockID, Material.iron, "CrypticBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("CrypticBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CGrass = new CGrass(ConfigurationInts.CGrassID).setUnlocalizedName("CGrass").setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CDirt = new ShineBlock(ConfigurationInts.CDirtID, Material.ground, "CDirt").setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("CDirt").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CStone = new ShineBlock(ConfigurationInts.CStoneID, Material.rock, "CStone").setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("CStone").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CrypticLeaves = new ShineBlock(ConfigurationInts.CrypticLeavesID, Material.leaves, "CrypticLeaves").setUnlocalizedName("CrypticLeaves").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.CrypticLogs = new DimensionalLog(ConfigurationInts.CrypticLogsID, Material.wood, "cryptictree_top", "cryptictree_side", "cryptictree_bottom").setUnlocalizedName("CrypticLogs").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.FusionOre = new ShineBlock(ConfigurationInts.FusionOreID, Material.iron, "FusionOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("FusionOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.FusionShard = new ShineItem(ConfigurationInts.FusionShardID).setUnlocalizedName("FusionShard").setCreativeTab(mod_shinepack.tabJVCraft);
		Shine = (new BiomeShine(23));
		ItemBlockHolder.Eclipse = (new BiomeEclipse(24));
		ItemBlockHolder.Cryptic = (new BiomeCryptic(25));
		ItemBlockHolder.TutorialHelmet = new TutArmor(ConfigurationInts.TutorialHelmetID ,ShineEnumToolArmorMaterials.BlueEnumArmourMaterial, mod_shinepack.proxy.addArmor("Tut"),0).setUnlocalizedName("TutHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.TutorialPlate = new TutArmor(ConfigurationInts.TutorialPlateID ,ShineEnumToolArmorMaterials.BlueEnumArmourMaterial, mod_shinepack.proxy.addArmor("Tut"),1).setUnlocalizedName("TutPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.TutorialLegs = new TutArmor(ConfigurationInts.TutorialLegsID,ShineEnumToolArmorMaterials.BlueEnumArmourMaterial, mod_shinepack.proxy.addArmor("Tut"),2).setUnlocalizedName("TutLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.TutorialBoots = new TutArmor(ConfigurationInts.TutorialBootsID,ShineEnumToolArmorMaterials.BlueEnumArmourMaterial, mod_shinepack.proxy.addArmor("Tut"),3).setUnlocalizedName("TutBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		//Items
		ItemBlockHolder.BlueIngot = new ShineItem(ConfigurationInts.BlueIngotID).setUnlocalizedName("BlueIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueToolFragment = new ShineItem(ConfigurationInts.BlueToolFragmentID).setUnlocalizedName("BlueToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueSword = new MyItemSword(ConfigurationInts.BlueSwordID, ShineEnumToolArmorMaterials.BlueEnumToolMaterial).setUnlocalizedName("BlueSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BluePickaxe = new MyItemPickaxe(ConfigurationInts.BluePickaxeID, ShineEnumToolArmorMaterials.BlueEnumToolMaterial).setUnlocalizedName("BluePickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueSpade = new MyItemSpade(ConfigurationInts.BlueSpadeID, ShineEnumToolArmorMaterials.BlueEnumToolMaterial).setUnlocalizedName("BlueSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueAxe = new MyItemAxe(ConfigurationInts.BlueAxeID, ShineEnumToolArmorMaterials.BlueEnumToolMaterial).setUnlocalizedName("BlueAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueDust = new ShineItem(ConfigurationInts.BlueDustID).setUnlocalizedName("BlueDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueOre = new ShineBlock(ConfigurationInts.BlueOreID, Material.iron, "BlueOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("BlueOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlueBlock = new ShineBlock(ConfigurationInts.BlueBlockID, Material.iron, "BlueBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("BlueBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BluePaxel = new ItemPaxel(ConfigurationInts.BluePaxelID, ShineEnumToolArmorMaterials.BlueEnumToolMaterial).setUnlocalizedName("BluePaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		//Yellow
		ItemBlockHolder.YellowHelmet = new YellowArmor(ConfigurationInts.YellowHelmetID,ShineEnumToolArmorMaterials.YellowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Yellow"),0).setUnlocalizedName("YellowHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowPlate = new YellowArmor(ConfigurationInts.YellowPlateID,ShineEnumToolArmorMaterials.YellowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Yellow"),1).setUnlocalizedName("YellowPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowLegs = new YellowArmor(ConfigurationInts.YellowLegsID,ShineEnumToolArmorMaterials.YellowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Yellow"),2).setUnlocalizedName("YellowLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowBoots = new YellowArmor(ConfigurationInts.YellowBootsID,ShineEnumToolArmorMaterials.YellowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Yellow"),3).setUnlocalizedName("YellowBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowIngot = new ShineItem(ConfigurationInts.YellowIngotID).setUnlocalizedName("YellowIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowToolFragment = new ShineItem(ConfigurationInts.YellowToolFragmentID).setUnlocalizedName("YellowToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowSword = new MyItemSword(ConfigurationInts.YellowSwordID, ShineEnumToolArmorMaterials.YellowEnumToolMaterial).setUnlocalizedName("YellowSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowPickaxe = new MyItemPickaxe(ConfigurationInts.YellowPickaxeID, ShineEnumToolArmorMaterials.YellowEnumToolMaterial).setUnlocalizedName("YellowPickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowSpade = new MyItemSpade(ConfigurationInts.YellowSpadeID, ShineEnumToolArmorMaterials.YellowEnumToolMaterial).setUnlocalizedName("YellowSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowAxe = new MyItemAxe(ConfigurationInts.YellowAxeID, ShineEnumToolArmorMaterials.YellowEnumToolMaterial).setUnlocalizedName("YellowAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowDust = new ShineItem(ConfigurationInts.YellowDustID).setUnlocalizedName("YellowDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowOre = new ShineBlock(ConfigurationInts.YellowOreID, Material.iron, "titanium").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("YellowOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.YellowBlock = new ShineBlock(ConfigurationInts.YellowBlockID, Material.iron, "YellowBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("YellowBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		//White
		ItemBlockHolder.WhiteHelmet = new WhiteArmor(ConfigurationInts.WhiteHelmetID, ShineEnumToolArmorMaterials.WhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("White"),0).setUnlocalizedName("WhiteHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhitePlate = new WhiteArmor(ConfigurationInts.WhitePlateID,ShineEnumToolArmorMaterials.WhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("White"),1).setUnlocalizedName("WhitePlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteLegs = new WhiteArmor(ConfigurationInts.WhiteLegsID,ShineEnumToolArmorMaterials.WhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("White"),2).setUnlocalizedName("WhiteLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteBoots = new WhiteArmor(ConfigurationInts.WhiteBootsID,ShineEnumToolArmorMaterials.WhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("White"),3).setUnlocalizedName("WhiteBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteIngot = new ShineItem(ConfigurationInts.WhiteIngotID).setUnlocalizedName("WhiteIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteToolFragment = new ShineItem(ConfigurationInts.WhiteToolFragmentID).setUnlocalizedName("WhiteToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteSword = new MyItemSword(ConfigurationInts.WhiteSwordID, ShineEnumToolArmorMaterials.WhiteEnumToolMaterial).setUnlocalizedName("WhiteSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhitePickaxe = new MyItemPickaxe(ConfigurationInts.WhitePickaxeID, ShineEnumToolArmorMaterials.WhiteEnumToolMaterial).setUnlocalizedName("WhitePickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteSpade = new MyItemSpade(ConfigurationInts.WhiteSpadeID, ShineEnumToolArmorMaterials.WhiteEnumToolMaterial).setUnlocalizedName("WhiteSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteAxe = new MyItemAxe(ConfigurationInts.WhiteAxeID, ShineEnumToolArmorMaterials.WhiteEnumToolMaterial).setUnlocalizedName("WhiteAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.SilverDust = new ShineItem(ConfigurationInts.SilverDustID).setUnlocalizedName("SilverDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.SilverOre = new ShineBlock(ConfigurationInts.SilverOreID, Material.iron, "WhiteOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("WhiteOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhitePowder = new ShineItem(ConfigurationInts.WhitePowderID).setUnlocalizedName("WhitePowder").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.SilverIngot = new ShineItem(ConfigurationInts.SilverIngotID).setUnlocalizedName("SilverIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.WhiteBlock = new ShineBlock(ConfigurationInts.WhiteBlockID, Material.iron, "WhiteBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("WhiteBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		//Red
		ItemBlockHolder.RedHelmet = new RedArmor(ConfigurationInts.RedHelmetID, ShineEnumToolArmorMaterials.RedEnumArmourMaterial, mod_shinepack.proxy.addArmor("Red"),0).setUnlocalizedName("RedHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedPlate = new RedArmor(ConfigurationInts.RedPlateID,ShineEnumToolArmorMaterials.RedEnumArmourMaterial, mod_shinepack.proxy.addArmor("Red"),1).setUnlocalizedName("RedPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedLegs = new RedArmor(ConfigurationInts.RedLegsID,ShineEnumToolArmorMaterials.RedEnumArmourMaterial, mod_shinepack.proxy.addArmor("Red"),2).setUnlocalizedName("RedLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedBoots = new RedArmor(ConfigurationInts.RedBootsID,ShineEnumToolArmorMaterials.RedEnumArmourMaterial, mod_shinepack.proxy.addArmor("Red"),3).setUnlocalizedName("RedBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedIngot = new ShineItem(ConfigurationInts.RedIngotID).setUnlocalizedName("RedIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedToolFragment = new ShineItem(ConfigurationInts.RedToolFragmentID).setUnlocalizedName("RedToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedSword = new MyItemSword(ConfigurationInts.RedSwordID,ShineEnumToolArmorMaterials.RedEnumToolMaterial).setUnlocalizedName("RedSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedPickaxe = new MyItemPickaxe(ConfigurationInts.RedPickaxeID, ShineEnumToolArmorMaterials.RedEnumToolMaterial).setUnlocalizedName("RedPickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedSpade = new MyItemSpade(ConfigurationInts.RedSpadeID, ShineEnumToolArmorMaterials.RedEnumToolMaterial).setUnlocalizedName("RedSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedAxe = new MyItemAxe(ConfigurationInts.RedAxeID, ShineEnumToolArmorMaterials.RedEnumToolMaterial).setUnlocalizedName("RedAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedDust = new ShineItem(ConfigurationInts.RedDustID).setUnlocalizedName("RedDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedOre = new ShineBlock(ConfigurationInts.RedOreID, Material.iron, "RedOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("RedOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedBlock = new ShineBlock(ConfigurationInts.RedBlockID, Material.iron, "RedBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("RedBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RedPaxel = new ItemPaxel(ConfigurationInts.RedPaxelID, ShineEnumToolArmorMaterials.RedEnumToolMaterial).setUnlocalizedName("RedPaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		//Green
		ItemBlockHolder.GreenHelmet = new GreenArmor(ConfigurationInts.GreenHelmetID, ShineEnumToolArmorMaterials.GreenEnumArmourMaterial, mod_shinepack.proxy.addArmor("Green"),0).setUnlocalizedName("GreenHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenPlate = new GreenArmor(ConfigurationInts.GreenPlateID,ShineEnumToolArmorMaterials.GreenEnumArmourMaterial, mod_shinepack.proxy.addArmor("Green"),1).setUnlocalizedName("GreenPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenLegs = new GreenArmor(ConfigurationInts.GreenLegsID,ShineEnumToolArmorMaterials.GreenEnumArmourMaterial, mod_shinepack.proxy.addArmor("Green"),2).setUnlocalizedName("GreenLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenBoots = new GreenArmor(ConfigurationInts.GreenBootsID,ShineEnumToolArmorMaterials.GreenEnumArmourMaterial, mod_shinepack.proxy.addArmor("Green"),3).setUnlocalizedName("GreenBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenIngot = new ShineItem(ConfigurationInts.GreenIngotID).setUnlocalizedName("GreenIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenToolFragment = new ShineItem(ConfigurationInts.GreenToolFragmentID).setUnlocalizedName("GreenToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenSword = new MyItemSword(ConfigurationInts.GreenSwordID, ShineEnumToolArmorMaterials.GreenEnumToolMaterial).setUnlocalizedName("GreenSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenPickaxe = new MyItemPickaxe(ConfigurationInts.GreenPickaxeID, ShineEnumToolArmorMaterials.GreenEnumToolMaterial).setUnlocalizedName("GreenPickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenSpade = new MyItemSpade(ConfigurationInts.GreenSpadeID, ShineEnumToolArmorMaterials.GreenEnumToolMaterial).setUnlocalizedName("GreenSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenAxe = new MyItemAxe(ConfigurationInts.GreenAxeID, ShineEnumToolArmorMaterials.GreenEnumToolMaterial).setUnlocalizedName("GreenAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenDust = new ShineItem(ConfigurationInts.GreenDustID).setUnlocalizedName("GreenDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenOre = new ShineBlock(ConfigurationInts.GreenOreID, Material.iron, "GreenOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("GreenOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenBlock = new ShineBlock(ConfigurationInts.GreenBlockID, Material.iron, "GreenBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("GreenBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.GreenPaxel = new ItemPaxel(ConfigurationInts.GreenPaxelID, ShineEnumToolArmorMaterials.GreenEnumToolMaterial).setUnlocalizedName("GreenPaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		//Pink
		ItemBlockHolder.PinkHelmet = new PinkArmor(ConfigurationInts.PinkHelmetID, ShineEnumToolArmorMaterials.PinkEnumArmourMaterial, mod_shinepack.proxy.addArmor("Pink"),0).setUnlocalizedName("PinkHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkPlate = new PinkArmor(ConfigurationInts.PinkPlateID,ShineEnumToolArmorMaterials.PinkEnumArmourMaterial, mod_shinepack.proxy.addArmor("Pink"),1).setUnlocalizedName("PinkPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkLegs = new PinkArmor(ConfigurationInts.PinkLegsID,ShineEnumToolArmorMaterials.PinkEnumArmourMaterial, mod_shinepack.proxy.addArmor("Pink"),2).setUnlocalizedName("PinkLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkBoots = new PinkArmor(ConfigurationInts.PinkBootsID,ShineEnumToolArmorMaterials.PinkEnumArmourMaterial, mod_shinepack.proxy.addArmor("Pink"),3).setUnlocalizedName("PinkBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkIngot = new ShineItem(ConfigurationInts.PinkIngotID).setUnlocalizedName("PinkIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkToolFragment = new ShineItem(ConfigurationInts.PinkToolFragmentID).setUnlocalizedName("PinkToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkSword = new MyItemSword(ConfigurationInts.PinkSwordID, ShineEnumToolArmorMaterials.PinkEnumToolMaterial).setUnlocalizedName("PinkSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkPickaxe = new MyItemPickaxe(ConfigurationInts.PinkPickaxeID, ShineEnumToolArmorMaterials.PinkEnumToolMaterial).setUnlocalizedName("PinkPickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkSpade = new MyItemSpade(ConfigurationInts.PinkSpadeID, ShineEnumToolArmorMaterials.PinkEnumToolMaterial).setUnlocalizedName("PinkSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkAxe = new MyItemAxe(ConfigurationInts.PinkAxeID, ShineEnumToolArmorMaterials.PinkEnumToolMaterial).setUnlocalizedName("PinkAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkDust = new ShineItem(ConfigurationInts.PinkDustID).setUnlocalizedName("PinkDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkOre = new ShineBlock(ConfigurationInts.PinkOreID, Material.iron, "PinkOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("PinkOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkBlock = new ShineBlock(ConfigurationInts.PinkBlockID, Material.iron, "PinkBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("PinkBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PinkPaxel = new ItemPaxel(ConfigurationInts.PinkPaxelID, ShineEnumToolArmorMaterials.PinkEnumToolMaterial).setUnlocalizedName("PinkPaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		//Purple
		ItemBlockHolder.PurpleHelmet = new PurpleArmor(ConfigurationInts.PurpleHelmetID, ShineEnumToolArmorMaterials.PurpleEnumArmourMaterial, mod_shinepack.proxy.addArmor("Purple"),0).setUnlocalizedName("PurpleHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurplePlate = new PurpleArmor(ConfigurationInts.PurplePlateID,ShineEnumToolArmorMaterials.PurpleEnumArmourMaterial, mod_shinepack.proxy.addArmor("Purple"),1).setUnlocalizedName("PurplePlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleLegs = new PurpleArmor(ConfigurationInts.PurpleLegsID,ShineEnumToolArmorMaterials.PurpleEnumArmourMaterial, mod_shinepack.proxy.addArmor("Purple"),2).setUnlocalizedName("PurpleLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleBoots = new PurpleArmor(ConfigurationInts.PurpleBootsID,ShineEnumToolArmorMaterials.PurpleEnumArmourMaterial, mod_shinepack.proxy.addArmor("Purple"),3).setUnlocalizedName("PurpleBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleIngot = new ShineItem(ConfigurationInts.PurpleIngotID).setUnlocalizedName("PurpleIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleToolFragment = new ShineItem(ConfigurationInts.PurpleToolFragmentID).setUnlocalizedName("PurpleToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleSword = new MyItemSword(ConfigurationInts.PurpleSwordID,ShineEnumToolArmorMaterials.PurpleEnumToolMaterial).setUnlocalizedName("PurpleSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurplePickaxe = new MyItemPickaxe(ConfigurationInts.PurplePickaxeID, ShineEnumToolArmorMaterials.PurpleEnumToolMaterial).setUnlocalizedName("PurplePickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleSpade = new MyItemSpade(ConfigurationInts.PurpleSpadeID, ShineEnumToolArmorMaterials.PurpleEnumToolMaterial).setUnlocalizedName("PurpleSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleAxe = new MyItemAxe(ConfigurationInts.PurpleAxeID, ShineEnumToolArmorMaterials.PurpleEnumToolMaterial).setUnlocalizedName("PurpleAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleDust = new ShineItem(ConfigurationInts.PurpleDustID).setUnlocalizedName("PurpleDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleOre = new ShineBlock(ConfigurationInts.PurpleOreID, Material.iron, "PurpleOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("PurpleOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurpleBlock = new ShineBlock(ConfigurationInts.PurpleBlockID, Material.iron, "PurpleBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("PurpleBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.PurplePaxel = new ItemPaxel(ConfigurationInts.PurplePaxelID, ShineEnumToolArmorMaterials.PurpleEnumToolMaterial).setUnlocalizedName("PurplePaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		//Black
		ItemBlockHolder.BlackHelmet = new BlackArmor(ConfigurationInts.BlackHelmetID, ShineEnumToolArmorMaterials.BlackEnumArmourMaterial, mod_shinepack.proxy.addArmor("Black"),0).setUnlocalizedName("BlackHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackPlate = new BlackArmor(ConfigurationInts.BlackPlateID,ShineEnumToolArmorMaterials.BlackEnumArmourMaterial, mod_shinepack.proxy.addArmor("Black"),1).setUnlocalizedName("BlackPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackLegs = new BlackArmor(ConfigurationInts.BlackLegsID,ShineEnumToolArmorMaterials.BlackEnumArmourMaterial, mod_shinepack.proxy.addArmor("Black"),2).setUnlocalizedName("BlackLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackBoots = new BlackArmor(ConfigurationInts.BlackBootsID,ShineEnumToolArmorMaterials.BlackEnumArmourMaterial, mod_shinepack.proxy.addArmor("Black"),3).setUnlocalizedName("BlackBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackIngot = new ShineItem(ConfigurationInts.BlackIngotID).setUnlocalizedName("BlackIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackToolFragment = new ShineItem(ConfigurationInts.BlackToolFragmentID).setUnlocalizedName("BlackToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackSword = new MyItemSword(ConfigurationInts.BlackSwordID, ShineEnumToolArmorMaterials.BlackEnumToolMaterial).setUnlocalizedName("BlackSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackPickaxe = new MyItemPickaxe(ConfigurationInts.BlackPickaxeID, ShineEnumToolArmorMaterials.BlackEnumToolMaterial).setUnlocalizedName("BlackPickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackSpade = new MyItemSpade(ConfigurationInts.BlackSpadeID, ShineEnumToolArmorMaterials.BlackEnumToolMaterial).setUnlocalizedName("BlackSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackAxe = new MyItemAxe(ConfigurationInts.BlackAxeID, ShineEnumToolArmorMaterials.BlackEnumToolMaterial).setUnlocalizedName("BlackAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackDust = new ShineItem(ConfigurationInts.BlackDustID).setUnlocalizedName("BlackDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackOre = new ShineBlock(ConfigurationInts.BlackOreID, Material.iron, "BlackOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("BlackOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackBlock = new ShineBlock(ConfigurationInts.BlackBlockID, Material.iron, "BlackBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("BlackBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackPaxel = new ItemPaxel(ConfigurationInts.BlackPaxelID, ShineEnumToolArmorMaterials.BlackEnumToolMaterial).setUnlocalizedName("BlackPaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		//Black/White
		ItemBlockHolder.BlackWhiteHelmet = new BlackWhiteArmor(ConfigurationInts.BlackWhiteHelmetID, ShineEnumToolArmorMaterials.BlackWhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("BlackWhite"),0).setUnlocalizedName("BlackWhiteHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhitePlate = new BlackWhiteArmor(ConfigurationInts.BlackWhitePlateID,ShineEnumToolArmorMaterials.BlackWhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("BlackWhite"),1).setUnlocalizedName("BlackWhitePlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteLegs = new BlackWhiteArmor(ConfigurationInts.BlackWhiteLegsID,ShineEnumToolArmorMaterials.BlackWhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("BlackWhite"),2).setUnlocalizedName("BlackWhiteLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteBoots = new BlackWhiteArmor(ConfigurationInts.BlackWhiteBootsID,ShineEnumToolArmorMaterials.BlackWhiteEnumArmourMaterial, mod_shinepack.proxy.addArmor("BlackWhite"),3).setUnlocalizedName("BlackWhiteBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteIngot = new ShineItem(ConfigurationInts.BlackWhiteIngotID).setUnlocalizedName("BlackWhiteIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteToolFragment = new ShineItem(ConfigurationInts.BlackWhiteToolFragmentID).setUnlocalizedName("BlackWhiteToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteSword = new MyItemSword(ConfigurationInts.BlackWhiteSwordID, ShineEnumToolArmorMaterials.BlackWhiteEnumToolMaterial).setUnlocalizedName("BlackWhiteSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhitePickaxe = new MyItemPickaxe(ConfigurationInts.BlackWhitePickaxeID, ShineEnumToolArmorMaterials.BlackWhiteEnumToolMaterial).setUnlocalizedName("BlackWhitePickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteSpade = new MyItemSpade(ConfigurationInts.BlackWhiteSpadeID, ShineEnumToolArmorMaterials.BlackWhiteEnumToolMaterial).setUnlocalizedName("BlackWhiteSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteAxe = new MyItemAxe(ConfigurationInts.BlackWhiteAxeID, ShineEnumToolArmorMaterials.BlackWhiteEnumToolMaterial).setUnlocalizedName("BlackWhiteAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteDust = new ShineItem(ConfigurationInts.BlackWhiteDustID).setUnlocalizedName("BlackWhiteDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteOre = new ShineBlock(ConfigurationInts.BlackWhiteOreID, Material.iron, "BlackWhiteOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("BlackWhiteOre").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteBlock = new ShineBlock(ConfigurationInts.BlackWhiteBlockID, Material.iron, "BlackWhiteBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("BlackWhiteBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhitePaxel = new ItemPaxel(ConfigurationInts.BlackWhitePaxelID, ShineEnumToolArmorMaterials.BlackWhiteEnumToolMaterial).setUnlocalizedName("BlackWhitePaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.BlackWhiteMixedIngot = new ShineItem(ConfigurationInts.BlackWhiteMixedIngotID).setUnlocalizedName("BlackWhiteMixedIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		//Rainbow
		ItemBlockHolder.RainbowHelmet = new RainbowArmor(ConfigurationInts.RainbowHelmetID, ShineEnumToolArmorMaterials.RainbowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Rainbow"),0).setUnlocalizedName("RainbowHelm").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowPlate = new RainbowArmor(ConfigurationInts.RainbowPlateID,ShineEnumToolArmorMaterials.RainbowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Rainbow"),1).setUnlocalizedName("RainbowPlate").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowLegs = new RainbowArmor(ConfigurationInts.RainbowLegsID,ShineEnumToolArmorMaterials.RainbowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Rainbow"),2).setUnlocalizedName("RainbowLeg").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowBoots = new RainbowArmor(ConfigurationInts.RainbowBootsID,ShineEnumToolArmorMaterials.RainbowEnumArmourMaterial, mod_shinepack.proxy.addArmor("Rainbow"),3).setUnlocalizedName("RainbowBoot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowIngot = new ShineItem(ConfigurationInts.RainbowIngotID).setUnlocalizedName("RainbowIngot").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowToolFragment = new ShineItem(ConfigurationInts.RainbowToolFragmentID).setUnlocalizedName("RainbowToolFragment").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowSword = new MyItemSword(ConfigurationInts.RainbowSwordID, ShineEnumToolArmorMaterials.RainbowEnumToolMaterial).setUnlocalizedName("RainbowSword").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowPickaxe = new MyItemPickaxe(ConfigurationInts.RainbowPickaxeID, ShineEnumToolArmorMaterials.RainbowEnumToolMaterial).setUnlocalizedName("RainbowPickaxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowSpade = new MyItemSpade(ConfigurationInts.RainbowSpadeID, ShineEnumToolArmorMaterials.RainbowEnumToolMaterial).setUnlocalizedName("RainbowSpade").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowAxe = new MyItemAxe(ConfigurationInts.RainbowAxeID, ShineEnumToolArmorMaterials.RainbowEnumToolMaterial).setUnlocalizedName("RainbowAxe").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowDust = new ShineItem(ConfigurationInts.RainbowDustID).setUnlocalizedName("RainbowDust").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowBlock = new ShineBlock(ConfigurationInts.RainbowBlockID, Material.iron, "RainbowBlock").setHardness(6.0F).setResistance(3.0F).setUnlocalizedName("RainbowBlock").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowPaxel = new ItemPaxel(ConfigurationInts.RainbowPaxelID, ShineEnumToolArmorMaterials.RainbowEnumToolMaterial).setUnlocalizedName("RainbowPaxel").setCreativeTab(mod_shinepack.tabJVCraft);
		ItemBlockHolder.RainbowOre = new ShineBlock(ConfigurationInts.RainbowOreID, Material.iron, "RainbowOre").setHardness(3.0F).setResistance(3.0F).setUnlocalizedName("RainbowOre").setCreativeTab(mod_shinepack.tabJVCraft);
		/********SpecialPartOfClass********
		 **********************************
		 **********************************/
	}
	public void registerEntites(){
		
		EntityRegistry.addSpawn(ShineSpider.class, 22, 5, 6, EnumCreatureType.monster, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineSpider.name", "Shine Spider");
		//Cow
		EntityRegistry.addSpawn(ShineCow.class, 23, 2, 4, EnumCreatureType.creature, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineCow.name", "Shine Cow");
		//Sheep
		EntityRegistry.addSpawn(ShineSheep.class, 24, 3, 3, EnumCreatureType.creature, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineSheep.name", "Shine Sheep");
		//Chicken
		EntityRegistry.addSpawn(ShineChicken.class, 25, 3, 3, EnumCreatureType.creature, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineChicken.name", "Shine Chicken");
		//Pig
		EntityRegistry.addSpawn(ShinePig.class, 25, 3, 3, EnumCreatureType.creature, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShinePig.name", "Shine Pig");
		//Creeper
		EntityRegistry.addSpawn(ShineCreeper.class, 26, 3, 3, EnumCreatureType.monster, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineCreeper.name", "Shine Creeper");
		//Zombie
		EntityRegistry.addSpawn(ShineZombie.class, 27, 3, 3, EnumCreatureType.monster, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineZombie.name", "Shine Zombie");
		//Skeleton
		EntityRegistry.addSpawn(ShineSkeleton.class, 28, 3, 3, EnumCreatureType.monster, this.Shine);
		LanguageRegistry.instance().addStringLocalization("entity.ShineToolPack.ShineSkeleton.name", "Shine Skeleton");
		//Registering Entites
		EntityRegistry.registerModEntity(ShineSpider.class, "ShineSpider", 20, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShineCow.class, "ShineCow", 21, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShineSheep.class, "ShineSheep", 22, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShineChicken.class, "ShineChicken", 23, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShinePig.class, "ShinePig", 24, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShineZombie.class, "ShineZombie", 25, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShineCreeper.class, "ShineCreeper", 26, this, 80, 3, true);
		EntityRegistry.registerModEntity(ShineSkeleton.class, "ShineSkeleton", 27, this, 80, 3, true);
	}
}
