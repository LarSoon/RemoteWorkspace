
package net.mcreator.blocks.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.blocks.init.QzModTabs;

public class KeysItem extends Item {
	public KeysItem() {
		super(new Item.Properties().tab(QzModTabs.TAB_BL_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
