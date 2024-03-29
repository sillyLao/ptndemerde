
package net.mcreator.ptndemerde.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ptndemerde.entity.ChicheurEntity;
import net.mcreator.ptndemerde.client.model.Modelchicheur;

import com.mojang.blaze3d.vertex.PoseStack;

public class ChicheurRenderer extends MobRenderer<ChicheurEntity, Modelchicheur<ChicheurEntity>> {
	public ChicheurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicheur(context.bakeLayer(Modelchicheur.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ChicheurEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9f, 0.9f, 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChicheurEntity entity) {
		return new ResourceLocation("ptndemerde:textures/entities/chicheur.png");
	}
}
