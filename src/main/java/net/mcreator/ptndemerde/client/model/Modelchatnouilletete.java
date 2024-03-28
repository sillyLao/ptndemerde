package net.mcreator.ptndemerde.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelchatnouilletete<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ptndemerde", "modelchatnouilletete"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;
	public final ModelPart tail;
	public final ModelPart tail2;

	public Modelchatnouilletete(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_right_leg = root.getChild("front_right_leg");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
		this.tail = root.getChild("tail");
		this.tail2 = root.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(15, 17).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 12).addBox(-1.5F, -0.02F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, -9.0F));
		PartDefinition nouille = head.addOrReplaceChild("nouille", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0292F, -2.3325F, -0.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition n1RA = nouille.addOrReplaceChild("n1RA", CubeListBuilder.create().texOffs(29, 0).addBox(-1.5F, -0.4999F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.4F, 0.1F, 0.0F));
		PartDefinition n4RA = nouille.addOrReplaceChild("n4RA", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, -0.5F, 1.0F, -0.0857F, 0.276F, 0.4548F));
		PartDefinition n4RB = nouille.addOrReplaceChild("n4RB", CubeListBuilder.create().texOffs(57, 2).addBox(0.1F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2F, 0.5F, 1.0F, -0.2829F, -0.0583F, -1.0086F));
		PartDefinition n1LA = nouille.addOrReplaceChild("n1LA", CubeListBuilder.create().texOffs(28, 4).addBox(1.6F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition n4LA = nouille.addOrReplaceChild("n4LA", CubeListBuilder.create().texOffs(56, 4).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8652F, 0.7697F, 2.1145F, -0.3275F, -0.9674F, 0.7404F));
		PartDefinition n4LB = nouille.addOrReplaceChild("n4LB", CubeListBuilder.create().texOffs(56, 6).addBox(-1.7F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7652F, 2.8697F, 3.4145F, -0.6064F, -0.073F, 1.6429F));
		PartDefinition n1LB = nouille.addOrReplaceChild("n1LB", CubeListBuilder.create().texOffs(28, 6).addBox(-1.5F, -0.5F, -0.5001F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.513F, 2.6603F, 0.0F, 0.0F, 0.0F, 1.6581F));
		PartDefinition n2LA = nouille.addOrReplaceChild("n2LA", CubeListBuilder.create().texOffs(37, 4).addBox(-3.0293F, -0.5F, -0.535F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, 0.1F, -0.7F, 3.0886F, -0.1664F, -2.8317F));
		PartDefinition n2LB = nouille.addOrReplaceChild("n2LB", CubeListBuilder.create().texOffs(37, 6).addBox(-1.1F, -0.5F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5424F, 2.5599F, -0.9188F, 2.9685F, 0.0227F, -1.4419F));
		PartDefinition n3LA = nouille.addOrReplaceChild("n3LA", CubeListBuilder.create().texOffs(46, 4).addBox(-1.2F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5424F, 0.7599F, -1.8188F, 3.0852F, -0.3842F, -2.8194F));
		PartDefinition n3LB = nouille.addOrReplaceChild("n3LB", CubeListBuilder.create().texOffs(45, 6).addBox(-2.2F, 0.0F, -0.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5424F, 2.7599F, -2.2188F, 2.7546F, -0.0302F, -1.4718F));
		PartDefinition n2RA = nouille.addOrReplaceChild("n2RA", CubeListBuilder.create().texOffs(39, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.1F, -0.9F, 0.0F, -0.1745F, 0.0F));
		PartDefinition n2RB = nouille.addOrReplaceChild("n2RB", CubeListBuilder.create().texOffs(38, 2).addBox(-2.5F, -0.5F, -0.8F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.7F, -0.9F, 0.1666F, -0.0522F, -1.2697F));
		PartDefinition n3RA = nouille.addOrReplaceChild("n3RA", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -0.5001F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 0.1F, -1.7F, 0.0F, -0.4363F, 0.0F));
		PartDefinition n3RB = nouille.addOrReplaceChild("n3RB", CubeListBuilder.create().texOffs(48, 2).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 1.8F, -2.4F, 0.4185F, -0.1274F, -1.2925F));
		PartDefinition n1RB = nouille.addOrReplaceChild("n1RB", CubeListBuilder.create().texOffs(28, 2).addBox(-2.1F, -2.7F, -1.0001F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.5F, 0.0F, 0.0F, -1.2654F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -10.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition front_left_leg = partdefinition.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 14.1F, -5.0F));
		PartDefinition front_right_leg = partdefinition.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, 14.1F, -5.0F));
		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 18.0F, 5.0F));
		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, 18.0F, 5.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(12, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5F, 8.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tail2 = partdefinition.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(8, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5F, 16.0F, 1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.front_right_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.back_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.back_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.front_left_leg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
