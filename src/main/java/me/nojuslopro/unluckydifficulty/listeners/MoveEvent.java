package me.nojuslopro.unluckydifficulty.listeners;

import me.nojuslopro.unluckydifficulty.Unluckydifficulty;
import me.nojuslopro.unluckydifficulty.util.TriggerRandomnessClass;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Random;

public class MoveEvent implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        int maxNumber = Unluckydifficulty.inst().getConfig().getInt("Chancerandomevent");
        Random random = new Random();
        int number = random.nextInt(maxNumber);
        if (number == 1) {
            TriggerRandomnessClass.trigger();
        }
    }
}