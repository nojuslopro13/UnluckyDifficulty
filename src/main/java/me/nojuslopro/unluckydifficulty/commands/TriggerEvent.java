package me.nojuslopro.unluckydifficulty.commands;

import me.nojuslopro.unluckydifficulty.util.TriggerRandomnessClass;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class TriggerEvent implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("events.random")) {
            try {
                TriggerRandomnessClass.trigger();
                sender.sendMessage("Successfully triggered a random event");
                Bukkit.broadcastMessage("This event was triggered by a command, not by randomness.");
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
