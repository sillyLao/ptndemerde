
package net.mcreator.ptndemerde.client.renderer;

public class MolosseRenderer extends GeoEntityRenderer<MolosseEntity> {
	public MolosseRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MolosseModel());
		this.shadowRadius = 0.8f;
		this.addRenderLayer(new MolosseLayer(this));
	}

	@Override
	public RenderType getRenderType(MolosseEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, MolosseEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}