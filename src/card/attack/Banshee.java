package card.attack;

import player.Player;

public class Banshee extends AbstractAttack {

    public Banshee() {
        super(32, 28);
    }

    public Banshee(int attack, int weapons) {
        super(attack, weapons);
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
