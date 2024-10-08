package net.blavblav.miguelsfoods.item;

import net.blavblav.miguelsfoods.MiguelsFoods;
import net.blavblav.miguelsfoods.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoods.ONION)));

    public static final RegistryObject<Item> GRAPE = ITEMS.register("grape",
            () -> new Item(new Item.Properties().food(ModFoods.GRAPE)));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE)));

    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().food(ModFoods.CABBAGE)));

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties().food(ModFoods.BEER)));

    public static final RegistryObject<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().food(ModFoods.TACO)));

    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().food(ModFoods.BUTTER)));

    public static final RegistryObject<Item> TOMATO_SAUCE = ITEMS.register("tomato_sauce",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO_SAUCE)));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().food(ModFoods.PIZZA)));

    public static final RegistryObject<Item> COXINHA = ITEMS.register("coxinha",
            () -> new Item(new Item.Properties().food(ModFoods.COXINHA)));

    public static final RegistryObject<Item> BRIGADEIRO = ITEMS.register("brigadeiro",
            () -> new Item(new Item.Properties().food(ModFoods.BRIGADEIRO)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));

    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE)));

    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BEAN = ITEMS.register("bean",
            () -> new Item(new Item.Properties().food(ModFoods.BEAN)));



    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new ItemNameBlockItem(ModBlocks.RICE_CROP.get(), new Item.Properties().food(ModFoods.RICE)));


    //TOMATO
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}