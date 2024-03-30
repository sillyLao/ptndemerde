package net.mcreator.ptndemerde.entity.layer;

public class MolosseLayer extends GeoRenderLayer<MolosseEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("ptndemerde", "textures/entities/hound_eyes.png");

	public MolosseLayer(GeoRenderer<MolosseEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, MolosseEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}