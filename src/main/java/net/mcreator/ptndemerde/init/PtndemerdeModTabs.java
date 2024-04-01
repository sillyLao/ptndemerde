
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ptndemerde.PtndemerdeMod;

public class PtndemerdeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PtndemerdeMod.MODID);
	public static final RegistryObject<CreativeModeTab> PTNDEMERDE_TAB = REGISTRY.register("ptndemerde_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ptndemerde.ptndemerde_tab")).icon(() -> new ItemStack(PtndemerdeModItems.FLEUR_DE_TABAC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PtndemerdeModItems.MONDE_TECHNOLOGIQUE.get());
				tabData.accept(PtndemerdeModItems.FALIN_SWORD.get());
				tabData.accept(PtndemerdeModBlocks.CHICHA.get().asItem());
				tabData.accept(PtndemerdeModItems.CHAT_TETE_NOUILLE_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModItems.FLEUR_DE_TABAC.get());
				tabData.accept(PtndemerdeModItems.GRAINES_DE_TABAC.get());
				tabData.accept(PtndemerdeModItems.TABAC_FUME.get());
				tabData.accept(PtndemerdeModItems.MU_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModItems.CHICHEUR_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModItems.CHAIR_PUTREFIEE_DOREE.get());
				tabData.accept(PtndemerdeModItems.PORC_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModBlocks.DATURA_STRAMONIUM.get().asItem());
				tabData.accept(PtndemerdeModBlocks.CAMPFIRE_BUCKET.get().asItem());
				tabData.accept(PtndemerdeModItems.NOUILLES_SECHES.get());
				tabData.accept(PtndemerdeModItems.NOUILLES.get());
				tabData.accept(PtndemerdeModItems.BOL_NOUILLES.get());
				tabData.accept(PtndemerdeModItems.LAMBDA_BAT_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModItems.BOL_NOUILLES_LEGUMES.get());
				tabData.accept(PtndemerdeModItems.BOL_NOUILLES_PIQUANTE.get());
				tabData.accept(PtndemerdeModItems.BOL_NOUILLES_JAJANGMYEON.get());
				tabData.accept(PtndemerdeModItems.PETARD_DATURA.get());
				tabData.accept(PtndemerdeModItems.MOLOSSE_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModItems.PAPIER_INES.get());
				tabData.accept(PtndemerdeModItems.BOL_NOUILLES_SLIME.get());
				tabData.accept(PtndemerdeModBlocks.SALVIA_DIVINORUM.get().asItem());
				tabData.accept(PtndemerdeModItems.OMEGA_TITAN_SPAWN_EGG.get());
				tabData.accept(PtndemerdeModItems.SORBET_ETRANGE.get());
				tabData.accept(PtndemerdeModItems.PURIFIED_POTATO.get());
				tabData.accept(PtndemerdeModItems.GOLDEN_PURIFIED_POTATO.get());
			}).withSearchBar().build());
}
