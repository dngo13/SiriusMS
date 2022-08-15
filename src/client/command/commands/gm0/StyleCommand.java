/*
Author: Mizuki
Stylist Command
*/

package client.command.commands.gm0;

import client.MapleClient;
import client.command.Command;

public class StyleCommand extends Command {
    {
        setDescription("");
    }

    @Override
    public void execute(MapleClient client, String[] params) {
        client.getAbstractPlayerInteraction().openNpc(9900000, "style");
    }
}
