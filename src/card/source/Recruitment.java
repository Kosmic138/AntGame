package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Recruitment extends AbstractSource {

    public Recruitment() {
        super();
        setWeapons(8);
        setSoldiers(1);
    }

    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            executor.increaseSoldiers(getSoldiers());
            System.out.println("Recruitment sourcing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureWeapons(getWeapons());
    }
}