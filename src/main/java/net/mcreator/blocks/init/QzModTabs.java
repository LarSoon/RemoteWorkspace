
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class QzModTabs {
	public static CreativeModeTab TAB_BLOCKS;
	public static CreativeModeTab TAB_BL_ITEMS;
	public static CreativeModeTab TAB_DOORS;
	public static CreativeModeTab TAB_INTERACTIVE_BLOCK;
	public static CreativeModeTab TAB_DECORATION;

	public static void load() {
		TAB_BLOCKS = new CreativeModeTab("tabblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(QzModBlocks.METAL_1.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BL_ITEMS = new CreativeModeTab("tabbl_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(QzModItems.SCRAP.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DOORS = new CreativeModeTab("tabdoors") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.IRON_DOOR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_INTERACTIVE_BLOCK = new CreativeModeTab("tabinteractive_block") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(QzModBlocks.SUPPLY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DECORATION = new CreativeModeTab("tabdecoration") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(QzModBlocks.DECORATIVECRATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
