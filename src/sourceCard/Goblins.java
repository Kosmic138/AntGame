package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Goblins extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Goblins() {
    	this.amount = 22;
        this.cost = 22;
        this.cost_type = 2;
        type = "so";
    }

    public Goblins(int amount) {
        this.amount = amount;
        this.cost = 22;
        this.cost_type = 2;
    }

    public int getAmount() {
        return amount;
    }
    
    public int getCost() {
        return cost;
    }
    
    public int getCostType() {
        return cost_type;
    }
    
    public String getType() {
    	return type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void source(Player p) {
    	p.increaseCastleLife(amount, cost, cost_type);
    	System.out.println("Goblins sourcing!");
    }

    @Override
    public String toString() {
    	return "Goblins{+ " + amount + " wall}";
    }
}