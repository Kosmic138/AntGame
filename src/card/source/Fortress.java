package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Fortress extends AbstractSource {

    public Fortress() {
        super();
        setBricks(18);
        setCastle(20);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseCastle(getCastle());
            System.out.println("Fortress sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}