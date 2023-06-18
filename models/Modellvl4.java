// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modellvl4 extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Modellvl4() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 104, 112, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 44, -3.5F, 3.0F, 2.3F, 7, 9, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 46, -3.5F, 3.0F, -2.9F, 7, 1, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 41, -3.5F, 7.0F, -2.7F, 7, 5, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 47, -3.0F, 4.0F, -2.7F, 1, 3, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 47, 2.0F, 4.0F, -2.7F, 1, 3, 0, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 8, -3.5F, 0.2F, -2.6F, 7, 3, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 45, 3.4F, 3.0F, -2.6F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 42, 45, 3.4F, 10.9F, -2.6F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 46, -4.4F, 10.9F, -2.6F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 47, -4.4F, 3.0F, -2.6F, 1, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 43, -3.0F, -0.4F, -2.7F, 1, 4, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 43, 2.0F, -0.4F, -2.7F, 1, 4, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 41, 8, -3.5F, 3.0F, -2.6F, 7, 9, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 79, 112, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 76, 112, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 76, 112, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
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