// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmugod<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mugod"), "main");
	private final ModelPart torso;
	private final ModelPart jambes;
	private final ModelPart tete;

	public Modelmugod(ModelPart root) {
		this.torso = root.getChild("torso");
		this.jambes = root.getChild("jambes");
		this.tete = root.getChild("tete");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(376, 188)
				.addBox(-100.8F, -12.6F, -88.2F, 189.0F, 12.6F, 176.4F, new CubeDeformation(0.0F)).texOffs(790, 779)
				.addBox(-100.8F, -403.2F, 88.2F, 201.6F, 403.2F, 12.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(88.2F, -403.2F, -88.2F, 12.6F, 403.2F, 176.4F, new CubeDeformation(0.0F)).texOffs(376, 376)
				.addBox(-100.8F, -403.2F, -100.8F, 201.6F, 403.2F, 12.6F, new CubeDeformation(0.0F)).texOffs(376, 0)
				.addBox(-100.8F, -403.2F, -88.2F, 189.0F, 12.6F, 176.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6F, -303.6F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition intrieur = torso.addOrReplaceChild("intrieur", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 201.6F));

		PartDefinition cube_r1 = intrieur.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(326, 579).addBox(-100.8F, -100.8F, -226.8F, 12.6F, 126.0F, 12.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1419F, -0.3435F, 0.0631F));

		PartDefinition cube_r2 = intrieur.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(802, 627).addBox(-100.8F, -151.2F, -163.8F, 12.6F, 126.0F, 12.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1199F, -0.3435F, 0.0631F));

		PartDefinition cube_r3 = intrieur.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(376, 263).addBox(-138.6F, -315.0F, -163.8F, 12.6F, 50.4F, 12.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0763F, -0.3435F, 0.0631F));

		PartDefinition cube_r4 = intrieur.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(898, 627).addBox(-138.6F, -352.8F, -239.4F, 12.6F, 100.8F, 12.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1855F, -0.3435F, 0.0631F));

		PartDefinition cube_r5 = intrieur.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(850, 627).addBox(-12.6F, -415.8F, -151.2F, 12.6F, 126.0F, 12.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1246F, 0.0367F, 0.0188F));

		PartDefinition cube_r6 = intrieur.addOrReplaceChild(
				"cube_r6", CubeListBuilder.create().texOffs(200, 0).addBox(-163.8F, -151.2F, -239.4F, 12.6F, 12.6F,
						50.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r7 = intrieur.addOrReplaceChild(
				"cube_r7", CubeListBuilder.create().texOffs(802, 376).addBox(-163.8F, -201.6F, -252.0F, 12.6F, 12.6F,
						63.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r8 = intrieur.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(350, 0)
				.addBox(-37.8F, -163.8F, -214.2F, 12.6F, 12.6F, 75.6F, new CubeDeformation(0.0F)).texOffs(802, 451)
				.addBox(-37.8F, -214.2F, -201.6F, 12.6F, 12.6F, 63.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r9 = intrieur.addOrReplaceChild(
				"cube_r9", CubeListBuilder.create().texOffs(376, 263).addBox(-113.4F, -289.8F, -289.8F, 12.6F, 12.6F,
						63.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r10 = intrieur.addOrReplaceChild(
				"cube_r10", CubeListBuilder.create().texOffs(100, 579).addBox(-50.4F, -277.2F, -189.0F, 12.6F, 12.6F,
						63.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition facadeavant = torso.addOrReplaceChild("facadeavant", CubeListBuilder.create().texOffs(802, 376)
				.addBox(-100.8F, -113.4F, -289.8F, 12.6F, 100.8F, 151.2F, new CubeDeformation(0.0F)).texOffs(374, 1005)
				.addBox(-100.8F, -390.6F, -289.8F, 12.6F, 277.2F, 25.2F, new CubeDeformation(0.0F)).texOffs(0, 1005)
				.addBox(-100.8F, -390.6F, -138.6F, 12.6F, 378.0F, 25.2F, new CubeDeformation(0.0F)).texOffs(200, 0)
				.addBox(-100.8F, -390.6F, -264.6F, 12.6F, 50.4F, 126.0F, new CubeDeformation(0.0F)).texOffs(449, 0)
				.addBox(-100.8F, -126.0F, -264.6F, 12.6F, 12.6F, 37.8F, new CubeDeformation(0.0F)).texOffs(187, 579)
				.addBox(-100.8F, -126.0F, -189.0F, 12.6F, 12.6F, 37.8F, new CubeDeformation(0.0F)).texOffs(200, 0)
				.addBox(-100.8F, -151.2F, -151.2F, 12.6F, 37.8F, 12.6F, new CubeDeformation(0.0F)).texOffs(274, 0)
				.addBox(-100.8F, -138.6F, -264.6F, 12.6F, 12.6F, 12.6F, new CubeDeformation(0.0F)).texOffs(476, 87)
				.addBox(-100.8F, -340.2F, -151.2F, 12.6F, 50.4F, 12.6F, new CubeDeformation(0.0F)).texOffs(463, 263)
				.addBox(-100.8F, -340.2F, -264.6F, 12.6F, 50.4F, 12.6F, new CubeDeformation(0.0F)).texOffs(100, 0)
				.addBox(-100.8F, -340.2F, -163.8F, 12.6F, 37.8F, 12.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-100.8F, -340.2F, -176.4F, 12.6F, 37.8F, 12.6F, new CubeDeformation(0.0F)).texOffs(200, 62)
				.addBox(-100.8F, -340.2F, -214.2F, 12.6F, 25.2F, 37.8F, new CubeDeformation(0.0F)).texOffs(261, 62)
				.addBox(-100.8F, -340.2F, -226.8F, 12.6F, 12.6F, 12.6F, new CubeDeformation(0.0F)).texOffs(350, 0)
				.addBox(-100.8F, -340.2F, -252.0F, 12.6F, 37.8F, 25.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 201.6F));

		PartDefinition jambes = partdefinition.addOrReplaceChild("jambes", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = jambes.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(75.6F, -365.4F, 100.8F));

		PartDefinition bone7 = bone5.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(-25.2F, 151.2F, 12.6F));

		PartDefinition cube_r11 = bone7.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(727, 1194).addBox(65.52F, -176.4F, 131.04F, 25.2F, 226.8F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-50.4F, 214.2F, -113.4F, 0.1309F, 0.0873F, -0.2182F));

		PartDefinition bone8 = bone5.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone8.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 579).addBox(-25.2F, -365.4F, 126.0F, 25.2F, 176.4F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-75.6F, 365.4F, -100.8F, 0.1309F, 0.0873F, 0.2182F));

		PartDefinition bone3 = jambes.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(50.4F, -403.2F, -113.4F));

		PartDefinition bone9 = bone3.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(-63.0F, 189.0F, -12.6F));

		PartDefinition cube_r13 = bone9.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(1191, 1169).addBox(61.74F, -189.0F, -158.76F, 25.2F, 226.8F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6F, 214.2F, 126.0F, -0.0975F, 0.0695F, -0.3483F));

		PartDefinition bone10 = bone3.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 12.6F));

		PartDefinition cube_r14 = bone10.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(627, 1168).addBox(-68.04F, -394.38F, -178.92F, 25.2F, 226.8F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-50.4F, 403.2F, 100.8F, -0.1572F, 0.1144F, 0.3076F));

		PartDefinition bone = jambes.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-126.0F, -680.4F, 100.8F));

		PartDefinition bone17 = bone.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offset(-176.4F, 239.4F, 138.6F));

		PartDefinition cube_r15 = bone17.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(452, 791).addBox(-214.2F, -510.3F, 207.9F, 25.2F, 466.2F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(302.4F, 441.0F, -239.4F, 0.0F, 0.0873F, -0.2618F));

		PartDefinition bone18 = bone.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone18.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(652, 791).addBox(-239.4F, -378.0F, 529.2F, 25.2F, 352.8F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(126.0F, 680.4F, -100.8F, 0.5377F, -0.6085F, 0.3526F));

		PartDefinition bone6 = jambes.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-50.4F, -491.4F, 100.8F));

		PartDefinition bone11 = bone6.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(-113.4F, 252.0F, 37.8F));

		PartDefinition cube_r17 = bone11.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(1106, 0).addBox(-120.96F, -264.6F, 156.24F, 25.2F, 264.6F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(163.8F, 239.4F, -138.6F, 0.0903F, -0.0442F, -0.193F));

		PartDefinition bone12 = bone6.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone12.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(274, 1005).addBox(-239.4F, -403.2F, 194.04F, 25.2F, 289.8F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.4F, 491.4F, -100.8F, 0.1788F, -0.1648F, 0.4217F));

		PartDefinition bone4 = jambes.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(-12.6F, -504.0F, -100.8F));

		PartDefinition bone13 = bone4.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offset(-75.6F, 315.0F, -25.2F));

		PartDefinition cube_r19 = bone13.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(827, 1194).addBox(-79.38F, -204.12F, -144.9F, 25.2F, 201.6F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(88.2F, 189.0F, 126.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone14 = bone4.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone14.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(174, 1005).addBox(-138.6F, -478.8F, -166.32F, 25.2F, 327.6F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6F, 504.0F, 100.8F, -0.1309F, 0.0F, 0.2182F));

		PartDefinition bone2 = jambes.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-100.8F, -667.8F, -100.8F));

		PartDefinition bone15 = bone2.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(-25.2F, 340.2F, -50.4F));

		PartDefinition cube_r21 = bone15.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(74, 1005).addBox(-80.64F, -315.0F, -224.28F, 25.2F, 340.2F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(126.0F, 327.6F, 151.2F, -0.1745F, 0.0F, -0.1745F));

		PartDefinition bone16 = bone2.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone16.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(552, 791).addBox(-163.8F, -642.6F, -217.98F, 25.2F, 365.4F, 25.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(100.8F, 667.8F, 100.8F, -0.1653F, 0.0114F, 0.0865F));

		PartDefinition tete = partdefinition.addOrReplaceChild("tete", CubeListBuilder.create().texOffs(0, 665)
				.addBox(-100.8F, -201.6F, -491.4F, 100.8F, 214.2F, 126.0F, new CubeDeformation(0.0F)).texOffs(1128, 527)
				.addBox(-126.0F, -201.6F, -403.2F, 25.2F, 201.6F, 37.8F, new CubeDeformation(0.0F)).texOffs(1106, 289)
				.addBox(-126.0F, -201.6F, -491.4F, 25.2F, 201.6F, 37.8F, new CubeDeformation(0.0F)).texOffs(376, 188)
				.addBox(-126.0F, -25.2F, -453.6F, 25.2F, 25.2F, 50.4F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-126.0F, -201.6F, -453.6F, 25.2F, 126.0F, 50.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-75.6F, -706.8F, 428.4F, 0.0F, 0.0F, -0.3491F));

		return LayerDefinition.create(meshdefinition, 2048, 2048);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jambes.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tete.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}