
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.ptndemerde.item.MondeTechnologiqueItem;
import net.mcreator.ptndemerde.item.FalinSwordItem;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PtndemerdeMod.MODID);
	public static final RegistryObject<Item> MONDE_TECHNOLOGIQUE = REGISTRY.register("monde_technologique", () -> new MondeTechnologiqueItem());
	public static final RegistryObject<Item> FALIN_SWORD = REGISTRY.register("falin_sword", () -> new FalinSwordItem());
}
