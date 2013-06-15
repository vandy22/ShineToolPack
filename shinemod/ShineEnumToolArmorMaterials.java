package net.shinemod;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ShineEnumToolArmorMaterials {
	//Enum Materials
		//BLUE
		static public  EnumArmorMaterial BlueEnumArmourMaterial = EnumHelper.addArmorMaterial("Blue", 36, new int[] { 4, 9, 8, 4 }, 30);
		static public  EnumToolMaterial BlueEnumToolMaterial = EnumHelper.addToolMaterial("Blue", 3, 2000, 12.0F, 3, 25);
		//YELLOW
		static public  EnumArmorMaterial YellowEnumArmourMaterial = EnumHelper.addArmorMaterial("Yellow", 15, new int[] {2, 7, 5, 3}, 25);
		static public  EnumToolMaterial YellowEnumToolMaterial = EnumHelper.addToolMaterial("Yellow", 2, 800, 7.0F, 3, 20);
		//WHITE
		static public  EnumArmorMaterial WhiteEnumArmourMaterial = EnumHelper.addArmorMaterial("White", 33, new int[] {3, 8, 6, 3}, 10);
		static public  EnumToolMaterial WhiteEnumToolMaterial = EnumHelper.addToolMaterial("White", 3, 1561, 8.0F, 3, 10);
		//RED
		static public  EnumArmorMaterial RedEnumArmourMaterial = EnumHelper.addArmorMaterial("Red", 40, new int[] {5, 10, 9, 6}, 32);
		static public  EnumToolMaterial RedEnumToolMaterial = EnumHelper.addToolMaterial("Red", 3, 2600, 13.0F, 4, 25);
		//GREEN
		static public  EnumArmorMaterial GreenEnumArmourMaterial = EnumHelper.addArmorMaterial("Green", 45, new int[] {6, 11, 10, 7}, 34);
		static public  EnumToolMaterial GreenEnumToolMaterial = EnumHelper.addToolMaterial("Green", 3, 3400, 15.0F, 4, 26);
		//PINK
		static public  EnumArmorMaterial PinkEnumArmourMaterial = EnumHelper.addArmorMaterial("Pink", 48, new int[] {7, 12, 11, 8}, 35);
		static public  EnumToolMaterial PinkEnumToolMaterial = EnumHelper.addToolMaterial("Pink", 3, 3900, 16.0F, 5, 27);
		//PURPLE
		static public  EnumArmorMaterial PurpleEnumArmourMaterial = EnumHelper.addArmorMaterial("Purple", 49, new int[]{9, 13, 12, 9}, 37);
		static public  EnumToolMaterial PurpleEnumToolMaterial = EnumHelper.addToolMaterial("Purple", 3, 4300, 18.0F, 6, 29);
		//BLACK
		static public  EnumArmorMaterial BlackEnumArmourMaterial = EnumHelper.addArmorMaterial("Black", 50, new int[] {10, 14, 13, 11}, 38);
		static public  EnumToolMaterial BlackEnumToolMaterial = EnumHelper.addToolMaterial("Black", 3, 4700, 19.0F, 7, 31);
		//WHITE/BLACK
		static public  EnumArmorMaterial BlackWhiteEnumArmourMaterial = EnumHelper.addArmorMaterial("Black", 50, new int[] {14, 25, 17, 16}, 47);
		static public  EnumToolMaterial BlackWhiteEnumToolMaterial = EnumHelper.addToolMaterial("Black", 3, 15000, 22.0F, 15, 49);
		//RAINBOW
		static public  EnumArmorMaterial RainbowEnumArmourMaterial = EnumHelper.addArmorMaterial("Rainbow", 77, new int[] {20, 39, 25, 23}, 60);
		static public  EnumToolMaterial RainbowEnumToolMaterial = EnumHelper.addToolMaterial("Rainbow", 3, 39000, 29.0F, 22, 60);
}
