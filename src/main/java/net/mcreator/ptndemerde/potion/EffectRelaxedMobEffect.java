
package net.mcreator.ptndemerde.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EffectRelaxedMobEffect extends MobEffect {
	public EffectRelaxedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16724941);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ptndemerde.effect_relaxed";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
