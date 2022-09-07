package me.nojuslopro.unluckydifficulty.runnables;

import me.nojuslopro.unluckydifficulty.Unluckydifficulty;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class LevitationGiver extends BukkitRunnable{


    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Random random = new Random();
            Integer number = random.nextInt(10000);
                if (number == 1) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 50));
                }
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 4000, 50));
        }
    }
}
