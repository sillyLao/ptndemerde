package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PetardDaturaPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(PtndemerdeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PtndemerdeModVariables.PlayerVariables())).drogue + 1;
			entity.getCapability(PtndemerdeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.drogue = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(PtndemerdeModMobEffects.DELETED_MOD_ELEMENT.get(), 3600, 0, false, false));
		if ((entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.REGENERATION)) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000, 1, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.MOVEMENT_SPEED)) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2000, 2, false, false));
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ptndemerde:tirer_une_taf")), SoundSource.NEUTRAL, 1, (float) 0.9);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ptndemerde:tirer_une_taf")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
			}
		}
		if (Math.random() <= 0.2) {
			PtndemerdeMod.queueServerWork(30, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.hurt")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.hurt")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				PtndemerdeMod.queueServerWork(10, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.hurt")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.donkey.hurt")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				});
			});
		}
	}
}
