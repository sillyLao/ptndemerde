
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, PtndemerdeMod.MODID);
	public static final RegistryObject<PaintingVariant> PAINTING_CHILD = REGISTRY.register("painting_child", () -> new PaintingVariant(128, 128));
}
