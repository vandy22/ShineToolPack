package net.shinemod;
/**

package tutorialtest;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

public class GuiBasicFurnace extends GuiContainer {

	private TileEntityBasicFurnace BFInventory;
	
	
	
	public GuiBasicFurnace(InventoryPlayer par1IP, TileEntityBasicFurnace par2TEBF){
		super(new ContainerBasicFurnace(par1IP, par2TEBF));
		BFInventory = par2TEBF;
	}

	
	protected void drawGuiContainerBackgroundLayer(int par1, int par2) {
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, (ySize - 96 + 2), 0xffffff);
		
		
	}



	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		int i = mc.renderEngine.getTexture("/tutorial/generic/basicFurnaceGui.png");
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		mc.renderEngine.bindTexture(i);
		
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		
		if(BFInventory.isBurning()){
			int burn = BFInventory.getBurnTimeRemainingScaled(14);
			drawTexturedModalRect(j + 73, k + 59, 176, 16, burn, 10);
		}
	
		int updated = BFInventory.getCookProgressScaled(16);
		
		drawTexturedModalRect(j + 89, k + 55, 191, 15, -updated, -updated);
	}
	
}

*/