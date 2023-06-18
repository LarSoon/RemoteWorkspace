
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

import net.mcreator.blocks.world.inventory.DeviceguiMenu;
import net.mcreator.blocks.network.DeviceguiButtonMessage;
import net.mcreator.blocks.QzMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DeviceguiScreen extends AbstractContainerScreen<DeviceguiMenu> {
	private final static HashMap<String, Object> guistate = DeviceguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_scanner;
	Button button_crowbar;

	public DeviceguiScreen(DeviceguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("qz:textures/screens/devicegui.png");

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
		this.font.draw(poseStack, new TranslatableComponent("gui.qz.devicegui.label_scrap_2_circuit_board_3_wires"), 3, 29, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.qz.devicegui.label_scrap_5"), 5, 60, -12829636);
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
		button_back = new Button(this.leftPos + 124, this.topPos + 59, 45, 20, new TranslatableComponent("gui.qz.devicegui.button_back"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new DeviceguiButtonMessage(0, x, y, z));
				DeviceguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_scanner = new Button(this.leftPos + 5, this.topPos + 8, 60, 20, new TranslatableComponent("gui.qz.devicegui.button_scanner"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new DeviceguiButtonMessage(1, x, y, z));
				DeviceguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_scanner", button_scanner);
		this.addRenderableWidget(button_scanner);
		button_crowbar = new Button(this.leftPos + 5, this.topPos + 39, 60, 20, new TranslatableComponent("gui.qz.devicegui.button_crowbar"), e -> {
			if (true) {
				QzMod.PACKET_HANDLER.sendToServer(new DeviceguiButtonMessage(2, x, y, z));
				DeviceguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_crowbar", button_crowbar);
		this.addRenderableWidget(button_crowbar);
	}
}
