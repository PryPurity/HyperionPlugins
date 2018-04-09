package HyperionReport;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Report implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandLabel.equalsIgnoreCase("report") || commandLabel.equalsIgnoreCase("rpt")) {


        return false;
    }
}
