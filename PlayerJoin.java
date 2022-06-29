package com.Lin_morning.Plugin.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

/**
 * 玩家加入服务器类。
 */
public class PlayerJoin implements Listener {
    private Plugin plugin = com.Lin_morning.Plugin.main.Join_and_Left.getPlugin(com.Lin_morning.Plugin.main.Join_and_Left.class);

    /**
     * 更改玩家进入服务器时的消息
     * @param event 玩家加入游戏事件
     * @see org.bukkit.event.player.PlayerJoinEvent
     */
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("Join_message") + "&l" + player.getDisplayName()));

        String IPv6 = plugin.getConfig().getString("UUID");
        String world = plugin.getConfig().getString("Player_world");
        String x = plugin.getConfig().getString("x");
        String y = plugin.getConfig().getString("y");
        String z = plugin.getConfig().getString("z");

        player.sendMessage(ChatColor.translateAlternateColorCodes('&',ChatColor.DARK_AQUA + "&l" + "IPv6：" + IPv6 + "\n&r" + ChatColor.DARK_AQUA + world + '：' + x + ' ' + y + ' ' + z));
    }
}
