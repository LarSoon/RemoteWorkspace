
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

import net.mcreator.blocks.world.inventory.CraftingMenu;
import net.mcreator.blocks.network.CraftingButtonMessage;
import net.mcreator.blocks.QzMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CraftingScreen extends AbstractContainerScreen<CraftingMenu> {
	private final static HashMap<String, Object> guistate = CraftingMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_armor_lvl_1;
	Button button_armor_lvl_2;
	Button button_armor_lvl_3;
	Button button_armor_lvl_4;
	Button button_back;

	public CraftingScreen(CraftingMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 244;
		this.imageHeight = 184;
	}

	private static final ResourceLocation texture = new ResourceLocation("qz:textures/screens/crafting.png");

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
		this.font.draw(poseStack, new TranslatableComponent("gui.qz.crafting.label_3_cloth_5_metal"), 4, 30, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.qz.crafting.label_6_cloth_10_metal"), 4, 74, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.qz.crafting.label_11_cloth_27_metal"), 103, 30, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.qz.crafting.label_16_cloth_31_metal"), 103, 74, -12829636);
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
		button_armor_lvl_1 = new Button(this.leftPos + 4, this.topPos + 8, 80, 20, new TranslatableComponent("gui.qz.crafting.button_armor_lvl_1"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingButtonMessage(0, x, y, z));
				CraftingButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_armor_lvl_1", button_armor_lvl_1);
		this.addRenderableWidget(button_armor_lvl_1);
		button_armor_lvl_2 = new Button(this.leftPos + 4, this.topPos + 52, 80, 20, new TranslatableComponent("gui.qz.crafting.button_armor_lvl_2"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingButtonMessage(1, x, y, z));
				CraftingButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_armor_lvl_2", button_armor_lvl_2);
		this.addRenderableWidget(button_armor_lvl_2);
		button_armor_lvl_3 = new Button(this.leftPos + 103, this.topPos + 8, 80, 20, new TranslatableComponent("gui.qz.crafting.button_armor_lvl_3"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingButtonMessage(2, x, y, z));
				CraftingButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_armor_lvl_3", button_armor_lvl_3);
		this.addRenderableWidget(button_armor_lvl_3);
		button_armor_lvl_4 = new Button(this.leftPos + 103, this.topPos + 52, 80, 20, new TranslatableComponent("gui.qz.crafting.button_armor_lvl_4"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingButtonMessage(3, x, y, z));
				CraftingButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_armor_lvl_4", button_armor_lvl_4);
		this.addRenderableWidget(button_armor_lvl_4);
		button_back = new Button(this.leftPos + 193, this.topPos + 52, 45, 20, new TranslatableComponent("gui.qz.crafting.button_back"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new CraftingButtonMessage(4, x, y, z));
				CraftingButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
