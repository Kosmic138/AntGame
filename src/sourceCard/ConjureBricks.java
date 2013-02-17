package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class ConjureBricks extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public ConjureBricks() {
    	this.amount = 8;
        this.cost = 4;
        this.cost_type = 2;
        type = "so";
    }

    public ConjureBricks(int amount) {
        this.amount = amount;
        this.cost = 4;
        this.cost_type = 2;
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
    	p.increaseBricks(amount, cost, cost_type);
    	System.out.println("Conjure Bricks sourcing!");
    }

    @Override
    public String toString() {
    	return "Conjure Bricks{+ " + amount + " bricks}";
    }
}