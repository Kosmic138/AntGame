package card.attack;

import player.Player;

public class Knight extends AbstractAttack {

    public Knight() {
        super(3, 2);
    }

    public Knight(int attack, int weapons) {
        super(attack, weapons);
    }

    @Override
    public void attack(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defend(getAttack());
            System.out.println("Knight attacking!");
        }
    }
}
