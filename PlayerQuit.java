package com.Lin_morning.Plugin.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

/**
 * 玩家退出服务器类。
 */
public class PlayerQuit implements Listener {
    private Plugin plugin = com.Lin_morning.Plugin.main.Join_and_Left.getPlugin(com.Lin_morning.Plugin.main.Join_and_Left.class);

    /**
     * 更改玩家退出服务器时的消息
     * @param event 玩家退出游戏事件
     * @see org.bukkit.event.player.PlayerQuitEvent
     */
    @EventHandler
    public void PlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("Left_message") + player.getDisplayName()));
    }
}
