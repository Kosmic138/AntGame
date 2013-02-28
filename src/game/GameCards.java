package game;

import java.util.ArrayList;
import java.util.Collections;

import card.Card;
import card.attack.Archer;
import card.attack.Banshee;
import card.attack.Catapult;
import card.attack.Dragon;
import card.attack.Group;
import card.attack.Knight;
import card.harmful.Curse;
import card.harmful.DispelBricks;
import card.harmful.DispelCrystals;
import card.harmful.DispelWeapons;
import card.harmful.Saboteur;
import card.harmful.Swat;
import card.harmful.Thief;
import card.harmful.Vagon;
import card.source.Babylon;
import card.source.Builder;
import card.source.ConjureBricks;
import card.source.ConjureCrystals;
import card.source.ConjureWeapons;
import card.source.Defence;
import card.source.Fortification;
import card.source.Fortress;
import card.source.Goblins;
import card.source.Grounding;
import card.source.Mage;
import card.source.Recruitment;
import card.source.Stockpiles;
import card.source.Tower;
import card.source.Wall;

public class GameCards {
	
	private ArrayList<Card> cards;
	
	public GameCards(){

		cards = new ArrayList<Card> ();
				cards.add(new Archer());
				cards.add(new Banshee());
				cards.add(new Catapult());
				cards.add(new Dragon());
				cards.add(new Group());
				cards.add(new Knight());
				
				cards.add(new Curse());
				cards.add(new DispelBricks());
				cards.add(new DispelCrystals());
				cards.add(new DispelWeapons());
				cards.add(new Saboteur());
				cards.add(new Swat());
				cards.add(new Thief());
				cards.add(new Vagon());
				
				cards.add(new Babylon());
				cards.add(new Builder());
				cards.add(new ConjureBricks());
				cards.add(new ConjureCrystals());
				cards.add(new ConjureWeapons());
				cards.add(new Defence());
				cards.add(new Fortification());
				cards.add(new Fortress());
				cards.add(new Goblins());
				cards.add(new Grounding());
				cards.add(new Mage());
				cards.add(new Recruitment());
				cards.add(new Stockpiles());
				cards.add(new Tower());
				cards.add(new Wall());	
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card[] random(int count) {
		Card chosen[] = null;
		for(int i = 0; i < count; i++) {
			chosen[count] = cards.get(count);
		}
		return chosen;
	}
	
	public Card random() {
		shuffle();
		return cards.get(0);
	}
			
	
	
	
}
