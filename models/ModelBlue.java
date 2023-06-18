// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelBlue extends ModelBase {
	private final ModelRenderer hexadecagon;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer bb_main;

	public ModelBlue() {
		textureWidth = 64;
		textureHeight = 64;

		hexadecagon = new ModelRenderer(this);
		hexadecagon.setRotationPoint(8.0F, 26.0F, -8.0F);
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 0, 35, -8.5967F, -16.0F, 5.0F, 1, 12, 2, 0.0F, false));
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 0, 35, -8.5967F, -16.0F, 9.0F, 1, 12, 2, 0.0F, false));
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 0, 35, -7.0F, -16.0F, 7.4033F, 2, 12, 1, 0.0F, false));
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 0, 35, -11.0F, -16.0F, 7.4033F, 2, 12, 1, 0.0F, false));

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		hexadecagon.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 35, -3.0F, -8.0F, -0.5967F, 2, 12, 1, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 35, 1.0F, -8.0F, -0.5967F, 2, 12, 1, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 35, -0.5967F, -8.0F, 1.0F, 1, 12, 2, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 35, -0.5967F, -8.0F, -3.0F, 1, 12, 2, 0.0F, false));

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		hexadecagon.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 35, -3.0F, -8.0F, -0.5967F, 2, 12, 1, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 35, 1.0F, -8.0F, -0.5967F, 2, 12, 1, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 35, -0.5967F, -8.0F, 1.0F, 1, 12, 2, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 35, -0.5967F, -8.0F, -3.0F, 1, 12, 2, 0.0F, false));

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		hexadecagon.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 35, -0.5967F, -8.0F, 1.0F, 1, 12, 2, 0.0F, false));
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 35, -0.5967F, -8.0F, -3.0F, 1, 12, 2, 0.0F, false));

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		hexadecagon.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 35, -0.5967F, -8.0F, 1.0F, 1, 12, 2, 0.0F, false));
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 35, -0.5967F, -8.0F, -3.0F, 1, 12, 2, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -2.0F, -8.0F, 16, 2, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -16.0F, -8.0F, 16, 2, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 26, 0, -8.0F, -14.0F, 6.0F, 2, 12, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 26, 0, 6.0F, -14.0F, 6.0F, 2, 12, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 26, 0, -8.0F, -14.0F, -8.0F, 2, 12, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 26, 0, 6.0F, -14.0F, -8.0F, 2, 12, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hexadecagon.render(f5);
		bb_main.render(f5);
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