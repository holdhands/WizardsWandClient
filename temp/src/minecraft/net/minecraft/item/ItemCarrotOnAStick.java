package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCarrotOnAStick extends Item {
   public ItemCarrotOnAStick() {
      this.func_77637_a(CreativeTabs.field_78029_e);
      this.func_77625_d(1);
      this.func_77656_e(25);
   }

   public boolean func_77662_d() {
      return true;
   }

   public boolean func_77629_n_() {
      return true;
   }

   public ActionResult<ItemStack> func_77659_a(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_, EnumHand p_77659_4_) {
      if(p_77659_3_.func_184218_aH() && p_77659_3_.func_184187_bx() instanceof EntityPig) {
         EntityPig entitypig = (EntityPig)p_77659_3_.func_184187_bx();
         if(p_77659_1_.func_77958_k() - p_77659_1_.func_77960_j() >= 7 && entitypig.func_184762_da()) {
            p_77659_1_.func_77972_a(7, p_77659_3_);
            if(p_77659_1_.field_77994_a == 0) {
               ItemStack itemstack = new ItemStack(Items.field_151112_aM);
               itemstack.func_77982_d(p_77659_1_.func_77978_p());
               return new ActionResult(EnumActionResult.SUCCESS, itemstack);
            }

            return new ActionResult(EnumActionResult.SUCCESS, p_77659_1_);
         }
      }

      p_77659_3_.func_71029_a(StatList.func_188057_b(this));
      return new ActionResult(EnumActionResult.PASS, p_77659_1_);
   }
}
