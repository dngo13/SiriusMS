/*
Author: Mizuki
NPC script for teleporting to hot spot grind zones
*/

var status = 0;
var maps = [103000101, 260020600, 103040400, 261020300, 682010202, 541000300, 541010050, 682010203, 551030100, 600020300, 240040511, 270000100];
var selectedMap = -1;

function start() {
    cm.sendNext("Hello, I can take you to popular grind zones!");
}


function action(mode, type, selection) {
    if (mode == -1) {
        cm.dispose();
    } else {
        if (status == 1 && mode == 0) {
            cm.dispose();
            return;
        } else if (status >= 2 && mode == 0) {
            cm.sendNext("Changed your mind? See you later!");
            cm.dispose();
            return;
        }
        if (mode == 1)
            status++;
        else
            status--;
        if (status == 1) {
            var selStr = "";
            for (var i = 0; i < maps.length; i++)
                selStr += "\r\n#L" + i + "##m" + maps[i];
            cm.sendSimple(selStr);
        } else if (status == 2) {
            cm.sendYesNo("Confirm location #b#m" + maps[selection] + "##k?");
            selectedMap = selection;
        } else if (status == 3) {
            cm.warp(maps[selectedMap], 0);
            cm.dispose();
        }
    }
}