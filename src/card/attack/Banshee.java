package card.attack;

import player.Player;

public class Banshee extends AbstractAttack {

    public Banshee() {
        super(32, 28, 4);
    }

    public Banshee(int attack, int weapons, int prop) {
        super(attack, weapons, prop);
    }

    @Override
    public void attack(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defend(getAttack());
            System.out.println("Banshee attacking!");
        }
    }
}
