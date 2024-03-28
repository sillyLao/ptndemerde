package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TabacRecolteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockState _bs = PtndemerdeModBlocks.TABAC_3.get().defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PtndemerdeModItems.DELETED_MOD_ELEMENT.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
