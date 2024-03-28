
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ptndemerde.block.TabacGrownBlock;
import net.mcreator.ptndemerde.block.Tabac3Block;
import net.mcreator.ptndemerde.block.Tabac2Block;
import net.mcreator.ptndemerde.block.Tabac1Block;
import net.mcreator.ptndemerde.block.ChichaBlock;
import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PtndemerdeMod.MODID);
	public static final RegistryObject<Block> CHICHA = REGISTRY.register("chicha", () -> new ChichaBlock());
	public static final RegistryObject<Block> TABAC_1 = REGISTRY.register("tabac_1", () -> new Tabac1Block());
	public static final RegistryObject<Block> TABAC_2 = REGISTRY.register("tabac_2", () -> new Tabac2Block());
	public static final RegistryObject<Block> TABAC_3 = REGISTRY.register("tabac_3", () -> new Tabac3Block());
	public static final RegistryObject<Block> TABAC_GROWN = REGISTRY.register("tabac_grown", () -> new TabacGrownBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			Tabac1Block.blockColorLoad(event);
			Tabac2Block.blockColorLoad(event);
			Tabac3Block.blockColorLoad(event);
			TabacGrownBlock.blockColorLoad(event);
		}
	}
}
