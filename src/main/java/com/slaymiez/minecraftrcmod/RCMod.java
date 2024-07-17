package com.slaymiez.minecraftrcmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "minecraftrcmod", useMetadata=true)
public class RCMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftWebSocketServer server = new MinecraftWebSocketServer(8080);
        server.start();
    }
}
