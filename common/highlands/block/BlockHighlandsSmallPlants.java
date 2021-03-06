package highlands.block;

import java.util.Random;

import highlands.worldgen.WorldGenSmallPlants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import static net.minecraftforge.common.EnumPlantType.*;

public class BlockHighlandsSmallPlants extends BlockFlower implements IPlantable
{
	private int plantType;
	
	private String[] plantNames = 
		{
			"BlueFlower",
			"GreenLeaf",
			"WhiteFlower",
			"Cattail",
			"Lavender",
			"RaspberryBush",
			"BlueberryBush",
			"Thornbush",
			"Cotton",
		};
	
    public BlockHighlandsSmallPlants(int par1, int type)
    {
        super(par1, Material.plants);
        float var3 = 0.4F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        plantType = type;
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
    	if(player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItemDamage()==15 && player.inventory.getCurrentItem().itemID==Item.dyePowder.itemID)
    	{
	    	Random rand = new Random();
	    	//adds random plants of same type to surrounding blocks
	    	new WorldGenSmallPlants(this.blockID, 10).generate(par1World, new Random(), par2, par3, par4);
	    	
	    	//reduce bonemeal stack size by one
	    	if(player.capabilities.isCreativeMode != true)player.inventory.getCurrentItem().stackSize--;
		    return true;
    	}
    	return false;
    }
    
    
    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	if(plantType == 7) par5Entity.attackEntityFrom(DamageSource.cactus, 1);
    }

    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return Plains;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("Highlands:plant"+plantNames[plantType]);
    }
    
    
}
