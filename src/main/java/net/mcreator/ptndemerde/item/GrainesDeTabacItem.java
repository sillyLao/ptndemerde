
package net.mcreator.ptndemerde.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class GrainesDeTabacItem extends Item {
	public GrainesDeTabacItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TabacPlanteProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}