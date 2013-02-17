package sourceCard;

import card.Card;
import player.Player;

/**
 *
 * @author Felix
 */
public abstract class SourceCard extends Card implements Sourcing{

    private int amount;
    private int cost;
    private int cost_type;

    public SourceCard() {
    	this.amount = 0;
        this.cost = 0;
        this.cost_type = -1;
    }

    public SourceCard(int amount) {
        this.amount = amount;
        this.cost = 0;
        this.cost_type = -1;
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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void source(Player p) {
    }

    @Override
    public String toString() {
    	return "";
    }
}