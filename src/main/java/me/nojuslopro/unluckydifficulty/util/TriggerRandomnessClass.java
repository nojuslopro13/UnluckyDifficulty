package me.nojuslopro.unluckydifficulty.util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Random;

public class TriggerRandomnessClass {
    public static void trigger() {
        Location ancientcitylocation1 = new Location(Bukkit.getWorld("world"), 33, -46, -304);
        Location ancientcitylocation2 = new Location(Bukkit.getWorld("world"), 3635, -49, 1964);
        Location ancientcitylocation3 = new Location(Bukkit.getWorld("world"), 8959331, -43, -565043);
        Location ancientcitylocation4 = new Location(Bukkit.getWorld("world"), 2990, -39, -4022);
        Location ancientcitylocation5 = new Location(Bukkit.getWorld("world"), -1054, -44, 89639);
        Location mansionlocation1 = new Location(Bukkit.getWorld("world"), 6754, 115, -4910);
        Location end1 = new Location(Bukkit.getWorld("world_the_end"), -33, 91, -22);
        Location end2 = new Location(Bukkit.getWorld("world_the_end"), 0, 69, 0);
        Location cavelocation = new Location(Bukkit.getWorld("world"), 689, 77, -705);
        Location netherlocation1 = new Location(Bukkit.getWorld("world_nether"), -698, 35, -122);
        Location netherlocation2 = new Location(Bukkit.getWorld("world_nether"), 56, 37, 2519);
        Location netherlocation3 = new Location(Bukkit.getWorld("world_nether"), -192, 74, 1733);
        Location cavelocation2 = new Location(Bukkit.getWorld("world"), -2562, 11, 155);
        for (Player player : Bukkit.getOnlinePlayers()) {
            Random anotherrandom = new Random();
            int anothernumber = anotherrandom.nextInt(15);
            if (anothernumber == 0) {
                player.teleport(ancientcitylocation1);
            }
            if (anothernumber == 1) {
                player.teleport(ancientcitylocation2);
            }
            if (anothernumber == 2) {
                player.teleport(ancientcitylocation3);
            }
            if (anothernumber == 3) {
                player.teleport(ancientcitylocation4);
            }
            if (anothernumber == 4) {
                player.teleport(mansionlocation1);
            }
            if (anothernumber == 5) {
                player.teleport(cavelocation);
            }
            if (anothernumber == 6) {
                player.teleport(cavelocation2);
            }
            if (anothernumber == 7) {
                player.teleport(netherlocation1);
            }
            if (anothernumber == 8) {
                player.teleport(netherlocation2);
            }
            if (anothernumber == 9) {
                player.teleport(netherlocation3);
            }
            if (anothernumber == 10) {
                player.teleport(end1);
            }
            if (anothernumber == 11) {
                player.teleport(end2);
            }
            if (anothernumber == 12) {
                player.teleport(ancientcitylocation5);
            }
            if (anothernumber == 13) {
                for (Player player1 : Bukkit.getOnlinePlayers()) {
                    World world = player1.getWorld();
                    Location location = player1.getLocation();
                    world.spawnEntity(location, EntityType.LIGHTNING);
                }
                if (anothernumber == 14) {
                    for (Player player1 : Bukkit.getOnlinePlayers()) {
                        World world = player1.getWorld();
                        Location location = player1.getLocation();
                        world.spawnEntity(location, EntityType.ZOMBIE);
                    }
                    for (Player player1 : Bukkit.getOnlinePlayers()) {
                        World world = player1.getWorld();
                        Location location = player1.getLocation();
                        world.spawnEntity(location, EntityType.ZOMBIE);
                    }
                    for (Player player1 : Bukkit.getOnlinePlayers()) {
                        World world = player1.getWorld();
                        Location location = player1.getLocation();
                        world.spawnEntity(location, EntityType.ZOMBIE);
                    }
                    for (Player player1 : Bukkit.getOnlinePlayers()) {
                        World world = player1.getWorld();
                        Location location = player1.getLocation();
                        world.spawnEntity(location, EntityType.ZOMBIE);
                    }
                    if (anothernumber == 15) {
                        for (Player player1 : Bukkit.getOnlinePlayers()) {
                            World world = player1.getWorld();
                            Location location = player1.getLocation();
                            world.spawnEntity(location, EntityType.WITHER_SKELETON);
                        }

                    }
                }
            }
        }
    }
}