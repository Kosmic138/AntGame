package stockpileCard;

import player.Player;

/**
 *
 * @author Felix
 */
public class Stockpiles extends StockpileCard {

    private int amount;
    private int minusAmount;
    private int cost;
    private int cost_type;
    public String type;

    public Stockpiles() {
    	this.amount = 8;
    	this.minusAmount = 4;
        this.cost = 3;
        this.cost_type = 0;
        type = "st";
    }

    public Stockpiles(int amount, int minusAmount) {
        this.amount = amount;
        this.amount = minusAmount;
        this.cost = 3;
        this.cost_type = 0;
    }

    public int getAmount() {
        return amount;
    }
    
    public int getMinusAmount() {
    	return minusAmount;
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
    
    public void setMinusAmount(int minusAmount) {
    	this.minusAmount = minusAmount;
    }

    @Override
    public void supply(Player p) {
    	p.supply(amount, minusAmount);
    	System.out.println("Stockpiles supplying!");
    }

    @Override
    public String toString() {
    	return "Stockpiles{+ " + amount + " castle life, - " + minusAmount + "wall life}";
    }
}