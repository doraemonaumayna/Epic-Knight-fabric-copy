package com.magistuarmory.block;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.item.ModItemTier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocks
{
	private static Block register(String name, Block block)
	{
		return block;
	}
	
	public static void init()
	{
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "wood_pavise"), WOOD_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "gold_pavise"), GOLD_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "stone_pavise"), STONE_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "iron_pavise"), IRON_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "diamond_pavise"), DIAMOND_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "netherite_pavise"), NETHERITE_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "tin_pavise"), TIN_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "copper_pavise"), COPPER_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "silver_pavise"), SILVER_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "bronze_pavise"), BRONZE_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "steel_pavise"), STEEL_PAVISE);
		Registry.register(net.minecraft.core.registries.BuiltinRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "pavise_upper_collision"), PAVISE_UPPER_COLLISION);
	}

	public static final Block WOOD_PAVISE = register("wood_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "wood_pavise", ModBlockEntityTypes.WOOD_PAVISE));
	public static final Block GOLD_PAVISE = register("gold_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "gold_pavise", ModBlockEntityTypes.GOLD_PAVISE));
	public static final Block STONE_PAVISE = register("stone_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "stone_pavise", ModBlockEntityTypes.STONE_PAVISE));
	public static final Block IRON_PAVISE = register("iron_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "iron_pavise", ModBlockEntityTypes.IRON_PAVISE));
	public static final Block DIAMOND_PAVISE = register("diamond_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "diamond_pavise", ModBlockEntityTypes.DIAMOND_PAVISE));
	public static final Block NETHERITE_PAVISE = register("netherite_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "netherite_pavise", ModBlockEntityTypes.NETHERITE_PAVISE));
	public static final Block TIN_PAVISE = register("tin_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "tin_pavise", ModBlockEntityTypes.TIN_PAVISE));
	public static final Block COPPER_PAVISE = register("copper_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "copper_pavise", ModBlockEntityTypes.COPPER_PAVISE));
	public static final Block SILVER_PAVISE = register("silver_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "silver_pavise", ModBlockEntityTypes.SILVER_PAVISE));
	public static final Block BRONZE_PAVISE = register("bronze_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "bronze_pavise", ModBlockEntityTypes.BRONZE_PAVISE));
	public static final Block STEEL_PAVISE = register("steel_pavise", new PaviseBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().dynamicShape().noTerrainParticles().sound(SoundType.WOOD).ignitedByLava(), "steel_pavise", ModBlockEntityTypes.STEEL_PAVISE));
	
	public static final Block PAVISE_UPPER_COLLISION = register("pavise_upper_collision", new PaviseUpperCollisionBlock());
	
	public static PaviseBlock getPaviseByMaterialName(ModItemTier material)
	{
		switch (material.getMaterialName())
		{
			case "wood" ->
			{
				return (PaviseBlock) WOOD_PAVISE;
			}
			case "gold" ->
			{
				return (PaviseBlock) GOLD_PAVISE;
			}
			case "stone" ->
			{
				return (PaviseBlock) STONE_PAVISE;
			}
			case "iron" ->
			{
				return (PaviseBlock) IRON_PAVISE;
			}
			case "diamond" ->
			{
				return (PaviseBlock) DIAMOND_PAVISE;
			}
			case "netherite" ->
			{
				return (PaviseBlock) NETHERITE_PAVISE;
			}
			case "tin" ->
			{
				return (PaviseBlock) TIN_PAVISE;
			}
			case "copper" ->
			{
				return (PaviseBlock) COPPER_PAVISE;
			}
			case "silver" ->
			{
				return (PaviseBlock) SILVER_PAVISE;
			}
			case "bronze" ->
			{
				return (PaviseBlock) BRONZE_PAVISE;
			}
			case "steel" ->
			{
				return (PaviseBlock) STEEL_PAVISE;
			}
		}
		throw new IllegalArgumentException("unknown material " + material.getMaterialName());
	}
}
