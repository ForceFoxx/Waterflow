package net.forcefox.waterflow.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockFromToEvent;

public class LavaflowListener implements Listener {

    @EventHandler
    public void onBlockFromTo(BlockFromToEvent event) {
        if (event.getBlock().getType() == org.bukkit.Material.LAVA || event.getBlock().getType() == org.bukkit.Material.STATIONARY_LAVA) {
            event.setCancelled(true);
        }
    }
}
