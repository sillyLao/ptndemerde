
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ptndemerde.potion.EffectRelaxedMobEffect;
import net.mcreator.ptndemerde.potion.EffectChichaMobEffect;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PtndemerdeMod.MODID);
	public static final RegistryObject<MobEffect> EFFECT_CHICHA = REGISTRY.register("effect_chicha", () -> new EffectChichaMobEffect());
	public static final RegistryObject<MobEffect> EFFECT_RELAXED = REGISTRY.register("effect_relaxed", () -> new EffectRelaxedMobEffect());
}
