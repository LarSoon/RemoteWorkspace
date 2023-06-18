package net.mcreator.blocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blocks.init.QzModBlocks;

public class DoorbottomopenBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.DOORTOPOPENED.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.DOORTOPCLOSED.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.WOODENDOORTOPCLOSED.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.WOODENDOORTOPOPENED.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.WDTSO.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.WDTSC.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.SAFETYDOORTOPCLOSED.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == QzModBlocks.SAFETYDOORTOPOPENED.get()) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
