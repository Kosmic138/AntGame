package attackCard;

import player.Player;

public class Dragon extends AttackCard {
	
	private int attack;
	private int cost;
	private int cost_type;
	public String type;

	public Dragon() {
        attack = 25;
        cost = 21;
        cost_type = 2;
        type = "at";
    }

    public Dragon(int attack) {
        this.attack = attack;
        this.cost = 21;
        this.cost_type = 2;
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
        System.out.println("Dragon attacking!");
    }

    @Override
    public String toString() {
        return "Dragon{" + "attack: " + attack + ", cost: " + cost + ", cost-type: " + cost_type + "}";
    }
	
}
