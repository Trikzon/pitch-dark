package net.dodogang.examplemod.forge;

import net.dodogang.examplemod.ExampleMod;
import net.dodogang.plume.ash.forge.ModEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        ModEventBus.registerModEventBus(ExampleMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        ExampleMod.initialize();
    }
}
