
package net.mcreator.ptndemerde.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.ptndemerde.entity.model.OmegaTitanModel;
import net.mcreator.ptndemerde.entity.layer.OmegaTitanLayer;
import net.mcreator.ptndemerde.entity.OmegaTitanEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OmegaTitanRenderer extends GeoEntityRenderer<OmegaTitanEntity> {
	public OmegaTitanRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new OmegaTitanModel());
		this.shadowRadius = 1f;
		this.addRenderLayer(new OmegaTitanLayer(this));
	}

	@Override
	public RenderType getRenderType(OmegaTitanEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, OmegaTitanEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
