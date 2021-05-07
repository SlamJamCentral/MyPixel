package com.teamisland.mypixel.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class TestEvent implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.sendMessage(ChatColor.RED + "I know where you live");
    }

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent e){
        Player p = e.getPlayer();
        int x = p.getLocation().getBlockX();
        int y = p.getLocation().getBlockY();
        int z = p.getLocation().getBlockZ();

        Material block = p.getWorld().getBlockAt(x, y-1, z).getType();
        if(block == Material.WHITE_WOOL){
            block = Material.AIR;
        }
    }
}
