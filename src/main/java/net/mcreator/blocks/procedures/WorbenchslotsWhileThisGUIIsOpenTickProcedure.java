package net.mcreator.blocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WorbenchslotsWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double previousRecipe = 0;
		if (entity.getPersistentData().getDouble("wb") == 0) {
			entity.getPersistentData().putDouble("wb", 100);
		} else {
			entity.getPersistentData().putDouble("wb", (entity.getPersistentData().getDouble("wb") - 1));
		}
		if (entity.getPersistentData().getDouble("wb") == 0) {
			if (!world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("qz:wbidle")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("qz:wbidle")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}
}
