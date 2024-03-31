package net.mcreator.ptndemerde.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.ptndemerde.entity.LambdaBatEntity;

public class LambdaBatModel extends GeoModel<LambdaBatEntity> {
	@Override
	public ResourceLocation getAnimationResource(LambdaBatEntity entity) {
		return new ResourceLocation("ptndemerde", "animations/lambda_bat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LambdaBatEntity entity) {
		return new ResourceLocation("ptndemerde", "geo/lambda_bat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LambdaBatEntity entity) {
		return new ResourceLocation("ptndemerde", "textures/entities/" + entity.getTexture() + ".png");
	}

}
