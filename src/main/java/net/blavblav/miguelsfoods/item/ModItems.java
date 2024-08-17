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

    public static final RegistryObject<Item> OPENED_COCONUT = ITEMS.register("opened_coconut",
            () -> new Item(new Item.Properties().food(ModFoods.OPENED_COCONUT)));

    public static final RegistryObject<Item> COCONUT_WATER = ITEMS.register("coconut_water",
            () -> new Item(new Item.Properties().food(ModFoods.COCONUT_WATER)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().food(ModFoods.RICE)));

    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoods.ONION)));

    public static final RegistryObject<Item> GRAPE = ITEMS.register("grape",
            () -> new Item(new Item.Properties().food(ModFoods.GRAPE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}