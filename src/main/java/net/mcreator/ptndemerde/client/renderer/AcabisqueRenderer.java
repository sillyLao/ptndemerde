
package net.mcreator.ptndemerde.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ptndemerde.entity.AcabisqueEntity;
import net.mcreator.ptndemerde.client.model.Modelacab;

public class AcabisqueRenderer extends MobRenderer<AcabisqueEntity, Modelacab<AcabisqueEntity>> {
	public AcabisqueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelacab(context.bakeLayer(Modelacab.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AcabisqueEntity entity) {
		return new ResourceLocation("ptndemerde:textures/entities/acab.png");
	}
}
