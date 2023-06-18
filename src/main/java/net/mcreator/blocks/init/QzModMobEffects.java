
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.blocks.potion.SeekersMobEffect;
import net.mcreator.blocks.potion.HidersMobEffect;
import net.mcreator.blocks.potion.BioMobEffect;
import net.mcreator.blocks.QzMod;

public class QzModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, QzMod.MODID);
	public static final RegistryObject<MobEffect> BIO = REGISTRY.register("bio", () -> new BioMobEffect());
	public static final RegistryObject<MobEffect> HIDERS = REGISTRY.register("hiders", () -> new HidersMobEffect());
	public static final RegistryObject<MobEffect> SEEKERS = REGISTRY.register("seekers", () -> new SeekersMobEffect());
}
