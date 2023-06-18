package net.mcreator.blocks.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blocks.init.QzModBlocks;

public class EjectorBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == QzModBlocks.EJECTOR.get()) {
			world.destroyBlock(new BlockPos(x, y + 1, z), false);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == QzModBlocks.EJECTORUP.get()) {
			world.destroyBlock(new BlockPos(x, y - 0, z), false);
		}
	}
}
