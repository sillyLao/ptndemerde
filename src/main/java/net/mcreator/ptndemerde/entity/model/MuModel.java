package net.mcreator.ptndemerde.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ptndemerde.entity.MuEntity;

public class MuModel extends GeoModel<MuEntity> {
	@Override
	public ResourceLocation getAnimationResource(MuEntity entity) {
		return new ResourceLocation("ptndemerde", "animations/mu_creature.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MuEntity entity) {
		return new ResourceLocation("ptndemerde", "geo/mu_creature.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MuEntity entity) {
		return new ResourceLocation("ptndemerde", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MuEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("tete");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
