package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Defence extends AbstractSource {

    public Defence() {
        super();
        setBricks(3);
        setWall(6);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseWall(getWall());
            System.out.println("Defence sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}