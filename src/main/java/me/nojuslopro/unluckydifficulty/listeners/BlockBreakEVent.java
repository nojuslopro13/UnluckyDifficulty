package me.nojuslopro.unluckydifficulty.listeners;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;

public class BlockBreakEVent implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = (Player) event.getPlayer();
        World world = (World) player.getWorld();
        Location location = player.getLocation();

        Random random = new Random();
        int number = random.nextInt(50);
        if (number == 1) {
            world.spawnEntity(location, EntityType.ZOMBIE);
            world.spawnEntity(location, EntityType.ZOMBIE);
            world.spawnEntity(location, EntityType.ZOMBIE);
            world.spawnEntity(location, EntityType.ZOMBIE);
            world.spawnEntity(location, EntityType.ZOMBIE);
            world.spawnEntity(location, EntityType.ZOMBIE);

        }
        if (number == 2) {
            world.spawnEntity(location, EntityType.SILVERFISH);
            world.spawnEntity(location, EntityType.SILVERFISH);
            world.spawnEntity(location, EntityType.SILVERFISH);
            world.spawnEntity(location, EntityType.SILVERFISH);
            world.spawnEntity(location, EntityType.SILVERFISH);
        }
    }
}
