package me.nojuslopro.unluckydifficulty.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageSharing implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.setHealth(player.getHealth() - event.getDamage());
            }
        }
    }
}
