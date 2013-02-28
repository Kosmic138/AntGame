package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Babylon extends AbstractSource {
    
    public Babylon() {
        super();
        setBricks(39);
        setCastle(39);
    }
    
    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseCastle(getCastle());
            System.out.println("Babylon sourcing!");
        }
    }
    
    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}
