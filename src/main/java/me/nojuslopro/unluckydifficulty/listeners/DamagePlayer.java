package me.nojuslopro.unluckydifficulty.listeners;

import me.nojuslopro.unluckydifficulty.util.GiveRandomItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamagePlayer implements Listener {
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            GiveRandomItem.giveRandomItem();
        }
    }
}
