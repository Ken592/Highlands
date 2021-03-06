package highlands;

import java.util.ArrayList;
import java.util.List;

/*
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
*/

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import highlands.api.HighlandsBiomes;
import highlands.biome.BiomeGenBaseHighlands;

import static net.minecraftforge.common.BiomeDictionary.Type;

public class HighlandsCompatibilityManager{

	public static final BiomeGenBaseHighlands[] forestb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.autumnForest,
		(BiomeGenBaseHighlands)HighlandsBiomes.woodlands,
		(BiomeGenBaseHighlands)HighlandsBiomes.woodsMountains,
		(BiomeGenBaseHighlands)HighlandsBiomes.birchHills,
		(BiomeGenBaseHighlands)HighlandsBiomes.lowlands,
		(BiomeGenBaseHighlands)HighlandsBiomes.forestIsland,
		(BiomeGenBaseHighlands)HighlandsBiomes.redwoodForest,
		//(BiomeGenBaseHighlands)HighlandsBiomes.valley
	};
	
	public static final BiomeGenBaseHighlands[] taigab = {
		(BiomeGenBaseHighlands)HighlandsBiomes.tallPineForest,
		//(BiomeGenBaseHighlands)HighlandsBiomes.snowIsland
	};
	
	public static final BiomeGenBaseHighlands[] snowb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.alps,
		(BiomeGenBaseHighlands)HighlandsBiomes.tundra,
		(BiomeGenBaseHighlands)HighlandsBiomes.snowMountains,
	};
	
	public static final BiomeGenBaseHighlands[] jungleb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.tropics,
		(BiomeGenBaseHighlands)HighlandsBiomes.flyingMountains,
		(BiomeGenBaseHighlands)HighlandsBiomes.tropicalIslands,
		(BiomeGenBaseHighlands)HighlandsBiomes.rainforest,
		//(BiomeGenBaseHighlands)HighlandsBiomes.jungleIsland
	};
	
	public static final BiomeGenBaseHighlands[] hillb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.highlandsb,
		(BiomeGenBaseHighlands)HighlandsBiomes.pinelands,
		(BiomeGenBaseHighlands)HighlandsBiomes.cliffs,
		(BiomeGenBaseHighlands)HighlandsBiomes.rockMountains,
		(BiomeGenBaseHighlands)HighlandsBiomes.mesa,
		(BiomeGenBaseHighlands)HighlandsBiomes.baldHill,
		(BiomeGenBaseHighlands)HighlandsBiomes.badlands,
		(BiomeGenBaseHighlands)HighlandsBiomes.desertMountains,
	};
	
	public static final BiomeGenBaseHighlands[] plainsb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.meadow,
		(BiomeGenBaseHighlands)HighlandsBiomes.savannah
	};
	
	public static final BiomeGenBaseHighlands[] desertb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.dunes,
		(BiomeGenBaseHighlands)HighlandsBiomes.outback,
		(BiomeGenBaseHighlands)HighlandsBiomes.sahel,
	};
	
	public static final BiomeGenBaseHighlands[] oceanb = {
		(BiomeGenBaseHighlands)HighlandsBiomes.lake,
		(BiomeGenBaseHighlands)HighlandsBiomes.ocean2,
		(BiomeGenBaseHighlands)HighlandsBiomes.volcanoIsland,
		(BiomeGenBaseHighlands)HighlandsBiomes.desertIsland,
		(BiomeGenBaseHighlands)HighlandsBiomes.estuary,
	};
	
	/** clears the spawn lists from all highlands biomes,
	 * then sets it equal to the spawn lists from a similar default biome.
	 * only called if "Mob Mod Compatibility" is set to true.
	 */
	public static void mobload_biomes(){
		for(BiomeGenBaseHighlands a : forestb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.forest.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.forest.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : taigab){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.taiga.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.taiga.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : snowb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.icePlains.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.icePlains.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : jungleb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.jungle.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.jungle.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : hillb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.extremeHills.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.extremeHills.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : plainsb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.plains.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.plains.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : desertb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.desert.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.desert.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		for(BiomeGenBaseHighlands a : oceanb){
			if(a != null){
				a.setSpawnLists(
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.monster),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.creature),
						BiomeGenBase.ocean.getSpawnableList(EnumCreatureType.waterCreature)
						);
			}
		}
		
	}
	
	/*
	public static void registerBiomesThaumcraft(){
		for(BiomeGenBaseHighlands a : forestb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 450, EnumTag.WOOD, true, true);
			}
		}
		for(BiomeGenBaseHighlands a : taigab){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 300, EnumTag.COLD, true, true);
			}
		}
		for(BiomeGenBaseHighlands a : snowb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 250, EnumTag.COLD, false, false);
			}
		}
		for(BiomeGenBaseHighlands a : jungleb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 550, EnumTag.LIFE, true, false);
			}
		}
		for(BiomeGenBaseHighlands a : hillb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 350, EnumTag.EARTH, false, true);
			}
		}
		for(BiomeGenBaseHighlands a : plainsb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 400, EnumTag.WIND, false, false);
			}
		}
		for(BiomeGenBaseHighlands a : desertb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 200, EnumTag.FIRE, false, false);
			}
		}
		for(BiomeGenBaseHighlands a : oceanb){
			if(a != null){
				ThaumcraftApi.registerBiomeInfo(a.biomeID, 300, EnumTag.WATER, false, false);
			}
		}
		
		ThaumcraftApi.registerBiomeInfo(HighlandsBiomes.valley.biomeID, 450, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(HighlandsBiomes.snowIsland.biomeID, 300, EnumTag.COLD, false, false);
		ThaumcraftApi.registerBiomeInfo(HighlandsBiomes.jungleIsland.biomeID, 550, EnumTag.WOOD, false, false);
		
	}
	*/
	
	public static void registerBiomesForgeBiomeDict(){
		BiomeDictionary.registerBiomeType(HighlandsBiomes.woodsMountains, Type.MOUNTAIN, Type.FOREST);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.highlandsb, Type.HILLS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.tundra, Type.FROZEN);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.cliffs, Type.MOUNTAIN);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.pinelands, Type.HILLS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.autumnForest, Type.FOREST);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.alps, Type.FROZEN, Type.MOUNTAIN);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.tallPineForest, Type.FROZEN, Type.FOREST);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.meadow, Type.PLAINS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.savannah, Type.PLAINS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.tropics, Type.JUNGLE);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.outback, Type.DESERT, Type.PLAINS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.woodlands, Type.FOREST);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.bog, Type.SWAMP);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.redwoodForest, Type.FOREST, Type.HILLS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.dunes, Type.DESERT, Type.HILLS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.lowlands, Type.FOREST, Type.PLAINS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.sahel, Type.DESERT, Type.PLAINS);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.birchHills, Type.FOREST, Type.HILLS);
		BiomeDictionary.registerBiomeType( HighlandsBiomes.tropicalIslands, Type.JUNGLE, Type.WATER);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.rainforest, Type.JUNGLE, Type.FOREST);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.estuary, Type.BEACH, Type.SWAMP);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.badlands, Type.WASTELAND, Type.HILLS);
		BiomeDictionary.registerBiomeType( HighlandsBiomes.flyingMountains, Type.MOUNTAIN, Type.MAGICAL);
		BiomeDictionary.registerBiomeType( HighlandsBiomes.snowMountains, Type.MOUNTAIN, Type.FROZEN);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.rockMountains, Type.MOUNTAIN);
		BiomeDictionary.registerBiomeType(HighlandsBiomes.desertMountains, Type.MOUNTAIN, Type.DESERT);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.steppe, Type.PLAINS, Type.HILLS);
	    BiomeDictionary.registerBiomeType( HighlandsBiomes.glacier, Type.FROZEN);
	    BiomeDictionary.registerBiomeType( HighlandsBiomes.ocean2, Type.WATER);
	    
	    //Sub Biomes
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.forestIsland, Type.FOREST);
	    BiomeDictionary.registerBiomeType( HighlandsBiomes.jungleIsland, Type.JUNGLE);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.desertIsland, Type.BEACH);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.volcanoIsland, Type.WASTELAND, Type.MOUNTAIN);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.snowIsland, Type.FOREST, Type.FROZEN);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.windyIsland, Type.PLAINS);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.rockIsland, Type.WASTELAND);
	    BiomeDictionary.registerBiomeType( HighlandsBiomes.valley, Type.FOREST);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.lake, Type.WATER);
	    BiomeDictionary.registerBiomeType( HighlandsBiomes.mesa, Type.MOUNTAIN);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.baldHill, Type.MOUNTAIN);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.oasis, Type.JUNGLE);
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.canyon, Type.DESERT);
	    
	    //Border Biomes
	    BiomeDictionary.registerBiomeType(HighlandsBiomes.shrubland, Type.PLAINS, Type.HILLS);
		
	}
	
	
	public static void registerBiomesForestry(){
		/*
		for(BiomeGenBaseHighlands a : forestb){
			if(a != null){
				EnumTemperature.normalBiomeIds.add(a.biomeID);
				EnumHumidity.normalBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : taigab){
			if(a != null){
				EnumTemperature.coldBiomeIds.add(a.biomeID);
				EnumHumidity.normalBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : snowb){
			if(a != null){
				EnumTemperature.icyBiomeIds.add(a.biomeID);
				EnumHumidity.normalBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : jungleb){
			if(a != null){
				EnumTemperature.warmBiomeIds.add(a.biomeID);
				EnumHumidity.dampBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : hillb){
			if(a != null){
				EnumTemperature.normalBiomeIds.add(a.biomeID);
				EnumHumidity.normalBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : plainsb){
			if(a != null){
				EnumTemperature.normalBiomeIds.add(a.biomeID);
				EnumHumidity.normalBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : desertb){
			if(a != null){
				EnumTemperature.hotBiomeIds.add(a.biomeID);
				EnumHumidity.aridBiomeIds.add(a.biomeID);
			}
		}
		for(BiomeGenBaseHighlands a : oceanb){
			if(a != null){
				EnumTemperature.normalBiomeIds.add(a.biomeID);
				EnumHumidity.normalBiomeIds.add(a.biomeID);
			}
		}
		
		EnumTemperature.normalBiomeIds.add(HighlandsBiomes.valley.biomeID);
		EnumHumidity.normalBiomeIds.add(HighlandsBiomes.valley.biomeID);
		EnumTemperature.coldBiomeIds.add(HighlandsBiomes.snowIsland.biomeID);
		EnumHumidity.normalBiomeIds.add(HighlandsBiomes.snowIsland.biomeID);
		EnumTemperature.warmBiomeIds.add(HighlandsBiomes.jungleIsland.biomeID);
		EnumHumidity.dampBiomeIds.add(HighlandsBiomes.jungleIsland.biomeID);
		*/
	}
	
	
}
