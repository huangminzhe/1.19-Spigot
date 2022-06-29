package com.Lin_morning.Plugin.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * 踢出玩家（附加被踢信息）
 */
public class kickM implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender .hasPermission("kickM.command.kickPlayer")){
            if (strings.length == 2){
                String message = strings[1];
                Player player = Bukkit.getServer().getPlayer(strings[0]);
                if (player == null) {
                    commandSender.sendMessage(ChatColor.RED + "该玩家不存在");
                    return false;
                }
                player.kickPlayer(message);
            } else if (strings.length == 1) {
                Player player = Bukkit.getServer().getPlayer(strings[0]);
                if (player == null) {
                    commandSender.sendMessage(ChatColor.RED + "该玩家不存在");
                    return false;
                }
                player.kickPlayer("你被管理员" + commandSender.getName() + "踢出了服务器");
            }else {
                commandSender.sendMessage(ChatColor.RED + "语法错误");
                commandSender.sendMessage(ChatColor.RED + "/kickM <玩家名称> [<被踢消息>]");
                return false;
            }
        }else {
            commandSender.sendMessage(ChatColor.RED + "你没有使用该指令的权限");
            return false;
        }
        return false;
    }
}
