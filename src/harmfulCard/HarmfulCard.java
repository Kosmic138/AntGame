package harmfulCard;

import card.Card;
import player.Player;

/**
 *
 * @author Felix
 */
public abstract class HarmfulCard extends Card implements Harassing {

    private int cost;
    private int cost_type;

    public HarmfulCard() {
        cost = 0;
        cost_type = -1;
    }
    
    public int getCost() {
        return cost;
    }
    
    public int getCostType() {
        return cost_type;
    }

    @Override
    public void harass(Player p, Player pp) {
    }

    @Override
    public String toString() {
        return "";
    }
}