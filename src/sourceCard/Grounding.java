package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Grounding extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Grounding() {
    	this.amount = 2;
        this.cost = 1;
        this.cost_type = 0;
        type = "so";
    }

    public Grounding(int amount) {
        this.amount = amount;
        this.cost = 1;
        this.cost_type = 0;
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
    	System.out.println("Grounding sourcing!");
    }

    @Override
    public String toString() {
    	return "Grounding{+ " + amount + " castle}";
    }
}