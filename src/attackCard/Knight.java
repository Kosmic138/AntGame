package attackCard;

import player.Player;

public class Knight extends AttackCard {
	
	private int attack;
	private int cost;
	private int cost_type;
	public String type;

	public Knight() {
        attack = 3;
        cost = 2;
        cost_type = 1;
        type = "at";
    }

    public Knight(int attack) {
        this.attack = attack;
        this.cost = 2;
        this.cost_type = 1;
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
        System.out.println("Knight attacking!");
    }

    @Override
    public String toString() {
        return "Knight{" + "attack: " + attack + ", cost: " + cost + ", cost-type: " + cost_type + "}";
    }
	
}
