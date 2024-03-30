package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MuAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double xhound = 0;
		double yhound = 0;
		double zhound = 0;
		if (Math.random() > 0.997) {
			if (entity instanceof MuEntity) {
				((MuEntity) entity).setAnimation("attack");
			}
			xhound = entity.getX() + Math.ceil(Math.random() * 30);
			yhound = entity.getY() + Math.ceil(Math.random() * 10);
			zhound = entity.getZ() + Math.ceil(Math.random() * 30);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = PtndemerdeModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(xhound, yhound, zhound), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			for (int index0 = 0; index0 < 10; index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = PtndemerdeModEntities.LAMBDA_BAT.get().spawn(_level, BlockPos.containing(xhound, yhound, zhound), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setXRot(3);
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
	}
}
