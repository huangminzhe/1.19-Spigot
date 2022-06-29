package com.Lin_morning.Plugin.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * 获取玩家的延迟值
 */
public class ping implements CommandExecutor {
    private Plugin plugin = com.Lin_morning.Plugin.main.getPing.getPlugin(com.Lin_morning.Plugin.main.getPing.class);

    /**
     *
     * @param commandSender 发出指令者
     * @param command
     * @param s
     * @param strings 指令串
     */
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (strings.length == 0) {
                commandSender.sendMessage("当前延迟：" + plugin.getConfig().getString("ping_message"));
            }else {
                commandSender.sendMessage(ChatColor.RED + "[ERROR] 指令长度有误");
                return false;
            }
        }else {
            commandSender.sendMessage(ChatColor.RED + "[ERROR] 该指令只能由玩家执行");
            return false;
        }
        return false;
    }
}
