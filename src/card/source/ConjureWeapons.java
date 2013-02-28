package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class ConjureWeapons extends AbstractSource {

    public ConjureWeapons() {
        super(14);
        setCrystals(4);
        setWeapons(8);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            executor.increaseWeapons(getWeapons());
            System.out.println("Conjure Weapons sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureCrystals(getCrystals());
    }
}