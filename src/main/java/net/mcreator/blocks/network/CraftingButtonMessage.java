
package net.mcreator.blocks.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.blocks.world.inventory.CraftingMenu;
import net.mcreator.blocks.procedures.BackbuttonProcedure;
import net.mcreator.blocks.procedures.Armor4Procedure;
import net.mcreator.blocks.procedures.Armor3Procedure;
import net.mcreator.blocks.procedures.Armor2Procedure;
import net.mcreator.blocks.procedures.Armor1Procedure;
import net.mcreator.blocks.QzMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftingButtonMessage {
	private final int buttonID, x, y, z;

	public CraftingButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CraftingButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CraftingButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CraftingButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = CraftingMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Armor1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Armor2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Armor3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Armor4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			BackbuttonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		QzMod.addNetworkMessage(CraftingButtonMessage.class, CraftingButtonMessage::buffer, CraftingButtonMessage::new, CraftingButtonMessage::handler);
	}
}
