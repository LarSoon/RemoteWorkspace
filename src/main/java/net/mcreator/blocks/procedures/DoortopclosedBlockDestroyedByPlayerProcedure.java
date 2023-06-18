package net.mcreator.blocks.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.blocks.init.QzModBlocks;

public class DoortopclosedBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.DOORBOTTOMOPEN.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.DOORBOTTOMCLOSED.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.WOODENDOORBOTOMCLOSED.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.WOODENDOORBOTOMOPENED.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.WDBSC.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.WDBSO.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.SAFETYDOORBOTTOMCLOSE.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == QzModBlocks.SAFETYDOORBOTTOMOPEN.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
