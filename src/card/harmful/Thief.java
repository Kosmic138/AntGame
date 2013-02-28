package card.harmful;

import player.Player;

public class Thief extends AbstractHarmful {

    private int stealBricks = 5;
    private int stealWeapons = 5;
    private int stealCrystals = 5;

    public Thief() {
        super();
        setCrystals(15);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            executor.increaseBricks(stealBricks);
            executor.increaseWeapons(stealWeapons);
            executor.increaseCrystals(stealCrystals);
            victim.decreaseBricks(stealBricks);
            victim.decreaseWeapons(stealWeapons);
            victim.decreaseCrystals(stealCrystals);
            System.out.println("Thief harassing! " + toString());
        }
    }
}
