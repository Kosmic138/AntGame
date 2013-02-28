package card.source;

import card.Card;

/**
 *
 * @author Felix
 */
public abstract class AbstractSource extends Card implements Suppliable {

    private int castle;
    private int wall;
    private int bricks;
    private int builders;
    private int weapons;
    private int soldiers;
    private int crystals;
    private int mages;

    public AbstractSource() {
        castle = 0;
        wall = 0;
        bricks = 0;
        weapons = 0;
        crystals = 0;
        builders = 0;
        soldiers = 0;
        mages = 0;
    }

    public AbstractSource(int castle, int wall, int bricks, int builders, int weapons, int soldiers, int crystals, int mages) {
        this.castle = castle;
        this.wall = wall;
        this.bricks = bricks;
        this.builders = builders;
        this.weapons = weapons;
        this.soldiers = soldiers;
        this.crystals = crystals;
        this.mages = mages;
    }

    public int getCastle() {
        return castle;
    }

    public void setCastle(int castle) {
        this.castle = castle;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }

    public int getBricks() {
        return bricks;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    public int getBuilders() {
        return builders;
    }

    public void setBuilders(int builders) {
        this.builders = builders;
    }

    public int getWeapons() {
        return weapons;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    public int getCrystals() {
        return crystals;
    }

    public void setCrystals(int crystals) {
        this.crystals = crystals;
    }

    public int getMages() {
        return mages;
    }

    public void setMages(int mages) {
        this.mages = mages;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "castle=" + castle + ", wall=" + wall + ", bricks=" + bricks + ", builders=" + builders + ", weapons=" + weapons + ", soldiers=" + soldiers + ", crystals=" + crystals + ", mages=" + mages + '}';
    }
}