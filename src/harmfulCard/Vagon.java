package harmfulCard;

import player.Player;

public class Vagon extends HarmfulCard {
	
	private int cost;
	private int cost_type;
    public String type;
	
	private int castle_life_steal;
	private int wall_life_steal;
	private int bricks_steal;
	private int weapons_steal;
	private int mana_steal;
	private int builders_steal;
	private int soldiers_steal;
	private int mages_steal;

	public Vagon() {
        cost = 10;
        cost_type = 0;
        type = "ha";
        
        castle_life_steal = 4;
    }
	
	public int getCastleLifeSteal() {
		return castle_life_steal;
	}
	
	public int getWallLifeSteal() {
		return wall_life_steal;
	}
	
	public int getBricksSteal() {
		return bricks_steal;
	}
	
	public int getWeaponsSteal() {
		return weapons_steal;
	}
	
	public int getManaSteal() {
		return mana_steal;
	}
	
	public int getBuildersSteal() {
		return builders_steal;
	}
	
	public int getSoldiersSteal() {
		return soldiers_steal;
	}
	
	public int getMagesSteal() {
		return mages_steal;
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
    
    @Override
    public void harass (Player p, Player pp) {
        p.pay(cost, cost_type);
        pp.steal(castle_life_steal, wall_life_steal, bricks_steal, weapons_steal, mana_steal, builders_steal, soldiers_steal, mages_steal);
        p.receive(2*castle_life_steal, wall_life_steal, bricks_steal, weapons_steal, mana_steal, builders_steal, soldiers_steal, mages_steal);
        System.out.println("Vagon harassing!");
    }

    @Override
    public String toString() {
        return "Vagon{destroy " + castle_life_steal + " castle life} and receive{" + 2*castle_life_steal + " castle life}";
    }
	
}
