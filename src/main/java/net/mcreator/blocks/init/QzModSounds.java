
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class QzModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("qz", "scan_break"), new SoundEvent(new ResourceLocation("qz", "scan_break")));
		REGISTRY.put(new ResourceLocation("qz", "click"), new SoundEvent(new ResourceLocation("qz", "click")));
		REGISTRY.put(new ResourceLocation("qz", "cassete_player"), new SoundEvent(new ResourceLocation("qz", "cassete_player")));
		REGISTRY.put(new ResourceLocation("qz", "tumba"), new SoundEvent(new ResourceLocation("qz", "tumba")));
		REGISTRY.put(new ResourceLocation("qz", "data"), new SoundEvent(new ResourceLocation("qz", "data")));
		REGISTRY.put(new ResourceLocation("qz", "safe_door_open"), new SoundEvent(new ResourceLocation("qz", "safe_door_open")));
		REGISTRY.put(new ResourceLocation("qz", "safe_door_close"), new SoundEvent(new ResourceLocation("qz", "safe_door_close")));
		REGISTRY.put(new ResourceLocation("qz", "wooden_door_close"), new SoundEvent(new ResourceLocation("qz", "wooden_door_close")));
		REGISTRY.put(new ResourceLocation("qz", "wooden_door_open"), new SoundEvent(new ResourceLocation("qz", "wooden_door_open")));
		REGISTRY.put(new ResourceLocation("qz", "cs_door"), new SoundEvent(new ResourceLocation("qz", "cs_door")));
		REGISTRY.put(new ResourceLocation("qz", "iron_door_1"), new SoundEvent(new ResourceLocation("qz", "iron_door_1")));
		REGISTRY.put(new ResourceLocation("qz", "door_stop"), new SoundEvent(new ResourceLocation("qz", "door_stop")));
		REGISTRY.put(new ResourceLocation("qz", "pills_use"), new SoundEvent(new ResourceLocation("qz", "pills_use")));
		REGISTRY.put(new ResourceLocation("qz", "pills_pickup"), new SoundEvent(new ResourceLocation("qz", "pills_pickup")));
		REGISTRY.put(new ResourceLocation("qz", "keys_pickup"), new SoundEvent(new ResourceLocation("qz", "keys_pickup")));
		REGISTRY.put(new ResourceLocation("qz", "medkit"), new SoundEvent(new ResourceLocation("qz", "medkit")));
		REGISTRY.put(new ResourceLocation("qz", "opens"), new SoundEvent(new ResourceLocation("qz", "opens")));
		REGISTRY.put(new ResourceLocation("qz", "none"), new SoundEvent(new ResourceLocation("qz", "none")));
		REGISTRY.put(new ResourceLocation("qz", "barrel"), new SoundEvent(new ResourceLocation("qz", "barrel")));
		REGISTRY.put(new ResourceLocation("qz", "keys"), new SoundEvent(new ResourceLocation("qz", "keys")));
		REGISTRY.put(new ResourceLocation("qz", "keys_sp"), new SoundEvent(new ResourceLocation("qz", "keys_sp")));
		REGISTRY.put(new ResourceLocation("qz", "locker_open"), new SoundEvent(new ResourceLocation("qz", "locker_open")));
		REGISTRY.put(new ResourceLocation("qz", "supplyopen"), new SoundEvent(new ResourceLocation("qz", "supplyopen")));
		REGISTRY.put(new ResourceLocation("qz", "pickup"), new SoundEvent(new ResourceLocation("qz", "pickup")));
		REGISTRY.put(new ResourceLocation("qz", "openejector"), new SoundEvent(new ResourceLocation("qz", "openejector")));
		REGISTRY.put(new ResourceLocation("qz", "alert14"), new SoundEvent(new ResourceLocation("qz", "alert14")));
		REGISTRY.put(new ResourceLocation("qz", "scaning"), new SoundEvent(new ResourceLocation("qz", "scaning")));
		REGISTRY.put(new ResourceLocation("qz", "electro"), new SoundEvent(new ResourceLocation("qz", "electro")));
		REGISTRY.put(new ResourceLocation("qz", "metal_equip"), new SoundEvent(new ResourceLocation("qz", "metal_equip")));
		REGISTRY.put(new ResourceLocation("qz", "ejector_storage"), new SoundEvent(new ResourceLocation("qz", "ejector_storage")));
		REGISTRY.put(new ResourceLocation("qz", "crowbar"), new SoundEvent(new ResourceLocation("qz", "crowbar")));
		REGISTRY.put(new ResourceLocation("qz", "usb"), new SoundEvent(new ResourceLocation("qz", "usb")));
		REGISTRY.put(new ResourceLocation("qz", "pc_usb"), new SoundEvent(new ResourceLocation("qz", "pc_usb")));
		REGISTRY.put(new ResourceLocation("qz", "cloth_equip"), new SoundEvent(new ResourceLocation("qz", "cloth_equip")));
		REGISTRY.put(new ResourceLocation("qz", "alert2"), new SoundEvent(new ResourceLocation("qz", "alert2")));
		REGISTRY.put(new ResourceLocation("qz", "wood"), new SoundEvent(new ResourceLocation("qz", "wood")));
		REGISTRY.put(new ResourceLocation("qz", "geiger"), new SoundEvent(new ResourceLocation("qz", "geiger")));
		REGISTRY.put(new ResourceLocation("qz", "spark_1"), new SoundEvent(new ResourceLocation("qz", "spark_1")));
		REGISTRY.put(new ResourceLocation("qz", "wbidle"), new SoundEvent(new ResourceLocation("qz", "wbidle")));
		REGISTRY.put(new ResourceLocation("qz", "craft"), new SoundEvent(new ResourceLocation("qz", "craft")));
		REGISTRY.put(new ResourceLocation("qz", "solids_block_hit"), new SoundEvent(new ResourceLocation("qz", "solids_block_hit")));
		REGISTRY.put(new ResourceLocation("qz", "metal_hit"), new SoundEvent(new ResourceLocation("qz", "metal_hit")));
		REGISTRY.put(new ResourceLocation("qz", "concrete_hit"), new SoundEvent(new ResourceLocation("qz", "concrete_hit")));
		REGISTRY.put(new ResourceLocation("qz", "glass_hit"), new SoundEvent(new ResourceLocation("qz", "glass_hit")));
		REGISTRY.put(new ResourceLocation("qz", "locker_close"), new SoundEvent(new ResourceLocation("qz", "locker_close")));
		REGISTRY.put(new ResourceLocation("qz", "wb"), new SoundEvent(new ResourceLocation("qz", "wb")));
		REGISTRY.put(new ResourceLocation("qz", "unequip"), new SoundEvent(new ResourceLocation("qz", "unequip")));
		REGISTRY.put(new ResourceLocation("qz", "duck"), new SoundEvent(new ResourceLocation("qz", "duck")));
		REGISTRY.put(new ResourceLocation("qz", "closet"), new SoundEvent(new ResourceLocation("qz", "closet")));
		REGISTRY.put(new ResourceLocation("qz", "locekr_closed"), new SoundEvent(new ResourceLocation("qz", "locekr_closed")));
		REGISTRY.put(new ResourceLocation("qz", "wall_medkit"), new SoundEvent(new ResourceLocation("qz", "wall_medkit")));
		REGISTRY.put(new ResourceLocation("qz", "spawnpoint"), new SoundEvent(new ResourceLocation("qz", "spawnpoint")));
		REGISTRY.put(new ResourceLocation("qz", "vent_close"), new SoundEvent(new ResourceLocation("qz", "vent_close")));
		REGISTRY.put(new ResourceLocation("qz", "vent_open"), new SoundEvent(new ResourceLocation("qz", "vent_open")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
