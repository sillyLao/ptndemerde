package net.mcreator.ptndemerde.entity.layer;

public class OmegaTitanLayer extends GeoRenderLayer<OmegaTitanEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("ptndemerde", "textures/entities/titan_glow.png");

	public OmegaTitanLayer(GeoRenderer<OmegaTitanEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, OmegaTitanEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}