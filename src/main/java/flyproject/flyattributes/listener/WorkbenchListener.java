package flyproject.flyattributes.listener;

import flyproject.flyattributes.FlyAttributes;
import flyproject.flyattributes.util.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class WorkbenchListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event){
        ItemStack gem = event.getCursor();
        ItemStack item = event.getCurrentItem();
        if (event.getClickedInventory()!=null && !event.getClickedInventory().getType().equals(InventoryType.WORKBENCH) && gem!=null && !gem.getType().equals(Material.AIR) && item!=null && !item.getType().equals(Material.AIR) && FlyAttributes.whitelist.contains(item.getType())) return;
    }

    private static boolean whitelist(Material type, Player player){
        boolean check = FlyAttributes.whitelist.contains(type);
        if (!check){
            player.sendMessage(Color.color(FlyAttributes.config.getString("invaild")));
        }
        return check;
    }
}
