
package net.mcreator.blocks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.blocks.init.QzModTabs;
import net.mcreator.blocks.init.QzModFluids;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(QzModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(QzModTabs.TAB_BL_ITEMS));
	}
}
