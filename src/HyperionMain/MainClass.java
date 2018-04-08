package HyperionMain;

import HyperionBC.*;
import HyperionBlocker.Blockone;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "HyperionKnight's Plugin is now active!");
        registerEvents();
        registerBC();
        registerCommands();
    }

    public void onDisable(){
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
    }

    private void registerBC() {
        new Utils(this);
        getCommand("configbroadcast").setExecutor(new BroadcastConfigCommand());
        Utils.init();
    }
    private void registerCommands() {
        registerBlocker();
    }

    private void registerBlocker() {
        getCommand("plugins").setExecutor(new Blockone());
    }
}
