package player;

/**
 *
 * @author Felix
 */
public class PlayerData {

    private int castle_life;
    private int wall_life;
    private int bricks;
    private int weapons;
    private int mana;
    private int builders;
    private int soldiers;
    private int mages;

    public PlayerData() {
        castle_life = 0;
        wall_life = 0;
        bricks = 0;
        weapons = 0;
        mana = 0;
        builders = 0;
        soldiers = 0;
        mages = 0;
    }

    public int getCastleLife() {
        return castle_life;
    }
    public int getWallLife() {
        return wall_life;
    }
    public int getBricks() {
        return bricks;
    }
    public int getWeapons() {
        return weapons;
    }
    public int getMana() {
        return mana;
    }
    
    public int getBuilders() {
        return builders;
    }
    public int getSoldiers() {
        return soldiers;
    }
    public int getMages() {
        return mages;
    }
    
    public void setCastleLife(int cLife) {
        this.castle_life = cLife;
        if(castle_life < 0){
        	castle_life = 0;
        }
    }
    public void setWallLife(int wLife) {
        this.wall_life = wLife;
        if(wall_life < 0){
        	wall_life = 0;
        }
    }    
    public void setBricks(int br) {
        this.bricks = br;
        if(bricks < 0){
        	bricks = 0;
        }
    }    
    public void setWeapons(int we) {
        this.weapons = we;
        if(weapons < 0){
        	weapons = 0;
        }
    }    
    public void setMana(int ma) {
        this.mana = ma;
        if(mana < 0){
        	mana = 0;
        }
    }
    public void setBuilders(int bu) {
        this.builders = bu;
        if(builders < 0){
        	builders = 0;
        }
    }
    public void setSoldiers(int so) {
    	this.soldiers = so;
        if(soldiers < 0){
        	soldiers = 0;
        }
    }
    public void setMages(int mag) {
    	this.mages = mag;
        if(mages < 0){
        	mages = 0;
        }
    }

    @Override
    public String toString() {
        return "PlayerData{" + "Castle life: " + castle_life + ", Wall life: " + wall_life + ", bricks: " + bricks + ", weapons: " + weapons + ", mana: " + mana + ", builders: " + builders + ", soldiers: " + soldiers + ", mages: " + mages + '}';
    }
}