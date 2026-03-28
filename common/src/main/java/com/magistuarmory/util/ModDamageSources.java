package com.magistuarmory.util;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import com.magistuarmory.util.ModDamageTypes;

public class ModDamageSources
{
	private static Registry<DamageType> DAMAGE_TYPES;
	
	private static DamageSource ADDITIONAL;
	
	public static void setup(RegistryAccess registryAccess)
	{
		DAMAGE_TYPES = registryAccess.lookup(Registries.DAMAGE_TYPE).orElseThrow();
		DamageType additionalType = DAMAGE_TYPES.getOrThrow(ModDamageTypes.ADDITIONAL);
		Holder<DamageType> additionalHolder = Holder.direct(additionalType);
		ADDITIONAL = new DamageSource(additionalHolder);
	}
	
	public static DamageSource additional()
	{
		return ADDITIONAL;
	}

	public static DamageSource additional(Entity attacker)
	{
		Holder<DamageType> holder = Holder.direct(DAMAGE_TYPES.getOrThrow(ModDamageTypes.ENTITY_ADDITIONAL));
		return attacker == null ? additional() : new DamageSource(holder, attacker);
	}

	public static DamageSource silverAttack(Entity attacker)
	{
		Holder<DamageType> holder = Holder.direct(DAMAGE_TYPES.getOrThrow(ModDamageTypes.SILVER));
		return new DamageSource(holder, attacker);
	}

	public static DamageSource armorPiercing(Entity attacker)
	{
		Holder<DamageType> holder = Holder.direct(DAMAGE_TYPES.getOrThrow(ModDamageTypes.ARMOR_PIERCING));
		return new DamageSource(holder, attacker);
	}

	public static boolean isAdditional(DamageSource source) throws NullPointerException
	{
		if (source == null)
			throw new NullPointerException("Got a null damage source");
		return	source.is(DamageTypes.GENERIC) ||
				source.is(DamageTypes.MAGIC) ||
				source.is(ModDamageTypes.ADDITIONAL) || 
				source.is(ModDamageTypes.ENTITY_ADDITIONAL) || 
				source.is(ModDamageTypes.SILVER) || 
				source.is(ModDamageTypes.ARMOR_PIERCING);
	}
}
