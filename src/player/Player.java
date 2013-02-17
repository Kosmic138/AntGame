package player;

/**
 *
 * @author Felix
 */
public class Player {

    private String name;
    /* PLAYER PROPERTIES **************************************************** */
    // Global
    private int castle;
    private int wall;
    // Building
    private int bricks;
    private int builders;
    // Attack
    private int weapons;
    private int soldiers;
    // Magic
    private int crystals;
    private int mages;
    /* ********************************************************************** */

    public Player(String name) {
        this.name = name;
        castle = 0;
        wall = 0;
        bricks = 0;
        weapons = 0;
        crystals = 0;
        builders = 0;
        soldiers = 0;
        mages = 0;
    }

    public Player(String name, int castle, int wall, int bricks, int builders, int weapons, int soldiers, int crystals, int mages) {
        this.name = name;
        this.castle = castle;
        this.wall = wall;
        this.bricks = bricks;
        this.builders = builders;
        this.weapons = weapons;
        this.soldiers = soldiers;
        this.crystals = crystals;
        this.mages = mages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* PUBLIC METHOD **********************************************************/
    public void defend(int attack) {
        if ((wall - attack) >= 0) {
            wall -= attack;
        } else {
            castle -= (attack - wall);
            wall = 0;
        }
    }

    public void defendCastle(int attack) {
        if ((castle - attack) > 0) {
            castle -= attack;
        } else {
            castle = 0;
        }
    }

    public boolean isAlive() {
        return ensureLive();
    }

    /* ENSURING API ***********************************************************/
    public boolean ensureLive() {
        return (wall + castle) > 0;
    }

    public boolean ensureLive(int attack) {
        if (((wall + castle) - attack) > 0) {
            return true;
        }
        return false;
    }

    public boolean ensureBricks(int count) {
        return ((bricks - count) >= 0);
    }

    public boolean ensureWeapons(int count) {
        return ((weapons - count) >= 0);
    }

    public boolean ensureCrystals(int count) {
        return ((crystals - count) >= 0);
    }

    /* PROPERTIES API *********************************************************/
    /*
     * decrease<>
     * increase<>
     */
    public void decreaseAll(int count) {
        decreaseCastle(count);
        decreaseWall(count);
        decreaseBricks(count);
        decreaseBuilders(count);
        decreaseWeapons(count);
        decreaseSoldiers(count);
        decreaseMages(count);
        decreaseCrystals(count);
    }

    public void increaseAll(int count) {
        increaseCastle(count);
        increaseWall(count);
        increaseBricks(count);
        increaseBuilders(count);
        increaseWeapons(count);
        increaseSoldiers(count);
        increaseMages(count);
        increaseCrystals(count);
    }

    public void increaseSupply() {
        increaseBricks(builders);
        increaseCrystals(mages);
        increaseWeapons(soldiers);
    }

    public void increaseCastle(int castle) {
        this.castle += castle;
    }

    public void decreaseCastle(int castle) {
        if ((this.castle - castle) > 0) {
            this.castle -= castle;
        } else {
            this.castle = 0;
        }
    }

    public void increaseWall(int wall) {
        this.wall += wall;
    }

    public void decreaseWall(int wall) {
        if ((this.wall - wall) > 0) {
            this.wall -= wall;
        } else {
            this.wall = 0;
        }
    }

    public void increaseBricks(int bricks) {
        this.bricks += bricks;
    }

    public void decreaseBricks(int bricks) {
        if ((this.bricks - crystals) > 0) {
            this.bricks -= bricks;
        } else {
            this.bricks = 0;
        }
    }

    public void increaseBuilders(int builders) {
        this.builders += builders;
    }

    public void decreaseBuilders(int builders) {
        if ((this.builders - builders) > 0) {
            this.builders -= builders;
        } else {
            this.builders = 0;
        }
    }

    public void increaseWeapons(int weapons) {
        this.weapons += weapons;
    }

    public void decreaseWeapons(int weapons) {
        if ((this.weapons - weapons) > 0) {
            this.weapons -= weapons;
        } else {
            this.weapons = 0;
        }
    }

    public void increaseSoldiers(int soldiers) {
        this.soldiers += soldiers;
    }

    public void decreaseSoldiers(int soldiers) {
        if ((this.soldiers - soldiers) > 0) {
            this.soldiers -= soldiers;
        } else {
            this.soldiers = 0;
        }
    }

    public void increaseCrystals(int crystals) {
        this.crystals += crystals;
    }

    public void decreaseCrystals(int crystals) {
        if ((this.crystals - crystals) > 0) {
            this.crystals -= crystals;
        } else {
            this.crystals = 0;
        }
    }

    public void increaseMages(int mages) {
        this.mages += mages;
    }

    public void decreaseMages(int mages) {
        if ((this.mages - mages) > 0) {
            this.mages -= mages;
        } else {
            this.mages = 0;
        }
    }

    /* ************************************************************************/
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", castle=" + castle + ", wall=" + wall + ", bricks=" + bricks + ", builders=" + builders + ", weapons=" + weapons + ", soldiers=" + soldiers + ", crystals=" + crystals + ", mages=" + mages + '}';
    }
}