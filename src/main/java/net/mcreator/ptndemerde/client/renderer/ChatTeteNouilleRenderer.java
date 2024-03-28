
package net.mcreator.ptndemerde.client.renderer;

public class ChatTeteNouilleRenderer extends MobRenderer<ChatTeteNouilleEntity, Modelchatnouilletete<ChatTeteNouilleEntity>> {

	public ChatTeteNouilleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchatnouilletete(context.bakeLayer(Modelchatnouilletete.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(ChatTeteNouilleEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChatTeteNouilleEntity entity) {
		return new ResourceLocation("ptndemerde:textures/entities/chattetenouille.png");
	}

}
