package HyperionBlocker;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Blockone implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
    if ((commandSender instanceof Player)) {
        Player player = (Player) commandSender;
        if ((!player.hasPermission("hyperion.blocker")) && (player.isOp())) {

        }
        player.sendMessage(ChatColor.AQUA + "You do not have permission to look at our plugins. Sorry ;c");
    }
        return false;
    }
}
