package org.teamisland256.mypixel;

import org.teamisland256.mypixel.commands.*;
import org.teamisland256.mypixel.events.TestEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.teamisland256.mypixel.commands.testCommand;

public class MyPixel extends JavaPlugin {

    @Override
    public void onEnable(){
        new testCommand(this);
        getServer().getPluginManager().registerEvents(new TestEvent(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[MyPixel]: Plugin is enabled!");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[MyPixel]: Plugin has been disabled!");
    }
}
