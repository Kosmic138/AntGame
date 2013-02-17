package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Babylon extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Babylon() {
    	this.amount = 32;
        this.cost = 39;
        this.cost_type = 0;
        type = "so";
    }

    public Babylon(int amount) {
        this.amount = amount;
        this.cost = 39;
        this.cost_type = 0;
        type = "so";
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
    	System.out.println("Babylon sourcing!");
    }

    @Override
    public String toString() {
    	return "Babylon{+ " + amount + " wall}";
    }
}