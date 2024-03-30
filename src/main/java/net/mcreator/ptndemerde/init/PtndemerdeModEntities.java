
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ptndemerde.entity.PorcEntity;
import net.mcreator.ptndemerde.entity.MuEntity;
import net.mcreator.ptndemerde.entity.LambdaBatEntity;
import net.mcreator.ptndemerde.entity.ChicheurEntity;
import net.mcreator.ptndemerde.entity.ChatTeteNouilleEntity;
import net.mcreator.ptndemerde.PtndemerdeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PtndemerdeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PtndemerdeMod.MODID);
	public static final RegistryObject<EntityType<ChatTeteNouilleEntity>> CHAT_TETE_NOUILLE = register("chat_tete_nouille",
			EntityType.Builder.<ChatTeteNouilleEntity>of(ChatTeteNouilleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChatTeteNouilleEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<MuEntity>> MU = register("mu",
			EntityType.Builder.<MuEntity>of(MuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuEntity::new).fireImmune().sized(20f, 50f));
	public static final RegistryObject<EntityType<ChicheurEntity>> CHICHEUR = register("chicheur",
			EntityType.Builder.<ChicheurEntity>of(ChicheurEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChicheurEntity::new)

					.sized(0.5f, 1.7f));
	public static final RegistryObject<EntityType<PorcEntity>> PORC = register("porc",
			EntityType.Builder.<PorcEntity>of(PorcEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PorcEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LambdaBatEntity>> LAMBDA_BAT = register("lambda_bat", EntityType.Builder.<LambdaBatEntity>of(LambdaBatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(LambdaBatEntity::new).fireImmune().sized(0.8f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ChatTeteNouilleEntity.init();
			MuEntity.init();
			ChicheurEntity.init();
			PorcEntity.init();
			LambdaBatEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHAT_TETE_NOUILLE.get(), ChatTeteNouilleEntity.createAttributes().build());
		event.put(MU.get(), MuEntity.createAttributes().build());
		event.put(CHICHEUR.get(), ChicheurEntity.createAttributes().build());
		event.put(PORC.get(), PorcEntity.createAttributes().build());
		event.put(LAMBDA_BAT.get(), LambdaBatEntity.createAttributes().build());
	}
}
