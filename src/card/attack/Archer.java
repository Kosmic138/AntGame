package card.attack;

import player.Player;

public class Archer extends AbstractAttack {

    public Archer() {
        super(2, 1);
    }

    public Archer(int attack, int weapons) {
        super(attack, weapons);
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
