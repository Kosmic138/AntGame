package card.attack;

import player.Player;

public class Catapult extends AbstractAttack {

    public Catapult() {
        super(12, 10);
    }

    public Catapult(int attack, int weapons) {
        super(attack, weapons);
    }

    @Override
    public void attack(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defend(getAttack());
            System.out.println("Catapult attacking!");
        }
    }
}
