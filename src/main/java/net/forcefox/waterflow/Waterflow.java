package net.forcefox.waterflow;

import net.forcefox.waterflow.listener.LavaflowListener;
import net.forcefox.waterflow.listener.WaterflowListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Waterflow extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WaterflowListener(), this);
        getServer().getPluginManager().registerEvents(new LavaflowListener(), this);
        getLogger().info("[Waterflow] Plugin enabeld");
    }

    @Override
    public void onDisable() {
        getLogger().info("[Waterflow] Plugin disabeld");
    }
}
