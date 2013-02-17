package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Tower extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Tower() {
    	this.amount = 5;
        this.cost = 5;
        this.cost_type = 0;
        type = "so";
    }

    public Tower(int amount) {
        this.amount = amount;
        this.cost = 5;
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
    	System.out.println("Tower sourcing!");
    }

    @Override
    public String toString() {
    	return "Tower{+ " + amount + " castle}";
    }
}