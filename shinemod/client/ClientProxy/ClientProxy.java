package net.shinemod.client.ClientProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import net.shinemod.common.CommonProxy.CommonProxy;
import net.shinemod.creatures.RenderShineSpider;
import net.shinemod.creatures.ShineChicken;
import net.shinemod.creatures.ShineCow;
import net.shinemod.creatures.ShineCreeper;
import net.shinemod.creatures.ShinePig;
import net.shinemod.creatures.ShineSheep;
import net.shinemod.creatures.ShineSkeleton;
import net.shinemod.creatures.ShineSpider;
import net.shinemod.creatures.ShineZombie;

public class ClientProxy extends CommonProxy {

public static String BLOCKS_PNG = "/tutorial/generic/block.png";
public static String ITEMS_PNG = "/tutorial/generic/items.png";
public static String FURNACE_PNG = "/tutorial/generic/furnace.png";

public static void registerRenderThings() {

MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
MinecraftForgeClient.preloadTexture(ITEMS_PNG);
MinecraftForgeClient.preloadTexture(FURNACE_PNG);
}


public int addArmor(String armor){
	return RenderingRegistry.addNewArmourRendererPrefix(armor);
}
public static void registerRenders(){
	RenderingRegistry.registerEntityRenderingHandler(ShineSpider.class, new RenderShineSpider());
	RenderingRegistry.registerEntityRenderingHandler(ShineCow.class, new RenderCow(null, 0));
	RenderingRegistry.registerEntityRenderingHandler(ShineSheep.class, new RenderSheep(null, null, 0));
	RenderingRegistry.registerEntityRenderingHandler(ShineChicken.class, new RenderChicken(null, 0));
	RenderingRegistry.registerEntityRenderingHandler(ShinePig.class, new RenderPig(null, null, 0));
	RenderingRegistry.registerEntityRenderingHandler(ShineCreeper.class, new RenderCreeper());
	RenderingRegistry.registerEntityRenderingHandler(ShineSkeleton.class, new RenderSkeleton());
	RenderingRegistry.registerEntityRenderingHandler(ShineZombie.class, new RenderZombie());
}
}