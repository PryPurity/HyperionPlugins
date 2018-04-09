package HyperionReport;

import HyperionMain.MainClass;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Util {

    private static MainClass
    public Util(MainClass instance) {
        plugin = instance;
    }

    private static File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HyperionPlugins").getDataFolder() + "/Broadcaster/Config.yml");
    private static YamlConfiguration myFile = YamlConfiguration.loadConfiguration(file);

}
