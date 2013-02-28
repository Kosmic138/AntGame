package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Wall extends AbstractSource {

    public Wall() {
        super();
        setWall(3);
        setBricks(1);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseWall(getWall());
            System.out.println("Wall sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}