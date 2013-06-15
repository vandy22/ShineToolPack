package net.shinemod;

 import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.shinemod.configuration.ItemBlockHolder;
import net.shinemod.dimensions.ShineWorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

 public class OreWorldGen implements IWorldGenerator 
 {

 @Override
 public void generate(Random random, int chunkX, int chunkZ, World world,
 IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
 {
 switch(world.provider.dimensionId) {
 case -1:
 generateNether();
 break;
 case 0:
 generateSurface(world, random, chunkX*16, chunkZ*16);
 break;
 case 1:
 generateEnd();
 break;
 case 20:
 generateShine(world, random, chunkX * 16, chunkZ * 16);
 break;
 case 21:
 generateEclipse(world, random, chunkX * 16, chunkZ * 16);
 break;
 case 22:
 generateCryptic(world, random, chunkX * 16, chunkZ * 16);
 }
 }

 
 
 
 
 
 
 private void generateCryptic(World world, Random random, int i, int j) {
	// TODO Auto-generated method stub
	
}







private void generateEclipse(World world, Random rand, int chunkX, int chunkZ) 
 {
 	//BlackWhite ORE
 	 /*
 	 for (int i = 0; i < 10; i++) 
 	 {
 	 //16x16 area up to y = 64
 	 int randPosX = chunkX + rand.nextInt(16);
 	 int randPosY = rand.nextInt(64);
 	 int randPosZ = chunkZ + rand.nextInt(16);
 	 // 10 blocks per vein
 	 (new WorldGenMinable(mod_tutorial.CrypticBlock.blockID, 10)).generate(world, rand,
 	 randPosX, randPosY, randPosZ);
 	 }
	*/
 }

 private void generateShine(World world, Random rand, int chunkX, int chunkZ) 
{
	//BlackWhite ORE
	 /*
	 for (int i = 0; i < 10; i++) 
	 {
	 //16x16 area up to y = 64
	 int randPosX = chunkX + rand.nextInt(16);
	 int randPosY = rand.nextInt(20);
	 int randPosZ = chunkZ + rand.nextInt(16);
	 // 10 blocks per vein
	 (new ShineWorldGenMinable(mod_tutorial.BlackWhiteOre.blockID, 2)).generate(world, rand,
	 randPosX, randPosY, randPosZ);
	 }

	 for (int i = 0; i < 10; i++) 
	 {
	 //16x16 area up to y = 64
	 int randPosX = chunkX + rand.nextInt(16);
	 int randPosY = rand.nextInt(16);
	 int randPosZ = chunkZ + rand.nextInt(16);
	 // 10 blocks per vein
	 (new ShineWorldGenMinable(mod_tutorial.RainbowOre.blockID, 1)).generate(world, rand,
	 randPosX, randPosY, randPosZ);
	 }
	 */
	 for (int i = 0; i < 15; i++) 
 	 {
 	 //16x16 area up to y = 64
 	 int randPosX = chunkX + rand.nextInt(16);
 	 int randPosY = rand.nextInt(64);
 	 int randPosZ = chunkZ + rand.nextInt(16);
 	 // 10 blocks per vein
 	 (new ShineWorldGenMinable(ItemBlockHolder.EclipseBlock.blockID, 4)).generate(world, rand,
 	 randPosX, randPosY, randPosZ);
 	 }

}


public void generateNether() 
{

}

 public void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
 {
 // 30 veins of ore per chunk
//YELLOW ORE 
	 
for (int i = 0; i < 12; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(64);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.YellowOre.blockID, 8)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }

 //BLUE ORE
 
 for (int i = 0; i < 10; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(60);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.BlueOre.blockID, 7)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 
 //RED ORE
 
 for (int i = 0; i < 10; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(54);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.RedOre.blockID, 6)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 
 //GREEN ORE
 
 for (int i = 0; i < 8; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(46);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.GreenOre.blockID, 4)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 
 //Silver ORE
 
 for (int i = 0; i < 11; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(64);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.SilverOre.blockID, 8)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 
 //PINK ORE
 
 for (int i = 0; i < 7; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(42);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.PinkOre.blockID, 5)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 
 //PURPLE ORE
 
 for (int i = 0; i < 5; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(37);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.PurpleOre.blockID, 4)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 
 //BLACK ORE
 
 for (int i = 0; i < 5; i++) 
 {
 //16x16 area up to y = 64
 int randPosX = chunkX + rand.nextInt(16);
 int randPosY = rand.nextInt(34);
 int randPosZ = chunkZ + rand.nextInt(16);
 // 10 blocks per vein
 (new WorldGenMinable(ItemBlockHolder.BlackOre.blockID, 4)).generate(world, rand,
 randPosX, randPosY, randPosZ);
 }
 }
 
 public void generateEnd() 
 {

 }

 }
