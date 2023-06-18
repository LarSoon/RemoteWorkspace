
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.blocks.world.inventory.WorbenchslotsMenu;
import net.mcreator.blocks.world.inventory.TumbaguiMenu;
import net.mcreator.blocks.world.inventory.SupplyboxMenu;
import net.mcreator.blocks.world.inventory.StorageinventoryMenu;
import net.mcreator.blocks.world.inventory.ImprovementguiMenu;
import net.mcreator.blocks.world.inventory.FuseboxopenMenu;
import net.mcreator.blocks.world.inventory.EjectorrefinMenu;
import net.mcreator.blocks.world.inventory.DeviceguiMenu;
import net.mcreator.blocks.world.inventory.DestroyeddroidguiMenu;
import net.mcreator.blocks.world.inventory.CraftingguiMenu;
import net.mcreator.blocks.world.inventory.CraftingMenu;
import net.mcreator.blocks.world.inventory.ClosetguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class QzModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<SupplyboxMenu> SUPPLYBOX = register("supplybox", (id, inv, extraData) -> new SupplyboxMenu(id, inv, extraData));
	public static final MenuType<EjectorrefinMenu> EJECTORREFIN = register("ejectorrefin", (id, inv, extraData) -> new EjectorrefinMenu(id, inv, extraData));
	public static final MenuType<DestroyeddroidguiMenu> DESTROYEDDROIDGUI = register("destroyeddroidgui", (id, inv, extraData) -> new DestroyeddroidguiMenu(id, inv, extraData));
	public static final MenuType<StorageinventoryMenu> STORAGEINVENTORY = register("storageinventory", (id, inv, extraData) -> new StorageinventoryMenu(id, inv, extraData));
	public static final MenuType<CraftingMenu> CRAFTING = register("crafting", (id, inv, extraData) -> new CraftingMenu(id, inv, extraData));
	public static final MenuType<CraftingguiMenu> CRAFTINGGUI = register("craftinggui", (id, inv, extraData) -> new CraftingguiMenu(id, inv, extraData));
	public static final MenuType<DeviceguiMenu> DEVICEGUI = register("devicegui", (id, inv, extraData) -> new DeviceguiMenu(id, inv, extraData));
	public static final MenuType<ImprovementguiMenu> IMPROVEMENTGUI = register("improvementgui", (id, inv, extraData) -> new ImprovementguiMenu(id, inv, extraData));
	public static final MenuType<FuseboxopenMenu> FUSEBOXOPEN = register("fuseboxopen", (id, inv, extraData) -> new FuseboxopenMenu(id, inv, extraData));
	public static final MenuType<ClosetguiMenu> CLOSETGUI = register("closetgui", (id, inv, extraData) -> new ClosetguiMenu(id, inv, extraData));
	public static final MenuType<TumbaguiMenu> TUMBAGUI = register("tumbagui", (id, inv, extraData) -> new TumbaguiMenu(id, inv, extraData));
	public static final MenuType<WorbenchslotsMenu> WORBENCHSLOTS = register("worbenchslots", (id, inv, extraData) -> new WorbenchslotsMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
