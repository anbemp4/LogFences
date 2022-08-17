package com.anbe.logfences;

import com.anbe.logfences.blocks.ModBlocks;
import com.anbe.logfences.items.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Logfences.MODID)
public class Logfences {
    public static final String MODID = "logfences";

    public Logfences() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
