package me.nojuslopro.unluckydifficulty;

import me.nojuslopro.unluckydifficulty.commands.RandomItemClass;
import me.nojuslopro.unluckydifficulty.commands.TriggerEvent;
import me.nojuslopro.unluckydifficulty.listeners.*;
import me.nojuslopro.unluckydifficulty.runnables.ExplodePlayers;
import me.nojuslopro.unluckydifficulty.runnables.LevitationGiver;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Unluckydifficulty extends JavaPlugin {
    private static Unluckydifficulty instance;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getWorld("world").setDifficulty(Difficulty.HARD);
        Bukkit.getPluginManager().registerEvents(new MoveEvent(), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreakEVent(), this);
        Bukkit.getPluginManager().registerEvents(new mobSpawn(), this);
        Bukkit.getPluginManager().registerEvents(new DamagePlayer(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerDeath(), this);
        BukkitTask task = new LevitationGiver().runTaskTimer(this, 1, 1);
        BukkitTask task2 = new ExplodePlayers().runTaskTimer(this, 1, 1);
  //      BukkitTask task3 = new PlaceALootChest().runTaskTimer(this, 1, 1);
        getCommand("randomevent").setExecutor(new TriggerEvent());
        getCommand("randomitem").setExecutor(new RandomItemClass());
        instance = this;
    }

    public static Unluckydifficulty inst() {return instance;}

}
