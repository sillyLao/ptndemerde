
package net.mcreator.ptndemerde.client.renderer;

public class ChicheurRenderer extends MobRenderer<ChicheurEntity, Modelchicheur<ChicheurEntity>> {

	public ChicheurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicheur(context.bakeLayer(Modelchicheur.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ChicheurEntity entity) {
		return new ResourceLocation("ptndemerde:textures/entities/chicheur.png");
	}

}
