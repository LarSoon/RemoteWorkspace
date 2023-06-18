
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.blocks.QzMod;

public class QzModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, QzMod.MODID);
	public static final RegistryObject<Potion> BIO = REGISTRY.register("bio", () -> new Potion(new MobEffectInstance(QzModMobEffects.BIO.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> HIDERS = REGISTRY.register("hiders", () -> new Potion(new MobEffectInstance(QzModMobEffects.HIDERS.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> SEEKERS = REGISTRY.register("seekers", () -> new Potion(new MobEffectInstance(QzModMobEffects.SEEKERS.get(), 3600, 0, false, true)));
}
