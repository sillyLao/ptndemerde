package net.mcreator.ptndemerde.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ptndemerde.init.PtndemerdeModMobEffects;

public class EffectChichaTickActifSurEffetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.setYRot((float) (entity.getYRot()
					+ (Math.random() * 4 - 2) * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PtndemerdeModMobEffects.EFFECT_CHICHA.get()) ? _livEnt.getEffect(PtndemerdeModMobEffects.EFFECT_CHICHA.get()).getAmplifier() : 0) + 1)));
			_ent.setXRot((float) (entity.getXRot()
					+ (Math.random() * 4 - 2) * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PtndemerdeModMobEffects.EFFECT_CHICHA.get()) ? _livEnt.getEffect(PtndemerdeModMobEffects.EFFECT_CHICHA.get()).getAmplifier() : 0) + 1)));
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
