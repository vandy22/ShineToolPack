package net.shinemod;

import java.io.File;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.shinemod.common.CommonProxy.CommonProxy;
import net.shinemod.configuration.ConfigBlockRegisters;
import net.shinemod.configuration.ConfigLanguageRegisters;
import net.shinemod.configuration.ConfigRecipeRegisters;
import net.shinemod.configuration.ConfigSmeltRegisters;
import net.shinemod.configuration.ConfigurationHandler;
import net.shinemod.configuration.ConfigurationInitializing_EntityRegistering;
import net.shinemod.configuration.ConfigurationInts;
import net.shinemod.configuration.ItemBlockHolder;
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
import net.shinemod.dimensions.CrypticWorldProvider;
import net.shinemod.dimensions.EclipsePortal;
import net.shinemod.dimensions.EclipseWorldProvider;
import net.shinemod.dimensions.ShrinePortal;
import net.shinemod.dimensions.WorldGenShineTrees;
import net.shinemod.dimensions.WorldProviderShrine;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.shinemod.dimensions.CrypticPortal;

@Mod(modid = "ShineToolPack", name = "ShineToolPack", version = "1.5.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class mod_shinepack { 
	
	
	//CreativeTabs
	public static CreativeTabs tabJVCraft = new CreativeTabJVCraft(CreativeTabs.getNextID(), "tabJVCraft", "JVCraft");
	
	@SidedProxy(clientSide = "net.shinemod.client.ClientProxy.ClientProxy", serverSide = "net.shinemod.common.CommonProxy.CommonProxy")
	public static CommonProxy proxy;
       
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsoluteFile()+ "ShineToolPack" + ".cfg"));
		
	}	 
	
	@Init
	public void load(FMLInitializationEvent event){
	
	//Dimension
	DimensionManager.registerProviderType(20, WorldProviderShrine.class, false);
	DimensionManager.registerDimension(20, 20);
	DimensionManager.registerProviderType(21, EclipseWorldProvider.class, false);
	DimensionManager.registerDimension(21, 21);
	DimensionManager.registerProviderType(22, CrypticWorldProvider.class, false);
	DimensionManager.registerDimension(22, 22); 
	
	/*Entity Registers *\
	 *******************
	 */
	//\\EntityRegistersShine.RegisterEntitys();
	
	/*Configuration Inizilazers *\
	 *******************
	 */
	ConfigurationInitializing_EntityRegistering.Initalize();
	/*Configuration BlockRegisters *\
	 *******************
	 */
	ConfigBlockRegisters.blockRegisters();
	/*Configuration SmeltRegisters *\
	 *******************
	 */
	ConfigSmeltRegisters.SmeltRegisters();
	/*Configuration RecipeRegisters *\
	 *******************
	 */
	ConfigRecipeRegisters.RecipeRegisters();
	/*Configuration LanguageRegisters *\
	 *******************
	 */
	 ConfigLanguageRegisters.LanguageRegisters();
	
	 //Ore Generation
	GameRegistry.registerWorldGenerator(new OreWorldGen());
	GameRegistry.registerWorldGenerator(new WorldGenShineTrees());
	//GameRegistry.registerWorldGenerator(new WorldGenShine2(false));

	registerEntityEgg(ShineSpider.class, 0x25630C, 0xEB46E0);
	registerEntityEgg(ShineCow.class, 0x35630C, 0xFB46E0);
	registerEntityEgg(ShinePig.class, 0x25630C, 0xEB46E0);
	registerEntityEgg(ShineSheep.class, 0x35630C, 0xFB46E0);
	registerEntityEgg(ShineCreeper.class, 0x25630C, 0xEB46E0);
	registerEntityEgg(ShineZombie.class, 0x35630C, 0xFB46E0);
	registerEntityEgg(ShineSkeleton.class, 0x25630C, 0xEB46E0);
	registerEntityEgg(ShineChicken.class, 0x35630C, 0xFB46E0);

}

public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
{
      if(ConfigurationInts.RespawnEggs == true){  
		int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
      }
}


	public static int getUniqueEntityId(){
    if(ConfigurationInts.RespawnEggs == true){
	do
    {
            ItemBlockHolder.startEntityId++;
    }
    while(EntityList.getStringFromID(ItemBlockHolder.startEntityId) != null);
   
   
    }
    	return ItemBlockHolder.startEntityId;
    }

}			
	
		
		
		