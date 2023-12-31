
package net.mcreator.blocks.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.blocks.world.inventory.CraftingguiMenu;
import net.mcreator.blocks.network.CraftingguiButtonMessage;
import net.mcreator.blocks.QzMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CraftingguiScreen extends AbstractContainerScreen<CraftingguiMenu> {
	private final static HashMap<String, Object> guistate = CraftingguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_armor;
	Button button_tools;

	public CraftingguiScreen(CraftingguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("qz:textures/screens/craftinggui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_armor = new Button(this.leftPos + 59, this.topPos + 31, 50, 20, new TranslatableComponent("gui.qz.craftinggui.button_armor"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingguiButtonMessage(0, x, y, z));
				CraftingguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_armor", button_armor);
		this.addRenderableWidget(button_armor);
		button_tools = new Button(this.leftPos + 57, this.topPos + 52, 55, 20, new TranslatableComponent("gui.qz.craftinggui.button_tools"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingguiButtonMessage(1, x, y, z));
				CraftingguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_tools", button_tools);
		this.addRenderableWidget(button_tools);
	}
}
