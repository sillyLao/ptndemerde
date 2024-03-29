package net.mcreator.ptndemerde.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.ptndemerde.network.PtndemerdeModVariables;

import java.util.ArrayList;

public class ProcedurePorcDrogueProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean check = false;
		check = false;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getCapability(PtndemerdeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PtndemerdeModVariables.PlayerVariables())).drogue >= 10) {
				check = true;
			}
		}
		if (check == true) {
			return true;
		}
		return false;
	}
}
