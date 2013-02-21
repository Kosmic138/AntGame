package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Grounding extends AbstractSource {

    public Grounding() {
        super(23);
        setBricks(1);
        setCastle(2);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseCastle(getCastle());
            System.out.println("Grounding sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}