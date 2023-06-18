
package net.mcreator.blocks.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SeekersMobEffect extends MobEffect {
	public SeekersMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.qz.seekers";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
