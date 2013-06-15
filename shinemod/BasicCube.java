package net.shinemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicCube extends Block{

	public BasicCube(int par1, Material par2Material) {
		super(par1, par2Material);
		par2Material = Material.fire;
		}
	}