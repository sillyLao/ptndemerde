
package net.mcreator.ptndemerde.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ptndemerde.procedures.EffectChichaTickActifSurEffetProcedure;

public class EffectChichaMobEffect extends MobEffect {
	public EffectChichaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6710887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ptndemerde.effect_chicha";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EffectChichaTickActifSurEffetProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
