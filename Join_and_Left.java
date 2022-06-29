package com.Lin_morning.Plugin.main;

import com.Lin_morning.Plugin.event.*;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * {@code PlayerJoin} 和 {@code PlayerQuit} 的运行类。
 * @version 1.1.1
 * @see PlayerJoin
 * @see PlayerQuit
 */
public class Join_and_Left extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[Join_and_Left] 插件加载中");

        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(),this);

        System.out.println("[Join_and_Left] 插件已加载");
    }

    @Override
    public void onDisable() {
        System.out.println("[Join_and_Left] 插件已卸载");
    }
}
