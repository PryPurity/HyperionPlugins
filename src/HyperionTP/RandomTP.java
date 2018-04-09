package HyperionTP;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RandomTP implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("randomtp") || commandLabel.equalsIgnoreCase("rtp")) {
            Player player = (Player) sender;

            int randomX = (int) (Math.random()*2000);
            int randomY = (int) (Math.random()*256);
            int randomZ = (int) (Math.random()*2000);

            Location rtp = new Location(player.getWorld(),randomX, randomY, randomZ );
            player.teleport(rtp);
            player.sendMessage("You were teleported to X: " + randomX + " Y: " + randomY " Z: " + randomZ);
        }
        return false;
    }
}
