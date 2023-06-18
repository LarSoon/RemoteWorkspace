
package net.mcreator.blocks.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.blocks.init.QzModTabs;

public class FusebrokenItem extends Item {
	public FusebrokenItem() {
		super(new Item.Properties().tab(QzModTabs.TAB_BL_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
