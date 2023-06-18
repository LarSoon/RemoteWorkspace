
package net.mcreator.blocks.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.blocks.procedures.BioOnPotionActiveTickProcedure;

public class BioMobEffect extends MobEffect {
	public BioMobEffect() {
		super(MobEffectCategory.HARMFUL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.qz.bio";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BioOnPotionActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
