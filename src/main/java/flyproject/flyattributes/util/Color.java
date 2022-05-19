package flyproject.flyattributes.util;

import org.bukkit.ChatColor;

public class Color {
    public static String color(String text){
        return ChatColor.translateAlternateColorCodes('&',text);
    }
}
