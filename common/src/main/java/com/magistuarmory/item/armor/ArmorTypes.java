package com.magistuarmory.item.armor;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.config.ArmorConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ArmorTypes
{
	public static final ArmorConfig ARMOR_CONFIG = EpicKnights.CONFIG.armor;

// Fabric: No DeferredRegister. We'll register directly in init().

	public static final ArmorType MINICROWN;
	public static final ArmorType CROWN;
	public static final ArmorType FLOWERCROWN;
	public static final ArmorType KNIGHT;
	public static final ArmorType ARMET;
	public static final ArmorType STECHHELM;
	public static final ArmorType JOUSTING;
	public static final ArmorType SALLET;
	public static final ArmorType GOTHIC;
	public static final ArmorType MAXIMILIAN_HELMET;
	public static final ArmorType MAXIMILIAN;
	public static final ArmorType CHAINMAIL;
	public static final ArmorType KETTLEHAT;
	public static final ArmorType PLATEMAIL;
	public static final ArmorType BARBUTE;
	public static final ArmorType HALFARMOR;
	public static final ArmorType GREATHELM;
	public static final ArmorType CRUSADER;
	public static final ArmorType BRIGANDINE;
	public static final ArmorType GAMBESON;
	public static final ArmorType CEREMONIAL_ARMET;
	public static final ArmorType CEREMONIAL;
	public static final ArmorType SHISHAK;
	public static final ArmorType NORMAN;
	public static final ArmorType RUSTED_BARBUTE;
	public static final ArmorType RUSTED_HALFARMOR;
	public static final ArmorType RUSTED_CHAINMAIL;
	public static final ArmorType RUSTED_KETTLEHAT;
	public static final ArmorType RUSTED_NORMAN;
	public static final ArmorType RUSTED_GREATHELM;
	public static final ArmorType RUSTED_CRUSADER;
	public static final ArmorType BASCINET;
	public static final ArmorType XIV_CENTURY_KNIGHT;
	public static final ArmorType WINGED_HUSSAR_CHESTPLATE;
	public static final ArmorType CUIRASSIER;
	public static final ArmorType KASTENBRUST;
	public static final ArmorType GRAND_BASCINET;
	public static final ArmorType LAMELLAR;

	static {
		// We'll initialize these in init()
		MINICROWN = null;
		CROWN = null;
		FLOWERCROWN = null;
		KNIGHT = null;
		ARMET = null;
		STECHHELM = null;
		JOUSTING = null;
		SALLET = null;
		GOTHIC = null;
		MAXIMILIAN_HELMET = null;
		MAXIMILIAN = null;
		CHAINMAIL = null;
		KETTLEHAT = null;
		PLATEMAIL = null;
		BARBUTE = null;
		HALFARMOR = null;
		GREATHELM = null;
		CRUSADER = null;
		BRIGANDINE = null;
		GAMBESON = null;
		CEREMONIAL_ARMET = null;
		CEREMONIAL = null;
		SHISHAK = null;
		NORMAN = null;
		RUSTED_BARBUTE = null;
		RUSTED_HALFARMOR = null;
		RUSTED_CHAINMAIL = null;
		RUSTED_KETTLEHAT = null;
		RUSTED_NORMAN = null;
		RUSTED_GREATHELM = null;
		RUSTED_CRUSADER = null;
		BASCINET = null;
		XIV_CENTURY_KNIGHT = null;
		WINGED_HUSSAR_CHESTPLATE = null;
		CUIRASSIER = null;
		KASTENBRUST = null;
		GRAND_BASCINET = null;
		LAMELLAR = null;
	}

	private static ArmorType create(ResourceLocation location,
								   ResourceLocation modelLocation,
								   ArmorConfig.ArmorTypeConfig config,
								   Holder<SoundEvent> equipSound,
								   boolean dyeable,
								   String repairItemTag) {
		// Fabric: Use Ingredient.of(TagKey<Item>) instead of fromTag
		return new ArmorType(location, modelLocation, config.toughness, config.knockbackResistance, new Integer[] {config.bootsDurability, config.leggingsDurability, config.chestplateDurability, config.helmetDurability}, new Integer[] {config.bootsDefense, config.leggingsDefense, config.chestplateDefense, config.helmetDefense}, config.enchantmentValue, equipSound, dyeable, config.enabled, () -> Ingredient.of(TagKey.create(net.minecraft.core.registries.Registries.ITEM, ResourceLocation.parse(repairItemTag))));
	}

	private static ArmorType create(ResourceLocation location,
								   ResourceLocation modelLocation,
								   ArmorConfig.ArmorTypeConfig config,
								   Holder<SoundEvent> equipSound,
								   boolean dyeable,
								   Supplier<Ingredient> ingredientSupplier) {
		return new ArmorType(location, modelLocation, config.toughness, config.knockbackResistance, new Integer[] {config.bootsDurability, config.leggingsDurability, config.chestplateDurability, config.helmetDurability}, new Integer[] {config.bootsDefense, config.leggingsDefense, config.chestplateDefense, config.helmetDefense}, config.enchantmentValue, equipSound, dyeable, config.enabled, ingredientSupplier);
	}

	private static ArmorType create(ResourceLocation location,
								   ResourceLocation modelLocation,
								   ArmorConfig.ArmorTypeConfig config,
								   Holder<SoundEvent> equipSound,
								   boolean dyeable) {
		return new ArmorType(location, modelLocation, config.toughness, config.knockbackResistance, new Integer[] {config.bootsDurability, config.leggingsDurability, config.chestplateDurability, config.helmetDurability}, new Integer[] {config.bootsDefense, config.leggingsDefense, config.chestplateDefense, config.helmetDefense}, config.enchantmentValue, equipSound, dyeable, config.enabled, () -> Ingredient.EMPTY);
	}

	public static void init() {
		// Fabric: Register armor materials and types here using Registry.register
		// TODO: Implement registration logic in Fabric style
	}
}
