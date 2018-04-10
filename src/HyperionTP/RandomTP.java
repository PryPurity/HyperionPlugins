package HyperionTP;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RandomTP implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("randomtp") || commandLabel.equalsIgnoreCase("rtp")) {
            Player player = (Player) sender;

            double randomX = (Math.random() * 2000) + 0.5;
            double randomZ = (Math.random() * 2000) + 0.5;
            double randomY = player.getWorld().getHighestBlockYAt((int) randomX, (int) randomZ) + 1.5;

            Location rtp = new Location(player.getWorld(), randomX, randomY, randomZ);
            player.teleport(rtp);
            rtp.getBlock().getRelative(0, -1, 0).setType(Material.DIRT);
            player.sendMessage("You were teleported to X: " + (int) randomX + " Y: " + (int) randomY + " Z: " + (int) randomZ);
            //fuck you mike
        }
        return false;
    }
}
