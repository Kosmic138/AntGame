package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Goblins extends AbstractSource {

    public Goblins() {
        super();
        setCrystals(22);
        setCastle(22);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            executor.increaseCastle(getCastle());
            System.out.println("Goblins sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureCrystals(getCrystals());
    }
}