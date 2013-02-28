package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class ConjureBricks extends AbstractSource {

    public ConjureBricks() {
        super();
        setCrystals(4);
        setBricks(8);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.increaseBricks(getBricks());
            executor.decreaseCrystals(getCrystals());
            System.out.println("Conjure Bricks sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureCrystals(getCrystals());
    }
}