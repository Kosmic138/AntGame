package attackCard;

import player.Player;

public class Group extends AttackCard {
	
	private int attack;
	private int cost;
	private int cost_type;
	public String type;

	public Group() {
        attack = 6;
        cost = 4;
        cost_type = 1;
        type = "at";
    }

    public Group(int attack) {
        this.attack = attack;
        this.cost = 4;
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
        System.out.println("Group attacking!");
    }

    @Override
    public String toString() {
        return "Group{" + "attack: " + attack + ", cost: " + cost + ", cost-type: " + cost_type + "}";
    }
	
}
