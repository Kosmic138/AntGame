package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Defence extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Defence() {
    	this.amount = 6;
        this.cost = 3;
        this.cost_type = 0;
        type = "so";
    }

    public Defence(int amount) {
        this.amount = amount;
        this.cost = 3;
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
    	p.increaseWallLife(amount, cost, cost_type);
    	System.out.println("Defence sourcing!");
    }

    @Override
    public String toString() {
    	return "Defence{+ " + amount + " wall}";
    }
}