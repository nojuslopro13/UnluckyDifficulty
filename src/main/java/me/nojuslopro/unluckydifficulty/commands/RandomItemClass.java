package me.nojuslopro.unluckydifficulty.commands;

import me.nojuslopro.unluckydifficulty.util.GiveRandomItem;
import me.nojuslopro.unluckydifficulty.util.TriggerRandomnessClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class RandomItemClass implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("events.items")) {
            try {
                GiveRandomItem.giveRandomItem();
            }catch (CommandException e) {
                sender.sendMessage(ChatColor.RED + "Something went wrong when executing this command!");
                e.printStackTrace();
            }
        }else {
            sender.sendMessage(ChatColor.RED + "You don't have enough permissions to execute this command!");
        }
        return true;
    }
}
