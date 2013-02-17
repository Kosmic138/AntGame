package sourceCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Recruitment extends SourceCard {

    private int amount;
    private int cost;
    private int cost_type;
    public String type;

    public Recruitment() {
    	this.amount = 1;
        this.cost = 8;
        this.cost_type = 1;
        type = "so";
    }

    public Recruitment(int amount) {
        this.amount = amount;
        this.cost = 8;
        this.cost_type = 1;
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
    	p.increaseSoldiers(amount, cost, cost_type);
    	System.out.println("Recruitment sourcing!");
    }

    @Override
    public String toString() {
    	return "Recruitment{+ " + amount + " soldiers}";
    }
}