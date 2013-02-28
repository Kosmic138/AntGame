package card.harmful;

import player.Player;

public class Curse extends AbstractHarmful {

    public Curse() {
        super(4);
        setCrystals(1);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseCrystals(getCrystals());
            victim.decreaseAll(1);
            executor.increaseAll(1);
            System.out.println("Curse harassing!");
        }
    }
}
