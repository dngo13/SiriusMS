package server.gachapon;

/**
*
* @author Alan (SharpAceX)
* @author Ronan - added ores and reworked global loots
*/

public class Global extends GachaponItems {

	@Override
	public int[] getCommonItems() {
		return new int[] {
                        /* Potions */
                        2000004, 2000005, 2001002, 2001001, 2020012, 2020013, 2020014, 2020015,
                        
                        /* Ores */
                        4004000, 4004001, 4004002, 4004003, 4004004,
                        4006000, 4006001,
                        4010000, 4010001, 4010002, 4010003, 4010004, 4010005, 4010006, 4010007,
                        4020000, 4020001, 4020002, 4020003, 4020004, 4020005, 4020006, 4020007, 4020008
		};
	}

	@Override
	public int[] getUncommonItems() {
		return new int[] {
                        /* Potions */
                        2022179, 2022273, 2022282, 2022283, 2022285, 2022245, 2022182,
                        
                        /* Scrolls */
                        2049003
		};
	}

	@Override
	public int[] getRareItems() {
		return new int[] {
                        /* Scrolls */
                        2049100, 2340000,
                        
                        /* Chairs */
                        3010063, 3010064,
                        
                        /* Crimsonwood Crafting Shit? */
                        1432018, 1432017, 1432016, 1432015,
                        4031757, 4031754, 4031752, 4031750, 4031756, 4031758,
                        4031759, 4031755, 4031760, 4031753, 4031898, 4031920,
                        4031918, 4031919, 4031899, 4031897, 4031936, 4032026,4032021
		};
	}

}
