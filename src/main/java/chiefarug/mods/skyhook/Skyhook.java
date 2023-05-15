package chiefarug.mods.skyhook;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("skyhook")
public class Skyhook {
    @SuppressWarnings("unused")
    public static final Logger LGGR = LogUtils.getLogger();
    public static final String MODID = "skyhook";

    public Skyhook() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        SkyhookRegistry.init(bus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SkyhookConfig.spec, "skyhook-server.toml");
    }
}
