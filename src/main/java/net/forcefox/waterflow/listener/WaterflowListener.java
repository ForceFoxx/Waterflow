package net.forcefox.waterflow.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockFromToEvent;

public class WaterflowListener implements Listener {

    @EventHandler
    public void onBlockFromTo(BlockFromToEvent event) {
        if (event.getBlock().getType() == org.bukkit.Material.WATER || event.getBlock().getType() == org.bukkit.Material.STATIONARY_WATER) {
            event.setCancelled(true);
        }
    }
}

