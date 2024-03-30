package net.mcreator.ptndemerde.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MolosseModel extends GeoModel<MolosseEntity> {
	@Override
	public ResourceLocation getAnimationResource(MolosseEntity entity) {
		return new ResourceLocation("ptndemerde", "animations/sigma_molosse.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MolosseEntity entity) {
		return new ResourceLocation("ptndemerde", "geo/sigma_molosse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MolosseEntity entity) {
		return new ResourceLocation("ptndemerde", "textures/entities/" + entity.getTexture() + ".png");
	}

}