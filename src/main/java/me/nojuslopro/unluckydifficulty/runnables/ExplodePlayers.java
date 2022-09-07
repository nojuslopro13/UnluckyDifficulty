package me.nojuslopro.unluckydifficulty.runnables;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class ExplodePlayers extends BukkitRunnable {
    @Override
    public void run() {
        Random random = new Random();
        Integer number = random.nextInt(15000);
        if (number == 1) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.getWorld().createExplosion(player.getLocation(),10);
            }
        }
    }
}
