package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.ptndemerde.network.PtndemerdeModVariables;
import net.mcreator.ptndemerde.init.PtndemerdeModMobEffects;

import javax.annotation.Nullable;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DegatDeLaDrogueProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world.isClientSide() ? Minecraft.getInstance().getConnection().getOnlinePlayers().size() : ServerLifecycleHooks.getCurrentServer().getPlayerCount()) > 0) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (!(entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(PtndemerdeModMobEffects.EFFECT_RELAXED.get()))) {
					if ((entityiterator.getCapability(PtndemerdeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PtndemerdeModVariables.PlayerVariables())).drogue > 10) {
						if (Math.random() < 0.0001 * (entityiterator.getCapability(PtndemerdeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PtndemerdeModVariables.PlayerVariables())).drogue) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.WITHER)), 2);
						}
					}
				}
			}
		}
	}
}
