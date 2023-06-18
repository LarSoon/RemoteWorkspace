
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.blocks.block.entity.WorkbenchslotsBlockEntity;
import net.mcreator.blocks.block.entity.Tumbav3BlockEntity;
import net.mcreator.blocks.block.entity.Tumbav2BlockEntity;
import net.mcreator.blocks.block.entity.Tumbav1BlockEntity;
import net.mcreator.blocks.block.entity.TumbaBlockEntity;
import net.mcreator.blocks.block.entity.SupplyinsnowBlockEntity;
import net.mcreator.blocks.block.entity.SupplyBlockEntity;
import net.mcreator.blocks.block.entity.StorageenchestBlockEntity;
import net.mcreator.blocks.block.entity.FuseboxopenedBlockEntity;
import net.mcreator.blocks.block.entity.EjectorupBlockEntity;
import net.mcreator.blocks.block.entity.EjectorBlockEntity;
import net.mcreator.blocks.block.entity.DestroyeddroidBlockEntity;
import net.mcreator.blocks.block.entity.Closetv2BlockEntity;
import net.mcreator.blocks.block.entity.Closetv1BlockEntity;
import net.mcreator.blocks.block.entity.ClosetBlockEntity;
import net.mcreator.blocks.QzMod;

public class QzModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, QzMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SUPPLY = register("supply", QzModBlocks.SUPPLY, SupplyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SUPPLYINSNOW = register("supplyinsnow", QzModBlocks.SUPPLYINSNOW, SupplyinsnowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EJECTOR = register("ejector", QzModBlocks.EJECTOR, EjectorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESTROYEDDROID = register("destroyeddroid", QzModBlocks.DESTROYEDDROID, DestroyeddroidBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STORAGEENCHEST = register("storageenchest", QzModBlocks.STORAGEENCHEST, StorageenchestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TUMBA = register("tumba", QzModBlocks.TUMBA, TumbaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CLOSET = register("closet", QzModBlocks.CLOSET, ClosetBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EJECTORUP = register("ejectorup", QzModBlocks.EJECTORUP, EjectorupBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TUMBAV_1 = register("tumbav_1", QzModBlocks.TUMBAV_1, Tumbav1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TUMBAV_2 = register("tumbav_2", QzModBlocks.TUMBAV_2, Tumbav2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TUMBAV_3 = register("tumbav_3", QzModBlocks.TUMBAV_3, Tumbav3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CLOSETV_1 = register("closetv_1", QzModBlocks.CLOSETV_1, Closetv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CLOSETV_2 = register("closetv_2", QzModBlocks.CLOSETV_2, Closetv2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FUSEBOXOPENED = register("fuseboxopened", QzModBlocks.FUSEBOXOPENED, FuseboxopenedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WORKBENCHSLOTS = register("workbenchslots", QzModBlocks.WORKBENCHSLOTS, WorkbenchslotsBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
