package stockpileCard;

import card.Card;
import player.Player;

/**
 *
 * @author Felix
 */
public abstract class StockpileCard extends Card implements Stockpiling{

    private int amount;
    private int minusAmount;
    private int cost;
    private int cost_type;

    public StockpileCard() {
    	this.amount = 0;
    	this.minusAmount = 0;
        this.cost = 0;
        this.cost_type = -1;
    }

    public StockpileCard(int amount, int minusAmount) {
        this.amount = amount;
        this.amount = minusAmount;
        this.cost = 0;
        this.cost_type = -1;
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

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void setMinusAmount(int minusAmount) {
    	this.minusAmount = minusAmount;
    }

    @Override
    public void supply(Player p) {
    }

    @Override
    public String toString() {
    	return "";
    }
}