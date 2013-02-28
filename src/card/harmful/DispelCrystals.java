package card.harmful;

import player.Player;

public class DispelCrystals extends AbstractHarmful {

    private int dispelCrystals = 8;

    public DispelCrystals() {
        super(12);
        setCrystals(4);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            victim.decreaseCrystals(dispelCrystals);
            System.out.println("Dispel Crystals harassing!");
        }
    }
}
