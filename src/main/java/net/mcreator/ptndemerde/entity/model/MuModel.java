package net.mcreator.ptndemerde.entity.model;

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

}
