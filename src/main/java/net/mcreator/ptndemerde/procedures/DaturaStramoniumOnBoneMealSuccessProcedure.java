package net.mcreator.ptndemerde.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DaturaStramoniumOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double tempx = 0;
		double tempz = 0;
		tempz = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			tempx = -2;
			for (int index1 = 0; index1 < 5; index1++) {
				if ((world.getBlockState(BlockPos.containing(x - tempx, y - 1, z - tempz))).getBlock() == Blocks.PODZOL) {
					if ((world.getBlockState(BlockPos.containing(x - tempx, y, z - tempz))).getBlock() == Blocks.AIR) {
						if (Math.random() <= 0.08) {
							world.setBlock(BlockPos.containing(x - tempx, y, z - tempz), blockstate, 3);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (x - tempx + 0.5), (y + 0.5), (z - tempz + 0.5), 10, 0, 0, 0, 0.01);
						}
					}
				}
				tempx = tempx + 1;
			}
			tempz = tempz + 1;
		}
	}
}
