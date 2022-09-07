package me.nojuslopro.unluckydifficulty.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class GiveRandomItem {
    public static void giveRandomItem() {
        Random random = new Random();
        Integer number = random.nextInt(200);
        if (number == 1) {
            Random random1 = new Random();
            Integer number1 = random1.nextInt(10);
            ItemStack netherite_sword = new ItemStack(Material.NETHERITE_SWORD);
            ItemStack Diamond_Helmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemStack End_Crystal = new ItemStack(Material.END_CRYSTAL, 5);
            ItemStack Bow = new ItemStack(Material.BOW);
            ItemStack ENCHANTED_NETHERITE_SWORD = new ItemStack(Material.NETHERITE_SWORD);
            ItemStack TOTEM_OF_UNDYING = new ItemStack(Material.TOTEM_OF_UNDYING);
            ItemStack God_Apples = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
            ItemStack Golden_Apples = new ItemStack(Material.GOLDEN_APPLE, 8);
            ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
            ItemStack Fireworks = new ItemStack(Material.FIREWORK_ROCKET, 64);

            ENCHANTED_NETHERITE_SWORD.addEnchantment(Enchantment.DAMAGE_ALL, 4);

            ItemMeta elytraMeta = ELYTRA.getItemMeta();
            elytraMeta.setUnbreakable(true);
            ELYTRA.setItemMeta(elytraMeta);

            Bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
            Bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
            Bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
            Bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
            Bow.addEnchantment(Enchantment.DURABILITY, 3);

            switch (number1) {
                case 1:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(netherite_sword);
                    }
                    break;
                case 2:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(Diamond_Helmet);
                    }
                    break;
                case 3:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(End_Crystal);
                    }
                    break;
                case 4:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(Bow);
                    }
                    break;
                case 5:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(ENCHANTED_NETHERITE_SWORD);
                    }
                    break;
                case 6:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(TOTEM_OF_UNDYING);
                    }
                    break;
                case 7:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(God_Apples);
                    }
                    break;
                case 8:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(Golden_Apples);
                    }
                    break;
                case 9:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(ELYTRA);
                    }
                    break;
                case 10:
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        player.getInventory().addItem(Fireworks);
                    }
                    break;
            }

        }
    }
}
