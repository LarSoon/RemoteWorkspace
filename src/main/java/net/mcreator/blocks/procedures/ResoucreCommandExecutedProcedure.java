package net.mcreator.blocks.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ResoucreCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RecourcespawnerUpdateTickProcedure.execute(world, x, y, z);
		ResourceresontableProcedure.execute(world, x, y, z);
		KeysspawnProcedure.execute(world, x, y, z);
	}
}
