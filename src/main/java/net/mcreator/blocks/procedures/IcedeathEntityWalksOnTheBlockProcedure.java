package net.mcreator.blocks.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class IcedeathEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC, 1);
	}
}
