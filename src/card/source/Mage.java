package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Mage extends AbstractSource {

    public Mage() {
        super(10);
        setCrystals(8);
        setMages(1);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseMages(getCrystals());
            executor.increaseMages(getMages());
            System.out.println("Mage sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureCrystals(getCrystals());
    }
}