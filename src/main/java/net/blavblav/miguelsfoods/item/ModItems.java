package net.blavblav.miguelsfoods.item;

import net.blavblav.miguelsfoods.MiguelsFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MiguelsFoods.MOD_ID);

    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().food(ModFoods.COCONUT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}