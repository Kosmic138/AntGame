package card.harmful;

import player.Player;

public class Swat extends AbstractHarmful {

    private int destroyCastle = 10;

    public Swat() {
        super();
        setWeapons(18);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defendCastle(destroyCastle);
            System.out.println("Swat harassing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureWeapons(getWeapons());
    }
}
