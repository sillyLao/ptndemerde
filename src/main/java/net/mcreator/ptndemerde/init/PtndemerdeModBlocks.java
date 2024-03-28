
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ptndemerde.block.ChichaBlock;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PtndemerdeMod.MODID);
	public static final RegistryObject<Block> CHICHA = REGISTRY.register("chicha", () -> new ChichaBlock());
}
