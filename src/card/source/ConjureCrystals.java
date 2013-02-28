package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class ConjureCrystals extends AbstractSource {

    public ConjureCrystals() {
        super();
        setCrystals(4);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.increaseCrystals(getCrystals());
            System.out.println("Conjure Crystals sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureCrystals(getCrystals());
    }
}