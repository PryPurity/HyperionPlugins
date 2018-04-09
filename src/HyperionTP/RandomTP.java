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

            int randomX = (int) (Math.random()*2000);
            int randomZ = (int) (Math.random()*2000);
            int randomY = player.getWorld().getHighestBlockYAt(randomX, randomZ);

            Location rtp = new Location(player.getWorld(),randomX, randomY, randomZ );
            player.teleport(rtp);
            rtp.getBlock().setType(Material.DIRT);
            player.sendMessage("You were teleported to X: " + randomX + " Y: " + randomY " Z: " + randomZ);
        }
        return false;
    }
}
