package com.Lin_morning.Plugin.main;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * {@code kickM} 的运行类。
 * @see com.Lin_morning.Plugin.command.kickM
 */
public class kickM extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[kickM] 插件加载中");

        getCommand("kickM").setExecutor(new com.Lin_morning.Plugin.command.kickM());

        System.out.println("[kickM] 插件已加载");
    }
}
