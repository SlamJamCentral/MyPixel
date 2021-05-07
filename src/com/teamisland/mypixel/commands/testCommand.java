package com.teamisland.mypixel.commands;

import com.teamisland.mypixel.MyPixel;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class testCommand implements CommandExecutor {

    private MyPixel plugin;

    public testCommand(MyPixel plugin){
        this.plugin = plugin;
        plugin.getCommand("test").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Only players may send this command!");
            return true;
        }
        Player p = (Player) commandSender;
        p.sendMessage("FUCK YOU");
        // If you want to set up permissions
//        if(p.hasPermission("")){
//            // do command stuff
//            return true;
//        } else {
//            commandSender.sendMessage("You do not have permission for that command!");
//        }

        return false;
    }
}
