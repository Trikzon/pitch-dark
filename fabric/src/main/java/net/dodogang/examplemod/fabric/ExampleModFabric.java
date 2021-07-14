package net.dodogang.examplemod.fabric;

import net.dodogang.examplemod.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.initialize();
    }
}
