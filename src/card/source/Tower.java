package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Tower extends AbstractSource {

    public Tower() {
        super();
        setBricks(5);
        setCastle(5);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseCastle(getCastle());
            System.out.println("Tower sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}