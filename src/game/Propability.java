package game;

public class Propability {
	
	int propability[];
	int tp[];						// total propability
	
	public Propability() {
		propability[0] = 25;		// Archer
		propability[1] = 4;			// Banshee
		propability[2] = 9;			// Catapult
		propability[3] = 5;			// Dragon
		propability[4] = 18;		// Group
		propability[5] = 22;		// Knight
		
		propability[6] = 4;			// Curse
		propability[7] = 12;		// Dispel Bricks
		propability[8] = 12;		// Dispel Crystals
		propability[9] = 12;		// Dispel Weapons
		propability[10] = 11;		// Saboteur
		propability[11] = 9;		// Swat
		propability[12] = 8;		// Thief
		propability[13] = 10;		// Vagon
		
		propability[14] = 3;		// Babylon
		propability[15] = 10;		// Builder
		propability[16] = 14;		// Conjure Bricks
		propability[17] = 14;		// Conjure Crystals
		propability[18] = 14;		// Conjure Weapons
		propability[19] = 14;		// Defence
		propability[20] = 9;		// Fortification
		propability[21] = 6;		// Fortress
		propability[22] = 5;		// Goblins
		propability[23] = 23;		// Grounding
		propability[24] = 10;		// Mage
		propability[25] = 10;		// Recruitment
		propability[26] = 11;		// Stockpiles
		propability[27] = 17;		// Tower
		propability[28] = 26;		// Wall
		
		
		
		System.out.println(propability[0]);
		
	}
		
	/*public int getPropability(Card c) {
		if(c.equals(Archer()){return 5;}
	}*/
	
	public int getTP(int i) {
		return tp[i];
	}
}
