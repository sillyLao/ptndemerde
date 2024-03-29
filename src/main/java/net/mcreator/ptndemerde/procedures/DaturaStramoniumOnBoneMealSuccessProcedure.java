package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DaturaStramoniumOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double tempx = 0;
		double tempz = 0;
		tempx = -2;
		tempz = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				if ((world.getBlockState(BlockPos.containing(x - tempx, y - 1, z - tempz))).getBlock() == Blocks.PODZOL) {
					if (Math.random() <= 0.08) {
						world.setBlock(BlockPos.containing(x - tempx, y, z - tempz), PtndemerdeModBlocks.DATURA_STRAMONIUM.get().defaultBlockState(), 3);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (x - tempx), y, (z - tempz), 10, 0.5, 0.5, 0.5, 0.01);
						world.setBlock(BlockPos.containing(x - tempx, y + 2, z - tempz), Blocks.DIORITE_STAIRS.defaultBlockState(), 3);
					}
				}
				tempx = tempx + 1;
			}
			tempz = tempz + 1;
		}
	}
}
