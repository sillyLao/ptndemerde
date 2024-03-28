package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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

private static void execute(
@Nullable Event event,
LevelAccessor world
) {
for (Entity entityiterator : new ArrayList<>(world.players())) {
if (>10) {if (Math.random()<0.0001*) {entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.WITHER)), 2);}}
}
}
}
