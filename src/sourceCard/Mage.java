package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Mage extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Mage() {
    	this.amount = 1;
        this.cost = 8;
        this.cost_type = 2;
        type = "so";
    }

    public Mage(int amount) {
        this.amount = amount;
        this.cost = 8;
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
    	p.increaseMages(amount, cost, cost_type);
    	System.out.println("Mage sourcing!");
    }

    @Override
    public String toString() {
    	return "Mage{+ " + amount + " mage}";
    }
}