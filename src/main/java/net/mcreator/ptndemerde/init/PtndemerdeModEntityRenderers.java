
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ptndemerde.client.renderer.PorcRenderer;
import net.mcreator.ptndemerde.client.renderer.OmegaTitanRenderer;
import net.mcreator.ptndemerde.client.renderer.MuRenderer;
import net.mcreator.ptndemerde.client.renderer.MolosseRenderer;
import net.mcreator.ptndemerde.client.renderer.LaserRenderer;
import net.mcreator.ptndemerde.client.renderer.LambdaBatRenderer;
import net.mcreator.ptndemerde.client.renderer.ChicheurRenderer;
import net.mcreator.ptndemerde.client.renderer.ChatTeteNouilleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PtndemerdeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PtndemerdeModEntities.CHAT_TETE_NOUILLE.get(), ChatTeteNouilleRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.MU.get(), MuRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.CHICHEUR.get(), ChicheurRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.PORC.get(), PorcRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.LAMBDA_BAT.get(), LambdaBatRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.LASER.get(), LaserRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.MOLOSSE.get(), MolosseRenderer::new);
		event.registerEntityRenderer(PtndemerdeModEntities.OMEGA_TITAN.get(), OmegaTitanRenderer::new);
	}
}
