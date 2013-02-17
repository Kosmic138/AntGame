package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Fortress extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Fortress() {
    	this.amount = 20;
        this.cost = 18;
        this.cost_type = 0;
        type = "so";
    }

    public Fortress(int amount) {
        this.amount = amount;
        this.cost = 18;
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
    	System.out.println("Fortress sourcing!");
    }

    @Override
    public String toString() {
    	return "Fortress{+ " + amount + " wall}";
    }
}