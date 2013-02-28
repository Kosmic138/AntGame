package card.harmful;

import player.Player;

public class Saboteur extends AbstractHarmful {

    private int stealBricks = 4;
    private int stealWeapons = 4;
    private int stealCrystals = 4;

    public Saboteur() {
        super();
        setCrystals(10);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            victim.decreaseBricks(stealBricks);
            victim.decreaseWeapons(stealWeapons);
            victim.decreaseCrystals(stealCrystals);
            System.out.println("Saboteur harassing!");
        }
    }
}