package me.nojuslopro.unluckydifficulty.listeners;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class PlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Random random = new Random();
        Integer number = random.nextInt(2000);
        if (number == 1) {
            e.setCancelled(true);
            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ITEM_TOTEM_USE, 1, 1);
            e.getPlayer().getWorld().spawnParticle(Particle.TOTEM,e.getPlayer().getLocation(), 500);
            e.getPlayer().getWorld().spawnParticle(Particle.TOTEM,e.getPlayer().getLocation(), 500);
            e.getPlayer().getWorld().spawnParticle(Particle.TOTEM,e.getPlayer().getLocation(), 500);
            e.getPlayer().getWorld().spawnParticle(Particle.TOTEM,e.getPlayer().getLocation(), 500);
            e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 0));
            e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 5000, 1));
            e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 5000, 0));
        }
    }
}
