package card.harmful;

import player.Player;

public class DispelWeapons extends AbstractHarmful {

    private int dispelWeapons = 8;

    public DispelWeapons() {
        super(12);
        setCrystals(4);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            victim.decreaseWeapons(dispelWeapons);
            System.out.println("Dispel Weapons harassing!");
        }
    }
}
