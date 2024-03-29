
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ptndemerde.item.TabacFumeItem;
import net.mcreator.ptndemerde.item.MondeTechnologiqueItem;
import net.mcreator.ptndemerde.item.GrainesDeTabacItem;
import net.mcreator.ptndemerde.item.FleurDeTabacItem;
import net.mcreator.ptndemerde.item.FalinSwordItem;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PtndemerdeMod.MODID);
	public static final RegistryObject<Item> MONDE_TECHNOLOGIQUE = REGISTRY.register("monde_technologique", () -> new MondeTechnologiqueItem());
	public static final RegistryObject<Item> FALIN_SWORD = REGISTRY.register("falin_sword", () -> new FalinSwordItem());
	public static final RegistryObject<Item> CHICHA = block(PtndemerdeModBlocks.CHICHA);
	public static final RegistryObject<Item> CHICHA_ROUGE = block(PtndemerdeModBlocks.CHICHA_ROUGE);
	public static final RegistryObject<Item> TABAC_1 = block(PtndemerdeModBlocks.TABAC_1);
	public static final RegistryObject<Item> CHAT_TETE_NOUILLE_SPAWN_EGG = REGISTRY.register("chat_tete_nouille_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.CHAT_TETE_NOUILLE, -154, -52, new Item.Properties()));
	public static final RegistryObject<Item> TABAC_2 = block(PtndemerdeModBlocks.TABAC_2);
	public static final RegistryObject<Item> TABAC_3 = block(PtndemerdeModBlocks.TABAC_3);
	public static final RegistryObject<Item> TABAC_GROWN = block(PtndemerdeModBlocks.TABAC_GROWN);
	public static final RegistryObject<Item> FLEUR_DE_TABAC = REGISTRY.register("fleur_de_tabac", () -> new FleurDeTabacItem());
	public static final RegistryObject<Item> GRAINES_DE_TABAC = REGISTRY.register("graines_de_tabac", () -> new GrainesDeTabacItem());
	public static final RegistryObject<Item> TABAC_FUME = REGISTRY.register("tabac_fume", () -> new TabacFumeItem());
	public static final RegistryObject<Item> MU_SPAWN_EGG = REGISTRY.register("mu_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.MU, -16777216, -6750208, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
