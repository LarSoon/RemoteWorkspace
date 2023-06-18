
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.blocks.block.ZoneBlock;
import net.mcreator.blocks.block.YellowBlock;
import net.mcreator.blocks.block.WpnboxBlock;
import net.mcreator.blocks.block.WorkbenchslotsBlock;
import net.mcreator.blocks.block.WorkbenchBlock;
import net.mcreator.blocks.block.WoodtableBlock;
import net.mcreator.blocks.block.WoodstairsBlock;
import net.mcreator.blocks.block.WoodstairBlock;
import net.mcreator.blocks.block.WoodshelfBlock;
import net.mcreator.blocks.block.WoodlogwithsnowendBlock;
import net.mcreator.blocks.block.WoodlogwithsnowBlock;
import net.mcreator.blocks.block.WoodendoortopopenedBlock;
import net.mcreator.blocks.block.WoodendoortopclosedBlock;
import net.mcreator.blocks.block.WoodendoorbotomopenedBlock;
import net.mcreator.blocks.block.WoodendoorbotomclosedBlock;
import net.mcreator.blocks.block.WoodchairBlock;
import net.mcreator.blocks.block.WiresblockBlock;
import net.mcreator.blocks.block.WarnBlock;
import net.mcreator.blocks.block.Wall4Block;
import net.mcreator.blocks.block.Wall3Block;
import net.mcreator.blocks.block.Wall2Block;
import net.mcreator.blocks.block.Wall1Block;
import net.mcreator.blocks.block.WDTSOBlock;
import net.mcreator.blocks.block.WDTSCBlock;
import net.mcreator.blocks.block.WDBSOBlock;
import net.mcreator.blocks.block.WDBSCBlock;
import net.mcreator.blocks.block.VentopenedBlock;
import net.mcreator.blocks.block.VentclosedBlock;
import net.mcreator.blocks.block.VentBlock;
import net.mcreator.blocks.block.Tvv2Block;
import net.mcreator.blocks.block.Tvv1Block;
import net.mcreator.blocks.block.TvBlock;
import net.mcreator.blocks.block.Tumbav3Block;
import net.mcreator.blocks.block.Tumbav2Block;
import net.mcreator.blocks.block.Tumbav1Block;
import net.mcreator.blocks.block.TumbaBlock;
import net.mcreator.blocks.block.TubescornerBlock;
import net.mcreator.blocks.block.TubesblockBlock;
import net.mcreator.blocks.block.TubesBlock;
import net.mcreator.blocks.block.TilestairBlock;
import net.mcreator.blocks.block.Tile1Block;
import net.mcreator.blocks.block.TableresourcespawnerBlock;
import net.mcreator.blocks.block.TablelamplightBlock;
import net.mcreator.blocks.block.TablelampBlock;
import net.mcreator.blocks.block.TabbleBlock;
import net.mcreator.blocks.block.SupplyinsnowBlock;
import net.mcreator.blocks.block.SupplyBlock;
import net.mcreator.blocks.block.StorageenchestBlock;
import net.mcreator.blocks.block.ShelfBlock;
import net.mcreator.blocks.block.ScrapblockBlock;
import net.mcreator.blocks.block.ScifilamponBlock;
import net.mcreator.blocks.block.ScifilampoffBlock;
import net.mcreator.blocks.block.ScifiblockBlock;
import net.mcreator.blocks.block.SafetydoortopopenedBlock;
import net.mcreator.blocks.block.SafetydoortopclosedBlock;
import net.mcreator.blocks.block.SafetydoorbottomopenBlock;
import net.mcreator.blocks.block.SafetydoorbottomcloseBlock;
import net.mcreator.blocks.block.RspawnBlock;
import net.mcreator.blocks.block.Roofslope1Block;
import net.mcreator.blocks.block.Roofcorner2Block;
import net.mcreator.blocks.block.Roofcorner1Block;
import net.mcreator.blocks.block.RedblinkBlock;
import net.mcreator.blocks.block.PlanksBlock;
import net.mcreator.blocks.block.Planks4Block;
import net.mcreator.blocks.block.Planks3Block;
import net.mcreator.blocks.block.Planks2Block;
import net.mcreator.blocks.block.Planks1Block;
import net.mcreator.blocks.block.Plank3Block;
import net.mcreator.blocks.block.Plank2Block;
import net.mcreator.blocks.block.Plank1Block;
import net.mcreator.blocks.block.Plank0Block;
import net.mcreator.blocks.block.PillsplacedBlock;
import net.mcreator.blocks.block.PapersBlock;
import net.mcreator.blocks.block.PCBlock;
import net.mcreator.blocks.block.MetalstairBlock;
import net.mcreator.blocks.block.MetalinsnowBlock;
import net.mcreator.blocks.block.MetalgrateBlock;
import net.mcreator.blocks.block.Metal5Block;
import net.mcreator.blocks.block.Metal4Block;
import net.mcreator.blocks.block.Metal3Block;
import net.mcreator.blocks.block.Metal2insnowBlock;
import net.mcreator.blocks.block.Metal2Block;
import net.mcreator.blocks.block.Metal1Block;
import net.mcreator.blocks.block.Metal01Block;
import net.mcreator.blocks.block.MedkitwallemptyBlock;
import net.mcreator.blocks.block.MedkitwallBlock;
import net.mcreator.blocks.block.MedkitBlock;
import net.mcreator.blocks.block.LogendBlock;
import net.mcreator.blocks.block.LogblockmainBlock;
import net.mcreator.blocks.block.LogBlock;
import net.mcreator.blocks.block.LockerupBlock;
import net.mcreator.blocks.block.LockerdownBlock;
import net.mcreator.blocks.block.LockerbigupopenedBlock;
import net.mcreator.blocks.block.LockerbigupclosedBlock;
import net.mcreator.blocks.block.LockerbigdownopenedBlock;
import net.mcreator.blocks.block.LockerbigdownclosedBlock;
import net.mcreator.blocks.block.KeysplacedBlock;
import net.mcreator.blocks.block.IcedeathBlock;
import net.mcreator.blocks.block.GreenblinkBlock;
import net.mcreator.blocks.block.GlasspurleBlock;
import net.mcreator.blocks.block.GlassorangeBlock;
import net.mcreator.blocks.block.GlassinarkBlock;
import net.mcreator.blocks.block.GlassgrayBlock;
import net.mcreator.blocks.block.GlassblackBlock;
import net.mcreator.blocks.block.Glass2Block;
import net.mcreator.blocks.block.Glass1Block;
import net.mcreator.blocks.block.FuseboxopenonBlock;
import net.mcreator.blocks.block.FuseboxopenedBlock;
import net.mcreator.blocks.block.FuseboxclosedBlock;
import net.mcreator.blocks.block.Floor1Block;
import net.mcreator.blocks.block.FencceBlock;
import net.mcreator.blocks.block.EjectorupBlock;
import net.mcreator.blocks.block.EjectorBlock;
import net.mcreator.blocks.block.DotsanimBlock;
import net.mcreator.blocks.block.DoortopopenedBlock;
import net.mcreator.blocks.block.DoortopclosedBlock;
import net.mcreator.blocks.block.DoorbottomopenBlock;
import net.mcreator.blocks.block.DoorbottomclosedBlock;
import net.mcreator.blocks.block.Display1Block;
import net.mcreator.blocks.block.DiskoblockBlock;
import net.mcreator.blocks.block.Discoblock2Block;
import net.mcreator.blocks.block.Discoblock1Block;
import net.mcreator.blocks.block.DestroyeddroidBlock;
import net.mcreator.blocks.block.DecorativecratesnowBlock;
import net.mcreator.blocks.block.DecorativecrateBlock;
import net.mcreator.blocks.block.CrateBlock;
import net.mcreator.blocks.block.ConsoleBlock;
import net.mcreator.blocks.block.ConcrettewallBlock;
import net.mcreator.blocks.block.Concrettewall3Block;
import net.mcreator.blocks.block.Concrettewall2Block;
import net.mcreator.blocks.block.Concrettewall1Block;
import net.mcreator.blocks.block.Concrettewall04Block;
import net.mcreator.blocks.block.ClothblockBlock;
import net.mcreator.blocks.block.Closetv2Block;
import net.mcreator.blocks.block.Closetv1Block;
import net.mcreator.blocks.block.ClosetBlock;
import net.mcreator.blocks.block.ChainlinkBlock;
import net.mcreator.blocks.block.CelllampBlock;
import net.mcreator.blocks.block.CassetteplayerBlock;
import net.mcreator.blocks.block.BooksBlock;
import net.mcreator.blocks.block.BlueBlock;
import net.mcreator.blocks.block.Block9Block;
import net.mcreator.blocks.block.Block8Block;
import net.mcreator.blocks.block.Block7Block;
import net.mcreator.blocks.block.Block6Block;
import net.mcreator.blocks.block.Block5Block;
import net.mcreator.blocks.block.Block4Block;
import net.mcreator.blocks.block.Block48Block;
import net.mcreator.blocks.block.Block47Block;
import net.mcreator.blocks.block.Block46Block;
import net.mcreator.blocks.block.Block45Block;
import net.mcreator.blocks.block.Block44Block;
import net.mcreator.blocks.block.Block43Block;
import net.mcreator.blocks.block.Block42Block;
import net.mcreator.blocks.block.Block41Block;
import net.mcreator.blocks.block.Block40Block;
import net.mcreator.blocks.block.Block3Block;
import net.mcreator.blocks.block.Block39Block;
import net.mcreator.blocks.block.Block38Block;
import net.mcreator.blocks.block.Block31Block;
import net.mcreator.blocks.block.Block30Block;
import net.mcreator.blocks.block.Block2Block;
import net.mcreator.blocks.block.Block29Block;
import net.mcreator.blocks.block.Block28Block;
import net.mcreator.blocks.block.Block27Block;
import net.mcreator.blocks.block.Block26Block;
import net.mcreator.blocks.block.Block25Block;
import net.mcreator.blocks.block.Block24Block;
import net.mcreator.blocks.block.Block23Block;
import net.mcreator.blocks.block.Block22Block;
import net.mcreator.blocks.block.Block21Block;
import net.mcreator.blocks.block.Block20Block;
import net.mcreator.blocks.block.Block1Block;
import net.mcreator.blocks.block.Block19Block;
import net.mcreator.blocks.block.Block18Block;
import net.mcreator.blocks.block.Block17Block;
import net.mcreator.blocks.block.Block16Block;
import net.mcreator.blocks.block.Block15Block;
import net.mcreator.blocks.block.Block14Block;
import net.mcreator.blocks.block.Block13Block;
import net.mcreator.blocks.block.Block12Block;
import net.mcreator.blocks.block.Block11Block;
import net.mcreator.blocks.block.Block10Block;
import net.mcreator.blocks.block.BiohazardbarrelBlock;
import net.mcreator.blocks.block.BarrelgreenBlock;
import net.mcreator.blocks.block.BarrelBlock;
import net.mcreator.blocks.block.AntenaupBlock;
import net.mcreator.blocks.block.AntenagroundBlock;
import net.mcreator.blocks.block.AntenabaseBlock;
import net.mcreator.blocks.block.AcidBlock;
import net.mcreator.blocks.block.ARubberDuckBlock;
import net.mcreator.blocks.QzMod;

public class QzModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, QzMod.MODID);
	public static final RegistryObject<Block> METAL_1 = REGISTRY.register("metal_1", () -> new Metal1Block());
	public static final RegistryObject<Block> METAL_2 = REGISTRY.register("metal_2", () -> new Metal2Block());
	public static final RegistryObject<Block> METAL_3 = REGISTRY.register("metal_3", () -> new Metal3Block());
	public static final RegistryObject<Block> METAL_4 = REGISTRY.register("metal_4", () -> new Metal4Block());
	public static final RegistryObject<Block> METAL_5 = REGISTRY.register("metal_5", () -> new Metal5Block());
	public static final RegistryObject<Block> ZONE = REGISTRY.register("zone", () -> new ZoneBlock());
	public static final RegistryObject<Block> TUBESBLOCK = REGISTRY.register("tubesblock", () -> new TubesblockBlock());
	public static final RegistryObject<Block> METAL_01 = REGISTRY.register("metal_01", () -> new Metal01Block());
	public static final RegistryObject<Block> METALINSNOW = REGISTRY.register("metalinsnow", () -> new MetalinsnowBlock());
	public static final RegistryObject<Block> METAL_2INSNOW = REGISTRY.register("metal_2insnow", () -> new Metal2insnowBlock());
	public static final RegistryObject<Block> WARN = REGISTRY.register("warn", () -> new WarnBlock());
	public static final RegistryObject<Block> SCIFIBLOCK = REGISTRY.register("scifiblock", () -> new ScifiblockBlock());
	public static final RegistryObject<Block> LOGBLOCKMAIN = REGISTRY.register("logblockmain", () -> new LogblockmainBlock());
	public static final RegistryObject<Block> PLANKS_1 = REGISTRY.register("planks_1", () -> new Planks1Block());
	public static final RegistryObject<Block> PLANKS_2 = REGISTRY.register("planks_2", () -> new Planks2Block());
	public static final RegistryObject<Block> PLANKS_3 = REGISTRY.register("planks_3", () -> new Planks3Block());
	public static final RegistryObject<Block> PLANKS_4 = REGISTRY.register("planks_4", () -> new Planks4Block());
	public static final RegistryObject<Block> BLUE = REGISTRY.register("blue", () -> new BlueBlock());
	public static final RegistryObject<Block> YELLOW = REGISTRY.register("yellow", () -> new YellowBlock());
	public static final RegistryObject<Block> WALL_1 = REGISTRY.register("wall_1", () -> new Wall1Block());
	public static final RegistryObject<Block> WALL_2 = REGISTRY.register("wall_2", () -> new Wall2Block());
	public static final RegistryObject<Block> WALL_3 = REGISTRY.register("wall_3", () -> new Wall3Block());
	public static final RegistryObject<Block> FLOOR_1 = REGISTRY.register("floor_1", () -> new Floor1Block());
	public static final RegistryObject<Block> WALL_4 = REGISTRY.register("wall_4", () -> new Wall4Block());
	public static final RegistryObject<Block> CONCRETTEWALL = REGISTRY.register("concrettewall", () -> new ConcrettewallBlock());
	public static final RegistryObject<Block> RSPAWN = REGISTRY.register("rspawn", () -> new RspawnBlock());
	public static final RegistryObject<Block> PLANK_1 = REGISTRY.register("plank_1", () -> new Plank1Block());
	public static final RegistryObject<Block> LOG = REGISTRY.register("log", () -> new LogBlock());
	public static final RegistryObject<Block> WOODLOGWITHSNOW = REGISTRY.register("woodlogwithsnow", () -> new WoodlogwithsnowBlock());
	public static final RegistryObject<Block> GLASS_1 = REGISTRY.register("glass_1", () -> new Glass1Block());
	public static final RegistryObject<Block> GLASS_2 = REGISTRY.register("glass_2", () -> new Glass2Block());
	public static final RegistryObject<Block> ICEDEATH = REGISTRY.register("icedeath", () -> new IcedeathBlock());
	public static final RegistryObject<Block> WOODSTAIRS = REGISTRY.register("woodstairs", () -> new WoodstairsBlock());
	public static final RegistryObject<Block> ROOFSLOPE_1 = REGISTRY.register("roofslope_1", () -> new Roofslope1Block());
	public static final RegistryObject<Block> ROOFCORNER_1 = REGISTRY.register("roofcorner_1", () -> new Roofcorner1Block());
	public static final RegistryObject<Block> ROOFCORNER_2 = REGISTRY.register("roofcorner_2", () -> new Roofcorner2Block());
	public static final RegistryObject<Block> TUBES = REGISTRY.register("tubes", () -> new TubesBlock());
	public static final RegistryObject<Block> TUBESCORNER = REGISTRY.register("tubescorner", () -> new TubescornerBlock());
	public static final RegistryObject<Block> CONCRETTEWALL_1 = REGISTRY.register("concrettewall_1", () -> new Concrettewall1Block());
	public static final RegistryObject<Block> CONCRETTEWALL_2 = REGISTRY.register("concrettewall_2", () -> new Concrettewall2Block());
	public static final RegistryObject<Block> CONCRETTEWALL_3 = REGISTRY.register("concrettewall_3", () -> new Concrettewall3Block());
	public static final RegistryObject<Block> CONCRETTEWALL_04 = REGISTRY.register("concrettewall_04", () -> new Concrettewall04Block());
	public static final RegistryObject<Block> CHAINLINK = REGISTRY.register("chainlink", () -> new ChainlinkBlock());
	public static final RegistryObject<Block> GLASSPURLE = REGISTRY.register("glasspurle", () -> new GlasspurleBlock());
	public static final RegistryObject<Block> GLASSORANGE = REGISTRY.register("glassorange", () -> new GlassorangeBlock());
	public static final RegistryObject<Block> GLASSBLACK = REGISTRY.register("glassblack", () -> new GlassblackBlock());
	public static final RegistryObject<Block> GLASSGRAY = REGISTRY.register("glassgray", () -> new GlassgrayBlock());
	public static final RegistryObject<Block> GLASSINARK = REGISTRY.register("glassinark", () -> new GlassinarkBlock());
	public static final RegistryObject<Block> METALSTAIR = REGISTRY.register("metalstair", () -> new MetalstairBlock());
	public static final RegistryObject<Block> WOODSTAIR = REGISTRY.register("woodstair", () -> new WoodstairBlock());
	public static final RegistryObject<Block> TILESTAIR = REGISTRY.register("tilestair", () -> new TilestairBlock());
	public static final RegistryObject<Block> WPNBOX = REGISTRY.register("wpnbox", () -> new WpnboxBlock());
	public static final RegistryObject<Block> VENT = REGISTRY.register("vent", () -> new VentBlock());
	public static final RegistryObject<Block> BLOCK_1 = REGISTRY.register("block_1", () -> new Block1Block());
	public static final RegistryObject<Block> BLOCK_2 = REGISTRY.register("block_2", () -> new Block2Block());
	public static final RegistryObject<Block> BLOCK_3 = REGISTRY.register("block_3", () -> new Block3Block());
	public static final RegistryObject<Block> BLOCK_4 = REGISTRY.register("block_4", () -> new Block4Block());
	public static final RegistryObject<Block> BLOCK_5 = REGISTRY.register("block_5", () -> new Block5Block());
	public static final RegistryObject<Block> BLOCK_6 = REGISTRY.register("block_6", () -> new Block6Block());
	public static final RegistryObject<Block> BLOCK_7 = REGISTRY.register("block_7", () -> new Block7Block());
	public static final RegistryObject<Block> BLOCK_8 = REGISTRY.register("block_8", () -> new Block8Block());
	public static final RegistryObject<Block> BLOCK_9 = REGISTRY.register("block_9", () -> new Block9Block());
	public static final RegistryObject<Block> BLOCK_10 = REGISTRY.register("block_10", () -> new Block10Block());
	public static final RegistryObject<Block> BLOCK_11 = REGISTRY.register("block_11", () -> new Block11Block());
	public static final RegistryObject<Block> BLOCK_12 = REGISTRY.register("block_12", () -> new Block12Block());
	public static final RegistryObject<Block> BLOCK_13 = REGISTRY.register("block_13", () -> new Block13Block());
	public static final RegistryObject<Block> BLOCK_14 = REGISTRY.register("block_14", () -> new Block14Block());
	public static final RegistryObject<Block> BLOCK_15 = REGISTRY.register("block_15", () -> new Block15Block());
	public static final RegistryObject<Block> BLOCK_16 = REGISTRY.register("block_16", () -> new Block16Block());
	public static final RegistryObject<Block> BLOCK_17 = REGISTRY.register("block_17", () -> new Block17Block());
	public static final RegistryObject<Block> BLOCK_18 = REGISTRY.register("block_18", () -> new Block18Block());
	public static final RegistryObject<Block> BLOCK_19 = REGISTRY.register("block_19", () -> new Block19Block());
	public static final RegistryObject<Block> BLOCK_20 = REGISTRY.register("block_20", () -> new Block20Block());
	public static final RegistryObject<Block> BLOCK_21 = REGISTRY.register("block_21", () -> new Block21Block());
	public static final RegistryObject<Block> BLOCK_22 = REGISTRY.register("block_22", () -> new Block22Block());
	public static final RegistryObject<Block> BLOCK_23 = REGISTRY.register("block_23", () -> new Block23Block());
	public static final RegistryObject<Block> BLOCK_24 = REGISTRY.register("block_24", () -> new Block24Block());
	public static final RegistryObject<Block> BLOCK_25 = REGISTRY.register("block_25", () -> new Block25Block());
	public static final RegistryObject<Block> BLOCK_26 = REGISTRY.register("block_26", () -> new Block26Block());
	public static final RegistryObject<Block> BLOCK_27 = REGISTRY.register("block_27", () -> new Block27Block());
	public static final RegistryObject<Block> BLOCK_28 = REGISTRY.register("block_28", () -> new Block28Block());
	public static final RegistryObject<Block> BLOCK_29 = REGISTRY.register("block_29", () -> new Block29Block());
	public static final RegistryObject<Block> BLOCK_30 = REGISTRY.register("block_30", () -> new Block30Block());
	public static final RegistryObject<Block> BLOCK_31 = REGISTRY.register("block_31", () -> new Block31Block());
	public static final RegistryObject<Block> BLOCK_38 = REGISTRY.register("block_38", () -> new Block38Block());
	public static final RegistryObject<Block> BLOCK_39 = REGISTRY.register("block_39", () -> new Block39Block());
	public static final RegistryObject<Block> BLOCK_40 = REGISTRY.register("block_40", () -> new Block40Block());
	public static final RegistryObject<Block> BLOCK_41 = REGISTRY.register("block_41", () -> new Block41Block());
	public static final RegistryObject<Block> TILE_1 = REGISTRY.register("tile_1", () -> new Tile1Block());
	public static final RegistryObject<Block> BLOCK_42 = REGISTRY.register("block_42", () -> new Block42Block());
	public static final RegistryObject<Block> BLOCK_43 = REGISTRY.register("block_43", () -> new Block43Block());
	public static final RegistryObject<Block> BLOCK_44 = REGISTRY.register("block_44", () -> new Block44Block());
	public static final RegistryObject<Block> BLOCK_45 = REGISTRY.register("block_45", () -> new Block45Block());
	public static final RegistryObject<Block> BLOCK_46 = REGISTRY.register("block_46", () -> new Block46Block());
	public static final RegistryObject<Block> BLOCK_47 = REGISTRY.register("block_47", () -> new Block47Block());
	public static final RegistryObject<Block> BLOCK_48 = REGISTRY.register("block_48", () -> new Block48Block());
	public static final RegistryObject<Block> VENTOPENED = REGISTRY.register("ventopened", () -> new VentopenedBlock());
	public static final RegistryObject<Block> SUPPLY = REGISTRY.register("supply", () -> new SupplyBlock());
	public static final RegistryObject<Block> SUPPLYINSNOW = REGISTRY.register("supplyinsnow", () -> new SupplyinsnowBlock());
	public static final RegistryObject<Block> PC = REGISTRY.register("pc", () -> new PCBlock());
	public static final RegistryObject<Block> EJECTOR = REGISTRY.register("ejector", () -> new EjectorBlock());
	public static final RegistryObject<Block> DESTROYEDDROID = REGISTRY.register("destroyeddroid", () -> new DestroyeddroidBlock());
	public static final RegistryObject<Block> CASSETTEPLAYER = REGISTRY.register("cassetteplayer", () -> new CassetteplayerBlock());
	public static final RegistryObject<Block> STORAGEENCHEST = REGISTRY.register("storageenchest", () -> new StorageenchestBlock());
	public static final RegistryObject<Block> WORKBENCH = REGISTRY.register("workbench", () -> new WorkbenchBlock());
	public static final RegistryObject<Block> FUSEBOXCLOSED = REGISTRY.register("fuseboxclosed", () -> new FuseboxclosedBlock());
	public static final RegistryObject<Block> TUMBA = REGISTRY.register("tumba", () -> new TumbaBlock());
	public static final RegistryObject<Block> CLOSET = REGISTRY.register("closet", () -> new ClosetBlock());
	public static final RegistryObject<Block> PLANKS = REGISTRY.register("planks", () -> new PlanksBlock());
	public static final RegistryObject<Block> CLOTHBLOCK = REGISTRY.register("clothblock", () -> new ClothblockBlock());
	public static final RegistryObject<Block> WIRESBLOCK = REGISTRY.register("wiresblock", () -> new WiresblockBlock());
	public static final RegistryObject<Block> SCRAPBLOCK = REGISTRY.register("scrapblock", () -> new ScrapblockBlock());
	public static final RegistryObject<Block> MEDKIT = REGISTRY.register("medkit", () -> new MedkitBlock());
	public static final RegistryObject<Block> PILLSPLACED = REGISTRY.register("pillsplaced", () -> new PillsplacedBlock());
	public static final RegistryObject<Block> KEYSPLACED = REGISTRY.register("keysplaced", () -> new KeysplacedBlock());
	public static final RegistryObject<Block> CONSOLE = REGISTRY.register("console", () -> new ConsoleBlock());
	public static final RegistryObject<Block> MEDKITWALL = REGISTRY.register("medkitwall", () -> new MedkitwallBlock());
	public static final RegistryObject<Block> BOOKS = REGISTRY.register("books", () -> new BooksBlock());
	public static final RegistryObject<Block> VENTCLOSED = REGISTRY.register("ventclosed", () -> new VentclosedBlock());
	public static final RegistryObject<Block> DECORATIVECRATE = REGISTRY.register("decorativecrate", () -> new DecorativecrateBlock());
	public static final RegistryObject<Block> DECORATIVECRATESNOW = REGISTRY.register("decorativecratesnow", () -> new DecorativecratesnowBlock());
	public static final RegistryObject<Block> DOTSANIM = REGISTRY.register("dotsanim", () -> new DotsanimBlock());
	public static final RegistryObject<Block> DISKOBLOCK = REGISTRY.register("diskoblock", () -> new DiskoblockBlock());
	public static final RegistryObject<Block> DISCOBLOCK_1 = REGISTRY.register("discoblock_1", () -> new Discoblock1Block());
	public static final RegistryObject<Block> DISCOBLOCK_2 = REGISTRY.register("discoblock_2", () -> new Discoblock2Block());
	public static final RegistryObject<Block> TABLERESOURCESPAWNER = REGISTRY.register("tableresourcespawner", () -> new TableresourcespawnerBlock());
	public static final RegistryObject<Block> TABBLE = REGISTRY.register("tabble", () -> new TabbleBlock());
	public static final RegistryObject<Block> SHELF = REGISTRY.register("shelf", () -> new ShelfBlock());
	public static final RegistryObject<Block> BARREL = REGISTRY.register("barrel", () -> new BarrelBlock());
	public static final RegistryObject<Block> BARRELGREEN = REGISTRY.register("barrelgreen", () -> new BarrelgreenBlock());
	public static final RegistryObject<Block> BIOHAZARDBARREL = REGISTRY.register("biohazardbarrel", () -> new BiohazardbarrelBlock());
	public static final RegistryObject<Block> A_RUBBER_DUCK = REGISTRY.register("a_rubber_duck", () -> new ARubberDuckBlock());
	public static final RegistryObject<Block> TV = REGISTRY.register("tv", () -> new TvBlock());
	public static final RegistryObject<Block> TABLELAMP = REGISTRY.register("tablelamp", () -> new TablelampBlock());
	public static final RegistryObject<Block> METALGRATE = REGISTRY.register("metalgrate", () -> new MetalgrateBlock());
	public static final RegistryObject<Block> FENCCE = REGISTRY.register("fencce", () -> new FencceBlock());
	public static final RegistryObject<Block> ANTENAGROUND = REGISTRY.register("antenaground", () -> new AntenagroundBlock());
	public static final RegistryObject<Block> ANTENABASE = REGISTRY.register("antenabase", () -> new AntenabaseBlock());
	public static final RegistryObject<Block> ANTENAUP = REGISTRY.register("antenaup", () -> new AntenaupBlock());
	public static final RegistryObject<Block> LOGEND = REGISTRY.register("logend", () -> new LogendBlock());
	public static final RegistryObject<Block> WOODSHELF = REGISTRY.register("woodshelf", () -> new WoodshelfBlock());
	public static final RegistryObject<Block> WOODTABLE = REGISTRY.register("woodtable", () -> new WoodtableBlock());
	public static final RegistryObject<Block> WOODCHAIR = REGISTRY.register("woodchair", () -> new WoodchairBlock());
	public static final RegistryObject<Block> WOODLOGWITHSNOWEND = REGISTRY.register("woodlogwithsnowend", () -> new WoodlogwithsnowendBlock());
	public static final RegistryObject<Block> PAPERS = REGISTRY.register("papers", () -> new PapersBlock());
	public static final RegistryObject<Block> SCIFILAMPOFF = REGISTRY.register("scifilampoff", () -> new ScifilampoffBlock());
	public static final RegistryObject<Block> SCIFILAMPON = REGISTRY.register("scifilampon", () -> new ScifilamponBlock());
	public static final RegistryObject<Block> DISPLAY_1 = REGISTRY.register("display_1", () -> new Display1Block());
	public static final RegistryObject<Block> GREENBLINK = REGISTRY.register("greenblink", () -> new GreenblinkBlock());
	public static final RegistryObject<Block> REDBLINK = REGISTRY.register("redblink", () -> new RedblinkBlock());
	public static final RegistryObject<Block> LOCKERDOWN = REGISTRY.register("lockerdown", () -> new LockerdownBlock());
	public static final RegistryObject<Block> CELLLAMP = REGISTRY.register("celllamp", () -> new CelllampBlock());
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> DOORBOTTOMCLOSED = REGISTRY.register("doorbottomclosed", () -> new DoorbottomclosedBlock());
	public static final RegistryObject<Block> SAFETYDOORBOTTOMCLOSE = REGISTRY.register("safetydoorbottomclose", () -> new SafetydoorbottomcloseBlock());
	public static final RegistryObject<Block> WOODENDOORBOTOMCLOSED = REGISTRY.register("woodendoorbotomclosed", () -> new WoodendoorbotomclosedBlock());
	public static final RegistryObject<Block> WDBSC = REGISTRY.register("wdbsc", () -> new WDBSCBlock());
	public static final RegistryObject<Block> LOCKERBIGDOWNCLOSED = REGISTRY.register("lockerbigdownclosed", () -> new LockerbigdownclosedBlock());
	public static final RegistryObject<Block> EJECTORUP = REGISTRY.register("ejectorup", () -> new EjectorupBlock());
	public static final RegistryObject<Block> PLANK_3 = REGISTRY.register("plank_3", () -> new Plank3Block());
	public static final RegistryObject<Block> PLANK_2 = REGISTRY.register("plank_2", () -> new Plank2Block());
	public static final RegistryObject<Block> PLANK_0 = REGISTRY.register("plank_0", () -> new Plank0Block());
	public static final RegistryObject<Block> TUMBAV_1 = REGISTRY.register("tumbav_1", () -> new Tumbav1Block());
	public static final RegistryObject<Block> TUMBAV_2 = REGISTRY.register("tumbav_2", () -> new Tumbav2Block());
	public static final RegistryObject<Block> TUMBAV_3 = REGISTRY.register("tumbav_3", () -> new Tumbav3Block());
	public static final RegistryObject<Block> TVV_1 = REGISTRY.register("tvv_1", () -> new Tvv1Block());
	public static final RegistryObject<Block> TVV_2 = REGISTRY.register("tvv_2", () -> new Tvv2Block());
	public static final RegistryObject<Block> TABLELAMPLIGHT = REGISTRY.register("tablelamplight", () -> new TablelamplightBlock());
	public static final RegistryObject<Block> CLOSETV_1 = REGISTRY.register("closetv_1", () -> new Closetv1Block());
	public static final RegistryObject<Block> CLOSETV_2 = REGISTRY.register("closetv_2", () -> new Closetv2Block());
	public static final RegistryObject<Block> FUSEBOXOPENED = REGISTRY.register("fuseboxopened", () -> new FuseboxopenedBlock());
	public static final RegistryObject<Block> FUSEBOXOPENON = REGISTRY.register("fuseboxopenon", () -> new FuseboxopenonBlock());
	public static final RegistryObject<Block> DOORBOTTOMOPEN = REGISTRY.register("doorbottomopen", () -> new DoorbottomopenBlock());
	public static final RegistryObject<Block> DOORTOPCLOSED = REGISTRY.register("doortopclosed", () -> new DoortopclosedBlock());
	public static final RegistryObject<Block> DOORTOPOPENED = REGISTRY.register("doortopopened", () -> new DoortopopenedBlock());
	public static final RegistryObject<Block> WOODENDOORBOTOMOPENED = REGISTRY.register("woodendoorbotomopened", () -> new WoodendoorbotomopenedBlock());
	public static final RegistryObject<Block> WOODENDOORTOPOPENED = REGISTRY.register("woodendoortopopened", () -> new WoodendoortopopenedBlock());
	public static final RegistryObject<Block> WOODENDOORTOPCLOSED = REGISTRY.register("woodendoortopclosed", () -> new WoodendoortopclosedBlock());
	public static final RegistryObject<Block> WDBSO = REGISTRY.register("wdbso", () -> new WDBSOBlock());
	public static final RegistryObject<Block> WDTSC = REGISTRY.register("wdtsc", () -> new WDTSCBlock());
	public static final RegistryObject<Block> WDTSO = REGISTRY.register("wdtso", () -> new WDTSOBlock());
	public static final RegistryObject<Block> SAFETYDOORBOTTOMOPEN = REGISTRY.register("safetydoorbottomopen", () -> new SafetydoorbottomopenBlock());
	public static final RegistryObject<Block> SAFETYDOORTOPCLOSED = REGISTRY.register("safetydoortopclosed", () -> new SafetydoortopclosedBlock());
	public static final RegistryObject<Block> SAFETYDOORTOPOPENED = REGISTRY.register("safetydoortopopened", () -> new SafetydoortopopenedBlock());
	public static final RegistryObject<Block> WORKBENCHSLOTS = REGISTRY.register("workbenchslots", () -> new WorkbenchslotsBlock());
	public static final RegistryObject<Block> LOCKERUP = REGISTRY.register("lockerup", () -> new LockerupBlock());
	public static final RegistryObject<Block> LOCKERBIGUPCLOSED = REGISTRY.register("lockerbigupclosed", () -> new LockerbigupclosedBlock());
	public static final RegistryObject<Block> LOCKERBIGDOWNOPENED = REGISTRY.register("lockerbigdownopened", () -> new LockerbigdownopenedBlock());
	public static final RegistryObject<Block> LOCKERBIGUPOPENED = REGISTRY.register("lockerbigupopened", () -> new LockerbigupopenedBlock());
	public static final RegistryObject<Block> MEDKITWALLEMPTY = REGISTRY.register("medkitwallempty", () -> new MedkitwallemptyBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Plank1Block.registerRenderLayer();
			LogBlock.registerRenderLayer();
			WoodlogwithsnowBlock.registerRenderLayer();
			Glass1Block.registerRenderLayer();
			Glass2Block.registerRenderLayer();
			Roofslope1Block.registerRenderLayer();
			Roofcorner1Block.registerRenderLayer();
			Roofcorner2Block.registerRenderLayer();
			TubesBlock.registerRenderLayer();
			TubescornerBlock.registerRenderLayer();
			Concrettewall1Block.registerRenderLayer();
			Concrettewall2Block.registerRenderLayer();
			Concrettewall3Block.registerRenderLayer();
			Concrettewall04Block.registerRenderLayer();
			ChainlinkBlock.registerRenderLayer();
			GlasspurleBlock.registerRenderLayer();
			GlassorangeBlock.registerRenderLayer();
			GlassblackBlock.registerRenderLayer();
			GlassgrayBlock.registerRenderLayer();
			GlassinarkBlock.registerRenderLayer();
			MetalstairBlock.registerRenderLayer();
			WoodstairBlock.registerRenderLayer();
			TilestairBlock.registerRenderLayer();
			WpnboxBlock.registerRenderLayer();
			VentopenedBlock.registerRenderLayer();
			PCBlock.registerRenderLayer();
			EjectorBlock.registerRenderLayer();
			DestroyeddroidBlock.registerRenderLayer();
			CassetteplayerBlock.registerRenderLayer();
			StorageenchestBlock.registerRenderLayer();
			WorkbenchBlock.registerRenderLayer();
			FuseboxclosedBlock.registerRenderLayer();
			TumbaBlock.registerRenderLayer();
			ClosetBlock.registerRenderLayer();
			PlanksBlock.registerRenderLayer();
			ClothblockBlock.registerRenderLayer();
			WiresblockBlock.registerRenderLayer();
			ScrapblockBlock.registerRenderLayer();
			MedkitBlock.registerRenderLayer();
			PillsplacedBlock.registerRenderLayer();
			KeysplacedBlock.registerRenderLayer();
			ConsoleBlock.registerRenderLayer();
			MedkitwallBlock.registerRenderLayer();
			BooksBlock.registerRenderLayer();
			VentclosedBlock.registerRenderLayer();
			TableresourcespawnerBlock.registerRenderLayer();
			TabbleBlock.registerRenderLayer();
			ShelfBlock.registerRenderLayer();
			BarrelBlock.registerRenderLayer();
			BarrelgreenBlock.registerRenderLayer();
			BiohazardbarrelBlock.registerRenderLayer();
			ARubberDuckBlock.registerRenderLayer();
			TvBlock.registerRenderLayer();
			TablelampBlock.registerRenderLayer();
			MetalgrateBlock.registerRenderLayer();
			FencceBlock.registerRenderLayer();
			AntenagroundBlock.registerRenderLayer();
			AntenabaseBlock.registerRenderLayer();
			AntenaupBlock.registerRenderLayer();
			LogendBlock.registerRenderLayer();
			WoodshelfBlock.registerRenderLayer();
			WoodtableBlock.registerRenderLayer();
			WoodchairBlock.registerRenderLayer();
			WoodlogwithsnowendBlock.registerRenderLayer();
			PapersBlock.registerRenderLayer();
			ScifilampoffBlock.registerRenderLayer();
			ScifilamponBlock.registerRenderLayer();
			Display1Block.registerRenderLayer();
			GreenblinkBlock.registerRenderLayer();
			RedblinkBlock.registerRenderLayer();
			LockerdownBlock.registerRenderLayer();
			CelllampBlock.registerRenderLayer();
			DoorbottomclosedBlock.registerRenderLayer();
			SafetydoorbottomcloseBlock.registerRenderLayer();
			WoodendoorbotomclosedBlock.registerRenderLayer();
			WDBSCBlock.registerRenderLayer();
			LockerbigdownclosedBlock.registerRenderLayer();
			EjectorupBlock.registerRenderLayer();
			Plank3Block.registerRenderLayer();
			Plank2Block.registerRenderLayer();
			Plank0Block.registerRenderLayer();
			Tumbav1Block.registerRenderLayer();
			Tumbav2Block.registerRenderLayer();
			Tumbav3Block.registerRenderLayer();
			Tvv1Block.registerRenderLayer();
			Tvv2Block.registerRenderLayer();
			TablelamplightBlock.registerRenderLayer();
			Closetv1Block.registerRenderLayer();
			Closetv2Block.registerRenderLayer();
			FuseboxopenedBlock.registerRenderLayer();
			FuseboxopenonBlock.registerRenderLayer();
			DoorbottomopenBlock.registerRenderLayer();
			DoortopclosedBlock.registerRenderLayer();
			DoortopopenedBlock.registerRenderLayer();
			WoodendoorbotomopenedBlock.registerRenderLayer();
			WoodendoortopopenedBlock.registerRenderLayer();
			WoodendoortopclosedBlock.registerRenderLayer();
			WDBSOBlock.registerRenderLayer();
			WDTSCBlock.registerRenderLayer();
			WDTSOBlock.registerRenderLayer();
			SafetydoorbottomopenBlock.registerRenderLayer();
			SafetydoortopclosedBlock.registerRenderLayer();
			SafetydoortopopenedBlock.registerRenderLayer();
			WorkbenchslotsBlock.registerRenderLayer();
			LockerupBlock.registerRenderLayer();
			LockerbigupclosedBlock.registerRenderLayer();
			LockerbigdownopenedBlock.registerRenderLayer();
			LockerbigupopenedBlock.registerRenderLayer();
			MedkitwallemptyBlock.registerRenderLayer();
		}
	}
}
