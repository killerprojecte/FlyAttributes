package flyproject.flyattributes;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class FlyAttributes extends JavaPlugin {

    public static List<Material> whitelist;
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        // Plugin startup logic

    }

    public void init(){
        config = getConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
