package attackCard;

import player.Player;

public class Archer extends AttackCard {
	
	private int attack;
	private int cost;
	private int cost_type;
	public String type;

	public Archer() {
        attack = 2;
        cost = 1;
        cost_type = 1;
        type = "at";
    }

    public Archer(int attack) {
        this.attack = attack;
        this.cost = 1;
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
        System.out.println("Archer attacking!");
    }

    @Override
    public String toString() {
        return "Archer{" + "attack: " + attack + ", cost: " + cost + ", cost-type: " + cost_type + "}";
    }
	
}
