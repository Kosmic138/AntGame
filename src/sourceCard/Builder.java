package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Builder extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Builder() {
    	this.amount = 1;
        this.cost = 8;
        this.cost_type = 0;
        type = "so";
    }

    public Builder(int amount) {
        this.amount = amount;
        this.cost = 8;
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
    	p.increaseBuilders(amount, cost, cost_type);
    	System.out.println("Builder sourcing!");
    }

    @Override
    public String toString() {
    	return "Builder{+ " + amount + " builders}";
    }
}