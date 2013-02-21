package game;

import java.util.ArrayList;

import card.Card;
import card.attack.AbstractAttack;
import card.attack.Attackable;
import card.attack.Archer;

public class GameCards {
	
	public GameCards(){

		ArrayList<Card> cards = new ArrayList<Card> ();
			for(int i = 0; i < Archer.getProp(); i++){
				cards.add(new Archer());
			}
	}
			
	
	
	
}
