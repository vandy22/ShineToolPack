package net.shinemod.dimensions;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.shinemod.configuration.ItemBlockHolder;

public class CrypticWorldProvider extends WorldProvider
{
	 
//The WorldProvider covers all the basics of the dimension. Look in WorldProviderBase.java and
//WorldProvider.java for all the potential qualities you can assign to your dimension.


	//The save file will be called DIM65 (DIM + id number).

public String getDimensionName(){
	return "Cryptic";
}
/**
public static WorldProvider getProviderForDimension(int par0)
{
    return DimensionManager.createProviderFor(20);
    
}
**/
//You can use an existing WorldChunkManager, or create your own. You must create your own to
//add multiple unique biomes to a dimension.
public void registerWorldChunkManager()
{

	worldChunkMgr = new WorldChunkManagerHell(ItemBlockHolder.Cryptic, 1.0F, 0.0F); //Your Biome goes here
	this.hasNoSky = false;
}

//This is where you define your terrain generator.
public IChunkProvider createChunkGenerator()
{
	return new ChunkProviderCryptic(worldObj, worldObj.getSeed(), false);
}

//Note that, if you respawn in the dimension, you will end up at the coordinates of your
//overworld spawn point, not at the location of your first entrance to the dimension or
//something like that. Note also that beds don't work if you cannot respawn in the dimension.
public boolean canRespawnHere()
{
	return false;
}
}


/*
public float calculateCelestialAngleShine(long par1, float par3)
{
    int j = (int)(par1 % 24000L);
    float f1 = ((float)j + par3) / 24000.0F - 0.25F;

    if (f1 < 0.0F)
    {
        ++f1;
    }

    if (f1 > 1.0F)
    {
        --f1;
    }

    float f2 = f1;
    f1 = 1.0F - (float)((Math.cos((double)f1 * Math.PI) + 1.0D) / 2.0D);
    f1 = f2 + (f1 - f2) / 3.0F;
    return f1;
}
*/
