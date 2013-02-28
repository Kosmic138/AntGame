package card.harmful;

import player.Player;

public class DispelBricks extends AbstractHarmful {

    private int dispelBriks = 8;

    public DispelBricks() {
        super(12);
        setCrystals(4);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            victim.decreaseBricks(dispelBriks);
            System.out.println("Dispel Bricks harassing!");
        }
    }
}
