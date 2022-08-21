/*
Author: Mizuki
TP Command to grind spots
*/

package client.command.commands.gm0;

import client.MapleClient;
import client.command.Command;

public class TPCommand extends Command {
    {
        setDescription("");
    }

    @Override
    public void execute(MapleClient client, String[] params) {
        client.getAbstractPlayerInteraction().openNpc(9901000, "tp");
    }
}
