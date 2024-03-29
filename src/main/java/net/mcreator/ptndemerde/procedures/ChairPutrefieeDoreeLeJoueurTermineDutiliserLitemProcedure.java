package net.mcreator.ptndemerde.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ptndemerde.network.PtndemerdeModVariables;

public class ChairPutrefieeDoreeLeJoueurTermineDutiliserLitemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 8;
			entity.getCapability(PtndemerdeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.drogue = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 2));
	}
}
