package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Wall extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Wall() {
    	this.amount = 3;
        this.cost = 1;
        this.cost_type = 0;
        type = "so";
    }

    public Wall(int amount) {
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
    	p.increaseWallLife(amount, cost, cost_type);
    	System.out.println("Wall sourcing!");
    }

    @Override
    public String toString() {
    	return "Wall{+ " + amount + " wall}";
    }
}