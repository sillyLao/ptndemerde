
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ptndemerde.world.inventory.GUIChicheurMenu;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PtndemerdeMod.MODID);
	public static final RegistryObject<MenuType<GUIChicheurMenu>> GUI_CHICHEUR = REGISTRY.register("gui_chicheur", () -> IForgeMenuType.create(GUIChicheurMenu::new));
}
