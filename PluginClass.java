package tutplugin.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginClass extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "ENABLED");
	}
	
	@Override
	public void onDisable()
	{
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "DISABLED");
	}
	
}
