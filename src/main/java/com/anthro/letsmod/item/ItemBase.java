package com.anthro.letsmod.item;

import com.anthro.letsmod.creativetab.CreativeTab;
import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author anthropomorphic
 */
public class ItemBase extends Item
{
  public ItemBase()
  {
    super();
    setCreativeTab(CreativeTab.LETS_MOD_TAB);
  }
  
  @Override
  public String getUnlocalizedName()
  {
    return String.format(
        "item.%s:%s",
        Reference.MOD_ID.toLowerCase(),
        getUnwrappedUnlocalizedName(super.getUnlocalizedName())
    );
  }
  
  @Override
  public String getUnlocalizedName(ItemStack itemStack)
  {
    return String.format(
        "item.%s:%s",
        Reference.MOD_ID.toLowerCase(),
        getUnwrappedUnlocalizedName(super.getUnlocalizedName())
    );
  }
  
  @Override
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister)
  {
    itemIcon = iconRegister.registerIcon(
        this.getUnlocalizedName().substring
            (this.getUnlocalizedName().indexOf(".") + 1)
    );
  }
  
  protected String getUnwrappedUnlocalizedName(String unlocalizedName)
  {
    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
  }
}
