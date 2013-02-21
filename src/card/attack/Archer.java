package card.attack;

import player.Player;

public class Archer extends AbstractAttack {

    public Archer() {
        super(2, 1, 25);
    }

    public Archer(int attack, int weapons, int prop) {
        super(attack, weapons, prop);
    }

    @Override
    public void attack(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defend(getAttack());
            System.out.println("Archer attacking! " + toString());
        }
    }
}
