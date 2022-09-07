package me.nojuslopro.unluckydifficulty.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Warden;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class mobSpawn implements Listener {
    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent e) {
        if (e.getEntityType() == EntityType.WARDEN) {
            Warden warden = (Warden) e.getEntity();
            Random random = new Random();

            int number = random.nextInt(2);
            switch (number) {
                case 0:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        warden.setAnger(player, 150);

                    }
                    break;
                case 1:
                    warden.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 0));
                    break;
            }

        }
    }
}


