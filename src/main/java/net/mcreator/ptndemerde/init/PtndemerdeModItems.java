
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
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ptndemerde.item.TabacFumeItem;
import net.mcreator.ptndemerde.item.SorbetEtrangeItem;
import net.mcreator.ptndemerde.item.PetardDaturaItem;
import net.mcreator.ptndemerde.item.PapierInesItem;
import net.mcreator.ptndemerde.item.NouillesSechesItem;
import net.mcreator.ptndemerde.item.NouillesItem;
import net.mcreator.ptndemerde.item.MondeTechnologiqueItem;
import net.mcreator.ptndemerde.item.LaserBallItem;
import net.mcreator.ptndemerde.item.GrainesDeTabacItem;
import net.mcreator.ptndemerde.item.FleurDeTabacItem;
import net.mcreator.ptndemerde.item.FalinSwordItem;
import net.mcreator.ptndemerde.item.ChairPutrefieeDoreeItem;
import net.mcreator.ptndemerde.item.BolNouillesSlimeItem;
import net.mcreator.ptndemerde.item.BolNouillesPiquanteItem;
import net.mcreator.ptndemerde.item.BolNouillesLegumesItem;
import net.mcreator.ptndemerde.item.BolNouillesJajangmyeonItem;
import net.mcreator.ptndemerde.item.BolNouillesItem;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PtndemerdeMod.MODID);
	public static final RegistryObject<Item> MONDE_TECHNOLOGIQUE = REGISTRY.register("monde_technologique", () -> new MondeTechnologiqueItem());
	public static final RegistryObject<Item> FALIN_SWORD = REGISTRY.register("falin_sword", () -> new FalinSwordItem());
	public static final RegistryObject<Item> CHICHA = block(PtndemerdeModBlocks.CHICHA);
	public static final RegistryObject<Item> TABAC_1 = block(PtndemerdeModBlocks.TABAC_1);
	public static final RegistryObject<Item> CHAT_TETE_NOUILLE_SPAWN_EGG = REGISTRY.register("chat_tete_nouille_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.CHAT_TETE_NOUILLE, -154, -52, new Item.Properties()));
	public static final RegistryObject<Item> TABAC_2 = block(PtndemerdeModBlocks.TABAC_2);
	public static final RegistryObject<Item> TABAC_3 = block(PtndemerdeModBlocks.TABAC_3);
	public static final RegistryObject<Item> TABAC_GROWN = block(PtndemerdeModBlocks.TABAC_GROWN);
	public static final RegistryObject<Item> FLEUR_DE_TABAC = REGISTRY.register("fleur_de_tabac", () -> new FleurDeTabacItem());
	public static final RegistryObject<Item> GRAINES_DE_TABAC = REGISTRY.register("graines_de_tabac", () -> new GrainesDeTabacItem());
	public static final RegistryObject<Item> TABAC_FUME = REGISTRY.register("tabac_fume", () -> new TabacFumeItem());
	public static final RegistryObject<Item> MU_SPAWN_EGG = REGISTRY.register("mu_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.MU, -16777216, -6750208, new Item.Properties()));
	public static final RegistryObject<Item> CHICHEUR_SPAWN_EGG = REGISTRY.register("chicheur_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.CHICHEUR, -10066330, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> CHAIR_PUTREFIEE_DOREE = REGISTRY.register("chair_putrefiee_doree", () -> new ChairPutrefieeDoreeItem());
	public static final RegistryObject<Item> PORC_SPAWN_EGG = REGISTRY.register("porc_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.PORC, -16776961, -1, new Item.Properties()));
	public static final RegistryObject<Item> DATURA_STRAMONIUM = block(PtndemerdeModBlocks.DATURA_STRAMONIUM);
	public static final RegistryObject<Item> CAMPFIRE_BUCKET = block(PtndemerdeModBlocks.CAMPFIRE_BUCKET);
	public static final RegistryObject<Item> NOUILLES_SECHES = REGISTRY.register("nouilles_seches", () -> new NouillesSechesItem());
	public static final RegistryObject<Item> NOUILLES = REGISTRY.register("nouilles", () -> new NouillesItem());
	public static final RegistryObject<Item> BOL_NOUILLES = REGISTRY.register("bol_nouilles", () -> new BolNouillesItem());
	public static final RegistryObject<Item> LAMBDA_BAT_SPAWN_EGG = REGISTRY.register("lambda_bat_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.LAMBDA_BAT, -13421773, -10092544, new Item.Properties()));
	public static final RegistryObject<Item> BOL_NOUILLES_LEGUMES = REGISTRY.register("bol_nouilles_legumes", () -> new BolNouillesLegumesItem());
	public static final RegistryObject<Item> BOL_NOUILLES_PIQUANTE = REGISTRY.register("bol_nouilles_piquante", () -> new BolNouillesPiquanteItem());
	public static final RegistryObject<Item> BOL_NOUILLES_JAJANGMYEON = REGISTRY.register("bol_nouilles_jajangmyeon", () -> new BolNouillesJajangmyeonItem());
	public static final RegistryObject<Item> LASER_BALL = REGISTRY.register("laser_ball", () -> new LaserBallItem());
	public static final RegistryObject<Item> PETARD_DATURA = REGISTRY.register("petard_datura", () -> new PetardDaturaItem());
	public static final RegistryObject<Item> MOLOSSE_SPAWN_EGG = REGISTRY.register("molosse_spawn_egg", () -> new ForgeSpawnEggItem(PtndemerdeModEntities.MOLOSSE, -16777216, -52480, new Item.Properties()));
	public static final RegistryObject<Item> PAPIER_INES = REGISTRY.register("papier_ines", () -> new PapierInesItem());
	public static final RegistryObject<Item> BOL_NOUILLES_SLIME = REGISTRY.register("bol_nouilles_slime", () -> new BolNouillesSlimeItem());
	public static final RegistryObject<Item> SALVIA_DIVINORUM = doubleBlock(PtndemerdeModBlocks.SALVIA_DIVINORUM);
	public static final RegistryObject<Item> SORBET_ETRANGE = REGISTRY.register("sorbet_etrange", () -> new SorbetEtrangeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
