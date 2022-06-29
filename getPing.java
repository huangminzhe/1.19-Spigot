package com.Lin_morning.Plugin.main;

import com.Lin_morning.Plugin.command.ping;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * {@code ping} 的运行类
 * @version 1.0
 * @see ping
 */
public class getPing extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[getPing] 插件加载中");

        getCommand("ping").setExecutor(new ping());

        System.out.println("[getPing] 插件已加载");
    }

    @Override
    public void onDisable() {
        System.out.println("[getPing] 插件已卸载");
    }
}
