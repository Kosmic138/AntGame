package attackCard;

import card.Card;
import player.Player;

/**
 *
 * @author Felix
 */
public abstract class AttackCard extends Card implements Attacking {

    private int attack;
    private int cost;
    private int cost_type;
    public String type;

    public AttackCard() {
        attack = 0;
        cost = 0;
        cost_type = -1;
        type = "at";
    }

    public AttackCard(int attack) {
        this.attack = attack;
        this.cost = 0;
        this.cost_type = -1;
        type = "at";
    }

    public int getAttack() {
        return attack;
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

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void attack(Player p, Player pp) {
        p.pay(cost, cost_type);
        pp.attack(attack);
        System.out.println("AttackCard attacking!");
    }

    @Override
    public String toString() {
        return "AttackCard{" + "attack: " + attack + ", cost: " + cost + ", cost-type: " + cost_type + '}';
    }
}