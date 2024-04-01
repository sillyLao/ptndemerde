package net.mcreator.ptndemerde.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class OmegaTitanModel extends GeoModel<OmegaTitanEntity> {
	@Override
	public ResourceLocation getAnimationResource(OmegaTitanEntity entity) {
		return new ResourceLocation("ptndemerde", "animations/omega_titan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OmegaTitanEntity entity) {
		return new ResourceLocation("ptndemerde", "geo/omega_titan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OmegaTitanEntity entity) {
		return new ResourceLocation("ptndemerde", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(OmegaTitanEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}