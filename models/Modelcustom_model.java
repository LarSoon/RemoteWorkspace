// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer torso;
	private final ModelRenderer cube_r1;
	private final ModelRenderer right_claw;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone2;
	private final ModelRenderer right_claw2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 10.8F, 0.0F);
		setRotationAngle(torso, 0.0F, -1.5708F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 18, 41, -6.0F, -9.8F, -7.0F, 10, 10, 13, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 5, 33, -7.0F, -8.8F, -6.0F, 1, 8, 11, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 46, 0, 4.0F, -9.8F, -7.0F, 10, 10, 0, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 46, 10, 4.0F, -9.8F, 6.0F, 9, 10, 0, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 13, 18, 4.0F, -9.8F, -7.0F, 9, 0, 13, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		torso.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 31, -2.0F, -0.8F, -2.0F, 5, 4, 3, 0.0F, false));

		right_claw = new ModelRenderer(this);
		right_claw.setRotationPoint(-2.484F, 12.8577F, 0.036F);
		setRotationAngle(right_claw, 1.1345F, -1.1345F, -1.1345F);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.516F, 11.1423F, -3.036F);
		right_claw.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 23, -8.0F, -12.0F, 1.0F, 9, 2, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-7.0F, -11.0F, 3.0F);
		bone4.addChild(bone6);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.22F, 0.044F, 0.036F);
		bone6.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8727F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -6.78F, -4.044F, -2.036F, 9, 2, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-5.22F, -6.956F, -0.964F);
		bone6.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 53, 46, -2.78F, -1.044F, -1.036F, 3, 2, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.9933F, -0.229F, 0.0F);
		bone5.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -2.7867F, -0.315F, -0.536F, 3, 1, 1, 0.0F, false));

		right_claw2 = new ModelRenderer(this);
		right_claw2.setRotationPoint(1.516F, 12.8577F, 0.036F);
		setRotationAngle(right_claw2, 2.0071F, -1.1345F, -2.0071F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.516F, 11.1423F, -3.036F);
		right_claw2.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 23, -8.0F, -12.0F, 1.0F, 9, 2, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-7.0F, -11.0F, 3.0F);
		bone3.addChild(bone7);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.22F, 0.044F, 0.036F);
		bone7.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8727F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, -6.78F, -4.044F, -2.036F, 9, 2, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-5.22F, -6.956F, -0.964F);
		bone7.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 53, 46, -2.78F, -1.044F, -1.036F, 3, 2, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.9933F, -0.229F, 0.0F);
		bone8.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -2.7867F, -0.315F, -0.536F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		torso.render(f5);
		right_claw.render(f5);
		right_claw2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}