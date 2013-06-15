package net.shinemod.dimensions;

import java.util.Random;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.shinemod.configuration.ItemBlockHolder;
import net.shinemod.creatures.ShineChicken;
import net.shinemod.creatures.ShineCow;
import net.shinemod.creatures.ShineCreeper;
import net.shinemod.creatures.ShinePig;
import net.shinemod.creatures.ShineSheep;
import net.shinemod.creatures.ShineSkeleton;
import net.shinemod.creatures.ShineSpider;
import net.shinemod.creatures.ShineZombie;

public class BiomeShine extends BiomeGenBase {

	public BiomeShine(int par1) 
	{
		super(par1);
		this.setBiomeName("Shine");
		this.fillerBlock = (byte) ItemBlockHolder.SDirt.blockID;
		this.topBlock = (byte) ItemBlockHolder.SGrass.blockID;
		this.maxHeight = 0.55f;
		this.minHeight = 0;
		this.theBiomeDecorator.treesPerChunk = 3;
		/**Adding My Monsters/Creatures**/
		this.spawnableCreatureList.add(new SpawnListEntry(ShineCow.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(ShineSpider.class, 10, 4, 4));
        this.spawnableCreatureList.add(new SpawnListEntry(ShineSheep.class, 10, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(ShineCreeper.class, 10, 4, 4));
        this.spawnableCreatureList.add(new SpawnListEntry(ShinePig.class, 10, 4, 4));
        this.spawnableCreatureList.add(new SpawnListEntry(ShineChicken.class, 10, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(ShineZombie.class, 10, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(ShineSkeleton.class, 10, 4, 4));
		/**Despawning Other Monsters**/
        this.spawnableCreatureList.remove(new SpawnListEntry(EntitySheep.class, 12, 4, 4));
        this.spawnableCreatureList.remove(new SpawnListEntry(EntityPig.class, 10, 4, 4));
        this.spawnableCreatureList.remove(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
        this.spawnableCreatureList.remove(new SpawnListEntry(EntityCow.class, 8, 4, 4));
        this.spawnableMonsterList.remove(new SpawnListEntry(EntitySpider.class, 10, 4, 4));
        this.spawnableMonsterList.remove(new SpawnListEntry(EntityZombie.class, 10, 4, 4));
        this.spawnableMonsterList.remove(new SpawnListEntry(EntitySkeleton.class, 10, 4, 4));
        this.spawnableMonsterList.remove(new SpawnListEntry(EntitySlime.class, 10, 4, 4));
        this.spawnableMonsterList.remove(new SpawnListEntry(EntityEnderman.class, 1, 1, 4));
        this.spawnableWaterCreatureList.remove(new SpawnListEntry(EntitySquid.class, 10, 4, 4));
        this.spawnableCaveCreatureList.remove(new SpawnListEntry(EntityBat.class, 10, 8, 8));
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return (WorldGenerator)(par1Random.nextInt(3) == 0 ? new WorldGenShineTrees() : new WorldGenShine2(true));
	}
}
