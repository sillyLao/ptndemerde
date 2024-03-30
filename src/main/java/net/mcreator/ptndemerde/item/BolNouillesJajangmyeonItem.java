
package net.mcreator.ptndemerde.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class BolNouillesJajangmyeonItem extends Item {
	public BolNouillesJajangmyeonItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.7f).build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.BOWL);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}