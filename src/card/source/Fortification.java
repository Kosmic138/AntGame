package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Fortification extends AbstractSource {

    public Fortification() {
        super();
        setBricks(12);
        setWall(22);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseWall(getWall());
            System.out.println("Fortification sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}