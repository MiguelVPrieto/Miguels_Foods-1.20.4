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

    public static final RegistryObject<Item> BEAN = ITEMS.register("bean",
            () -> new Item(new Item.Properties().food(ModFoods.BEAN)));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE)));

    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().food(ModFoods.CABBAGE)));

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties().food(ModFoods.BEER)));

    public static final RegistryObject<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().food(ModFoods.TACO)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));

    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().food(ModFoods.BUTTER)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}