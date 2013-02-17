package card;

import player.Player;

/**
 *
 * @author Felix
 */
public class Card {

    private String name;
    public String type;

    public Card() {
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
    	return "abstract";
    }
    
    public void attack(Player p1, Player p2) {
    	
    }
    
    public void source(Player p1) {
    	
    }
    
    public void harass(Player p1, Player p2) {
    	
    }
    
    public void supply(Player p1) {
    	
    }
}