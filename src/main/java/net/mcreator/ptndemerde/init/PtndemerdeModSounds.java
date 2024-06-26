
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PtndemerdeMod.MODID);
	public static final RegistryObject<SoundEvent> MONDE_TECHNOLOGIQUE = REGISTRY.register("monde_technologique", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ptndemerde", "monde_technologique")));
}
