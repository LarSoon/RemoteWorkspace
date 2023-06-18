
package net.mcreator.blocks.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HidersMobEffect extends MobEffect {
	public HidersMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16776961);
	}

	@Override
	public String getDescriptionId() {
		return "effect.qz.hiders";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
