
package net.mcreator.ptndemerde.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ptndemerde.entity.PorcEntity;
import net.mcreator.ptndemerde.client.model.Modelporc;

public class PorcRenderer extends MobRenderer<PorcEntity, Modelporc<PorcEntity>> {
	public PorcRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelporc(context.bakeLayer(Modelporc.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PorcEntity entity) {
		return new ResourceLocation("ptndemerde:textures/entities/porc.png");
	}
}
