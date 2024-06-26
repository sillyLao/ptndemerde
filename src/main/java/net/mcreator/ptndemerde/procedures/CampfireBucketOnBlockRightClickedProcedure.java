package net.mcreator.ptndemerde.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ptndemerde.init.PtndemerdeModItems;
import net.mcreator.ptndemerde.PtndemerdeMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class CampfireBucketOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean t10 = false;
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PtndemerdeModItems.NOUILLES_SECHES.get()) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(PtndemerdeModItems.NOUILLES_SECHES.get());
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PtndemerdeModItems.NOUILLES_SECHES.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + "" + ("ptndemerde:nouilles_seches"
									+ "\",Count:1},item_display:\"none\",transformation:[0.3000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,-0.5000f,1.407f,0.0000f,0.3000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[type=minecraft:block_display,distance=..0.1]");
				PtndemerdeMod.queueServerWork(60, () -> {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = new ItemStack(PtndemerdeModItems.NOUILLES.get());
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item_display,distance=..0.1]");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + "" + ("ptndemerde:nouilles"
										+ "\",Count:1},item_display:\"none\",transformation:[0.3000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,-0.5000f,1.407f,0.0000f,0.3000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}")));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:block_display,distance=..0.1]");
				});
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
						_setstack.setCount(1);
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.ENDER_PEARL);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + "" + ("minecraft:ender_pearl"
									+ "\",Count:1},item_display:\"none\",transformation:[0.3000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,-0.5000f,1.407f,0.0000f,0.3000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[type=minecraft:block_display,distance=..0.1]");
				PtndemerdeMod.queueServerWork(600, () -> {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = new ItemStack(Items.GUNPOWDER);
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item_display,distance=..0.1]");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon block_display ~-0.5 ~-0.5 ~-0.5 {Passengers:[{id:\"minecraft:item_display\",item:{id:\"" + "" + ("minecraft:ender_eye"
										+ "\",Count:1},item_display:\"none\",transformation:[0.3000f,0.0000f,0.0000f,1.0000f,0.0000f,0.0000f,-0.5000f,1.407f,0.0000f,0.3000f,0.0000f,1.0000f,0.0000f,0.0000f,0.0000f,1.0000f]}]}")));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:block_display,distance=..0.1]");
				});
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOWL) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == PtndemerdeModItems.NOUILLES.get()) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = new ItemStack(Blocks.AIR);
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.BOWL);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PtndemerdeModItems.BOL_NOUILLES.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item_display,distance=..0.1]");
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Items.GUNPOWDER) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = new ItemStack(Blocks.AIR);
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.BOWL);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PtndemerdeModItems.SOUPE_END.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + -0.5), (y + -0.5), (z + -0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"kill @e[type=minecraft:item_display,distance=..0.1]");
				}
			}
		}
	}
}
