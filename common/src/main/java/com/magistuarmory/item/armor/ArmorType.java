package com.magistuarmory.item.armor;

import com.magistuarmory.client.render.model.ModModels;
// Removed DeferredRegister for Fabric
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.Util;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class ArmorType {

	// Create a vanilla ArmorMaterial record instance from this ArmorType's fields
	public ArmorMaterial toVanillaArmorMaterial() {
		// TODO: Provide correct TagKey<Item> for repairIngredient and ResourceKey<EquipmentAsset> for assetId
		TagKey<net.minecraft.world.item.Item> repairTag = null; // Placeholder, should be set properly
		ResourceKey<?> assetId = null; // Placeholder, should be set properly
		return new ArmorMaterial(
			java.util.Arrays.stream(new int[] {
				this.durability.get(net.minecraft.world.item.equipment.ArmorType.BOOTS),
				this.durability.get(net.minecraft.world.item.equipment.ArmorType.LEGGINGS),
				this.durability.get(net.minecraft.world.item.equipment.ArmorType.CHESTPLATE),
				this.durability.get(net.minecraft.world.item.equipment.ArmorType.HELMET)
			}).max().orElse(0),
			this.defense,
			this.enchantmentValue,
			this.equipSound,
			this.toughness,
			this.knockbackResistance,
			repairTag,
			(ResourceKey<net.minecraft.world.item.equipment.EquipmentAsset>) assetId
		);
	}
	private final float toughness;
	private final float knockbackResistance;
	private final EnumMap<net.minecraft.world.item.equipment.ArmorType, Integer> durability;
	private final EnumMap<net.minecraft.world.item.equipment.ArmorType, Integer> defense;
	private final int enchantmentValue;
	private final Holder<SoundEvent> equipSound;
	private final Supplier<Ingredient> repairIngredient;
	private final boolean dyeable;
	private final ResourceLocation location;
	private final ResourceLocation modellocation;
	private final boolean enabled;

	public ArmorType(ResourceLocation location, ResourceLocation modellocation, float toughness, float knockbackResistance, Integer[] durability, Integer[] defenseForSlot, int enchantmentValue, Holder<SoundEvent> equipSound, boolean dyeable, boolean enabled, Supplier<Ingredient> repairIngredient) {
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.enchantmentValue = enchantmentValue;
		this.equipSound = equipSound;
		this.repairIngredient = repairIngredient;
		this.dyeable = dyeable;
		this.location = location;
		this.modellocation = modellocation;
		this.durability = Util.make(new EnumMap<>(net.minecraft.world.item.equipment.ArmorType.class), (enumMap) -> {
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.BOOTS, durability[0]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.LEGGINGS, durability[1]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.CHESTPLATE, durability[2]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.BODY, durability[2]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.HELMET, durability[3]);
		});
		this.defense = Util.make(new EnumMap<>(net.minecraft.world.item.equipment.ArmorType.class), (enumMap) -> {
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.BOOTS, defenseForSlot[0]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.LEGGINGS, defenseForSlot[1]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.CHESTPLATE, defenseForSlot[2]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.BODY, defenseForSlot[2]);
			enumMap.put(net.minecraft.world.item.equipment.ArmorType.HELMET, defenseForSlot[3]);
		});
		this.enabled = enabled;
	}

	   // Removed Forge/Architectury constructor

	   // Removed Forge/Architectury constructor

	   // Removed Forge/Architectury constructor

	public String getName() {
		return this.location.toString();
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

	public int getDurabilityForType(net.minecraft.world.item.equipment.@NotNull ArmorType type) {
		return this.durability.get(type);
	}

	public int getDefenseForType(net.minecraft.world.item.equipment.@NotNull ArmorType type) {
		return this.defense.get(type);
	}

	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	public Holder<SoundEvent> getEquipSound() {
		return this.equipSound;
	}

	public Supplier<Ingredient> getRepairIngredient() {
		return this.repairIngredient;
	}
	
	public boolean isDisabled()
	{
		return !this.enabled;
	}
	
	@Environment(EnvType.CLIENT)
	public Optional<ModelLayerLocation> getModelLocation()
	{
		if (Objects.equals(this.modellocation.getPath(), "default"))
			return Optional.empty();
		return Optional.of(ModModels.createArmorLocation(this.modellocation));
	}

	public boolean isDyeable() {
		return this.dyeable;
	}

	public ResourceLocation getLocation()
	{
		return this.location;
	}
}
