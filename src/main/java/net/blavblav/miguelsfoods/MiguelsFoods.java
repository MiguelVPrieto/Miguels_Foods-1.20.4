package net.blavblav.miguelsfoods;

import com.mojang.logging.LogUtils;
import net.blavblav.miguelsfoods.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MiguelsFoods.MOD_ID)
public class MiguelsFoods
{
    public static final String MOD_ID = "miguelsfoodsforge1204";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MiguelsFoods()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.COCONUT);
            event.accept(ModItems.OPENED_COCONUT);
            event.accept(ModItems.COCONUT_WATER);
            event.accept(ModItems.RICE);
            event.accept(ModItems.ONION);
            event.accept(ModItems.GRAPE);
            event.accept(ModItems.BEAN);
            event.accept(ModItems.LETTUCE);
            event.accept(ModItems.CABBAGE);
            event.accept(ModItems.BEER);
            event.accept(ModItems.TACO);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.BUTTER);
            event.accept(ModItems.TOMATO_SAUCE);
            event.accept(ModItems.PIZZA);
            event.accept(ModItems.COXINHA);
            event.accept(ModItems.BRIGADEIRO);
            event.accept(ModItems.CHEESE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
