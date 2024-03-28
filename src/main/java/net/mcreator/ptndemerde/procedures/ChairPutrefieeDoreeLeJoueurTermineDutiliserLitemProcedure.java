package net.mcreator.ptndemerde.procedures;

import net.minecraft.world.entity.Entity;

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
	}
}
