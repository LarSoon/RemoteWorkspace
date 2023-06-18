
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.blocks.client.gui.WorbenchslotsScreen;
import net.mcreator.blocks.client.gui.TumbaguiScreen;
import net.mcreator.blocks.client.gui.SupplyboxScreen;
import net.mcreator.blocks.client.gui.StorageinventoryScreen;
import net.mcreator.blocks.client.gui.ImprovementguiScreen;
import net.mcreator.blocks.client.gui.FuseboxopenScreen;
import net.mcreator.blocks.client.gui.EjectorrefinScreen;
import net.mcreator.blocks.client.gui.DeviceguiScreen;
import net.mcreator.blocks.client.gui.DestroyeddroidguiScreen;
import net.mcreator.blocks.client.gui.CraftingguiScreen;
import net.mcreator.blocks.client.gui.CraftingScreen;
import net.mcreator.blocks.client.gui.ClosetguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class QzModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(QzModMenus.SUPPLYBOX, SupplyboxScreen::new);
			MenuScreens.register(QzModMenus.EJECTORREFIN, EjectorrefinScreen::new);
			MenuScreens.register(QzModMenus.DESTROYEDDROIDGUI, DestroyeddroidguiScreen::new);
			MenuScreens.register(QzModMenus.STORAGEINVENTORY, StorageinventoryScreen::new);
			MenuScreens.register(QzModMenus.CRAFTING, CraftingScreen::new);
			MenuScreens.register(QzModMenus.CRAFTINGGUI, CraftingguiScreen::new);
			MenuScreens.register(QzModMenus.DEVICEGUI, DeviceguiScreen::new);
			MenuScreens.register(QzModMenus.IMPROVEMENTGUI, ImprovementguiScreen::new);
			MenuScreens.register(QzModMenus.FUSEBOXOPEN, FuseboxopenScreen::new);
			MenuScreens.register(QzModMenus.CLOSETGUI, ClosetguiScreen::new);
			MenuScreens.register(QzModMenus.TUMBAGUI, TumbaguiScreen::new);
			MenuScreens.register(QzModMenus.WORBENCHSLOTS, WorbenchslotsScreen::new);
		});
	}
}
