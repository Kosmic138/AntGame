package player;

import harmfulCard.DispelBricks;
import harmfulCard.DispelCrystals;
import harmfulCard.DispelWeapons;
import harmfulCard.Saboteur;
import harmfulCard.Swat;
import harmfulCard.Thief;
import sourceCard.Babylon;
import sourceCard.Builder;
import sourceCard.ConjureBricks;
import sourceCard.ConjureCrystals;
import sourceCard.ConjureWeapons;
import sourceCard.Defence;
import sourceCard.Fortification;
import sourceCard.Fortress;
import sourceCard.Goblins;
import sourceCard.Grounding;
import sourceCard.Mage;
import sourceCard.Recruitment;
import sourceCard.Tower;
import sourceCard.Wall;
import stockpileCard.Stockpiles;
import attackCard.Archer;
import attackCard.Banshee;
import attackCard.Catapult;
import attackCard.Dragon;
import attackCard.Group;
import attackCard.Knight;
import card.Card;
import desk.Deskboard;
import desk.Deskboard.Turn;

/**
 *
 * @author Felix
 */

enum GameState {
	playing, p1_won, p2_won;
}

public class Player {

    private String name;
    private PlayerData data;
    public static boolean isPayable = true;
    
    public static Card p1card1, p1card2, p1card3, p1card4, p1card5, p1card6, p1card7, p1card8;
	public static Card p2card1, p2card2, p2card3, p2card4, p2card5, p2card6, p2card7, p2card8;
	
	public Player() {
        data = new PlayerData();
    }

    public Player(String name) {
        this();
        this.name = name;
        increaseCastleLife(100, 0, 0);
        increaseWallLife(10, 0, 0);
        increaseBricks(5, 0, 0);
        increaseWeapons(5, 0, 0);
        increaseMana(5, 0, 0);
        increaseBuilders(2, 0, 0);
        increaseSoldiers(2, 0, 0);
        increaseMages(2, 0, 0);
    }

    public Player(String name, int castle_life, int wall_life, int bricks, int weapons, int mana, int builders, int soldiers, int mages) {
        this();
        this.name = name;
        increaseCastleLife(castle_life, 0, 0);
        increaseWallLife(wall_life, 0, 0);
        increaseBricks(bricks, 0, 0);
        increaseWeapons(weapons, 0, 0);
        increaseMana(mana, 0, 0);
        increaseBuilders(builders, 0, 0);
        increaseSoldiers(soldiers, 0, 0);
        increaseMages(mages, 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void getInfo(Player p) {
		System.out.println(p);
	}
    
    public static void getInfo(Player p1, Player p2){
    	System.out.println(p1);
    	System.out.println(p2);
    }
    
    public static Card chooseCard() {
		
		//Propability prop = new Propability();
		
		int i = (int)(Math.random()*340);
	    if(i < 5){return new Banshee();}
	    else if(i < 14){return new Catapult();}
	    else if(i < 20){return new Dragon();}
	    else if(i < 36){return new Group();}
	    else if(i < 59){return new Knight();}
	    else if(i < 89){return new Archer();}
	    
	    else if(i < 98){return new Swat();}
	    
	    else if(i < 110){return new DispelBricks();}
	    else if(i < 122){return new DispelCrystals();}
	    else if(i < 134){return new DispelWeapons();}
	    else if(i < 143){return new Saboteur();}
	    else if(i < 151){return new Thief();}
	    
	    else if(i < 154){return new Babylon();}
	    else if(i < 162){return new Builder();}
	    else if(i < 174){return new ConjureBricks();}
	    else if(i < 186){return new ConjureCrystals();}
	    else if(i < 198){return new ConjureWeapons();}
	    else if(i < 217){return new Defence();}
	    else if(i < 227){return new Fortification();}
	    else if(i < 233){return new Fortress();}
	    else if(i < 241){return new Goblins();}
	    else if(i < 264){return new Grounding();}
	    else if(i < 276){return new Mage();}
	    else if(i < 288){return new Recruitment();}
	    else if(i < 304){return new Tower();}
	    else if(i < 330){return new Wall();}
	    
	    else{return new Stockpiles();}
	}
	    
	public static void setCards() {
	    p1card1 = chooseCard();
        p1card2 = chooseCard();
        p1card3 = chooseCard();
        p1card4 = chooseCard();
        p1card5 = chooseCard();
        p1card6 = chooseCard();
        p1card7 = chooseCard();
        p1card8 = chooseCard();
        
        p2card1 = chooseCard();
        p2card2 = chooseCard();
        p2card3 = chooseCard();
        p2card4 = chooseCard();
        p2card5 = chooseCard();
        p2card6 = chooseCard();
        p2card7 = chooseCard();
        p2card8 = chooseCard();
	}
	
	public static void readCards(int a) {
		if(a == 1){
			System.out.println("PLAYER 1 CARDS:");
			System.out.println("1. " + p1card1);
			System.out.println("2. " + p1card2);
			System.out.println("3. " + p1card3);
			System.out.println("4. " + p1card4);
			System.out.println("5. " + p1card5);
			System.out.println("6. " + p1card6);
			System.out.println("7. " + p1card7);
			System.out.println("8. " + p1card8);
		}
	    if(a == 2){
	    	System.out.println("PLAYER 2 CARDS:");
			System.out.println("1. " + p2card1);
		    System.out.println("2. " + p2card2);
		    System.out.println("3. " + p2card3);
		    System.out.println("4. " + p2card4);
		    System.out.println("5. " + p2card5);
		    System.out.println("6. " + p2card6);
		    System.out.println("7. " + p2card7);
		    System.out.println("8. " + p2card8);
	    }
	}
       	
	public static void useCard(Card c, Player p1, Player p2){
		if(c.getType() == "at"){
			System.out.println("at");
			c.attack(p1, p2);
		}
		if(c.getType() == "so"){
			System.out.println("so");
			c.source(p1);
		}
		if(c.getType() == "ha"){
			System.out.println("ha");
			c.harass(p1, p2);
		}
		if(c.getType() == "su"){
			System.out.println("su");
			c.supply(p1);
		}
		if(isPayable){
			setCard(c);
			System.out.println("");
			if(Deskboard.currentTurn == Turn.p1){
				readCards(1);
				Deskboard.setCurrentTurn(Turn.p2);
				System.out.println("");
				getInfo(p1, p2);
			}
			else {
				readCards(2);
				Deskboard.setCurrentTurn(Turn.p1);
				System.out.println("");
				getInfo(p2, p1);
			}
			
			
		} else {
			System.out.println("Not enough resources, play another card or discard.");
		}
		
	}
	
	public static void setCard(Card c){
		if(c == p1card1) {p1card1 = chooseCard();}
		if(c == p1card2) {p1card2 = chooseCard();}
		if(c == p1card3) {p1card3 = chooseCard();}
		if(c == p1card4) {p1card4 = chooseCard();}
		if(c == p1card5) {p1card5 = chooseCard();}
		if(c == p1card6) {p1card6 = chooseCard();}
		if(c == p1card7) {p1card7 = chooseCard();}
		if(c == p1card8) {p1card8 = chooseCard();}
		
		if(c == p2card1) {p2card1 = chooseCard();}
		if(c == p2card2) {p2card2 = chooseCard();}
		if(c == p2card3) {p2card3 = chooseCard();}
		if(c == p2card4) {p2card4 = chooseCard();}
		if(c == p2card5) {p2card5 = chooseCard();}
		if(c == p2card6) {p2card6 = chooseCard();}
		if(c == p2card7) {p2card7 = chooseCard();}
		if(c == p2card8) {p2card8 = chooseCard();}
	}
	
	public void giveIncome(Player p) {
		data.setBricks(data.getBricks() + data.getBuilders());
		data.setWeapons(data.getWeapons() + data.getSoldiers());
		data.setMana(data.getMana() + data.getMages());
	}
	
	public void attack (int damage) {
    	if(isPayable) {
	    	if(damage <= data.getWallLife()) {
		    	data.setWallLife(data.getWallLife() - damage);
		    }
		    if(damage > data.getWallLife()) {
		    	int castle_damage;
		    	castle_damage = damage - data.getWallLife();
		    	data.setWallLife(0);
		    	data.setCastleLife(data.getCastleLife() - castle_damage);	
		    }
    	}
    }
    
    public void pay (int cost, int cost_type) {
    	if(cost_type == 0 && data.getBricks() >= cost) {
    		data.setBricks(data.getBricks() - cost);
    	}
    	else if(cost_type == 1 && data.getWeapons() >= cost) {
    		data.setWeapons(data.getWeapons() - cost);
    	}
    	else if(cost_type == 2 && data.getMana() >= cost) {
    		data.setMana(data.getMana() - cost);
    	}
    	else {
    		isPayable = false;
    	}
    }
    
    public void steal (int castle_life_steal, int wall_life_steal, int bricks_steal, int weapons_steal, int mana_steal, int builders_steal, int soldiers_steal, int mages_steal) {
    	if(isPayable) {
    		if(castle_life_steal <= data.getCastleLife()){
    			data.setCastleLife(data.getCastleLife() - castle_life_steal);
    		}
    		else {
    			data.setCastleLife(0);
    		}
    		if(wall_life_steal <= data.getWallLife()){
    			data.setWallLife(data.getWallLife() - wall_life_steal);
    		}
    		else {
    			data.setWallLife(0);
    		}
    		if(bricks_steal <= data.getBricks()){
    			data.setBricks(data.getBricks() - bricks_steal);
    		}
    		else {
    			data.setBricks(0);
    		}
    		if(weapons_steal <= data.getWeapons()){
    			data.setWeapons(data.getWeapons() - weapons_steal);
    		}
    		else {
    			data.setWeapons(0);
    		}
    		if(mana_steal <= data.getMana()){
    			data.setMana(data.getMana() - mana_steal);
    		}
    		else {
    			data.setMana(0);
    		}
    		if(builders_steal <= data.getBuilders()){
    			data.setBuilders(data.getBuilders() - builders_steal);
    		}
    		else {
    			data.setBuilders(0);
    		}
    		if(soldiers_steal <= data.getSoldiers()){
    			data.setSoldiers(data.getSoldiers() - soldiers_steal);
    		}
    		else {
    			data.setSoldiers(0);
    		}
    		if(mages_steal <= data.getMages()){
    			data.setMages(data.getMages() - mages_steal);
    		}
    		else {
    			data.setMages(0);
    		}
    	}
    }
    
    public void receive (int castle_life_steal, int wall_life_steal, int bricks_steal, int weapons_steal, int mana_steal, int builders_steal, int soldiers_steal, int mages_steal) {
    	
    	if(isPayable) {
    		data.setCastleLife(data.getCastleLife() + castle_life_steal);
    		data.setWallLife(data.getWallLife() + wall_life_steal);
    		data.setBricks(data.getBricks() + bricks_steal);
    		data.setWeapons(data.getWeapons() + weapons_steal);
    		data.setMana(data.getMana() + mana_steal);
    		data.setBuilders(data.getBuilders() + builders_steal);
    		data.setSoldiers(data.getSoldiers() + soldiers_steal);
    		data.setMages(data.getMages() + mages_steal);
    	}
    }
    
    public void supply (int amount, int minusAmount) {
    	if(isPayable) {
    		data.setCastleLife(data.getCastleLife() + amount);
    		data.setWallLife(data.getWallLife() + minusAmount);
    	}
    }
    
    public int getCastleLife() {
    	return data.getCastleLife();
    }

    public void increaseCastleLife(int life, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setCastleLife(data.getCastleLife() + life);
    		if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseCastleLife(int life, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setCastleLife(data.getCastleLife() - life);
    		if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseWallLife(int life, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setWallLife(data.getWallLife() + life);
    		if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseWallLife(int life, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setWallLife(data.getWallLife() - life);
    		if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseBricks(int bricks, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setBricks(data.getBricks() + bricks);
    		if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseBricks(int bricks, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setBricks(data.getBricks() - bricks);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseWeapons(int weapons, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type == 2 && cost <= data.getMana())){
    		data.setWeapons(data.getWeapons() + weapons);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseWeapons(int weapons, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setWeapons(data.getWeapons() - weapons);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseMana(int mana, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setMana(data.getMana() + mana);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseMana(int mana, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type == 1 && cost <= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setMana(data.getMana() - mana);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseBuilders(int builders, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setBuilders(data.getBuilders() + builders);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseBuilders(int builders, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setBuilders(data.getBuilders() - builders);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseSoldiers(int mana, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setSoldiers(data.getSoldiers() + mana);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseSoldiers(int soldiers, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setSoldiers(data.getSoldiers() - soldiers);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    
    public void increaseMages(int mages, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setMages(data.getMages() + mages);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }
    public void decreaseMages(int mages, int cost, int cost_type) {
    	if((cost_type == 0 && cost <= data.getBricks()) || (cost_type <= 1 && cost >= data.getWeapons()) || (cost_type <= 2 && cost >= data.getMana())){
    		data.setMages(data.getMages() - mages);
	        if(cost_type == 0){
	    		data.setBricks(data.getBricks() - cost);
	    	}
	    	if(cost_type == 1){
	    		data.setWeapons(data.getWeapons() - cost);
	    	}
	    	if(cost_type == 2){
	    		data.setMana(data.getMana() - cost);
	    	}
    	}
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", data=" + data + '}';
    }
}