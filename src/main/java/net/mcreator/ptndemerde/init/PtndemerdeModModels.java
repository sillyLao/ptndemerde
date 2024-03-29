
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ptndemerde.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ptndemerde.client.model.Modelmugod;
import net.mcreator.ptndemerde.client.model.Modelchatnouilletete;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PtndemerdeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmugod.LAYER_LOCATION, Modelmugod::createBodyLayer);
		event.registerLayerDefinition(Modelchatnouilletete.LAYER_LOCATION, Modelchatnouilletete::createBodyLayer);
	}
}
