package HyperionCoords;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Coords implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] strings) {
        if (commandLabel.equalsIgnoreCase("coords") || commandLabel.equalsIgnoreCase("coordinates")) {
                Player player = (Player) sender;
            if (player.hasPermission("hyperion.coords") || player.isOp()) {

                    player.sendMessage("X: " + player.getLocation().getBlockX() + ", Y: " + player.getLocation().getBlockY() + ", Z: " + player.getLocation().getBlockZ());
                    return true;
            }
        }
        return false;
    }
}