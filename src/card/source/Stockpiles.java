package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Stockpiles extends AbstractSource {

    public Stockpiles() {
        super();
        setCastle(8);
        setWall(4);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.increaseCastle(getCastle());
            executor.decreaseWall(getWall());
            System.out.println("Stockpiles sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return true;
    }
}