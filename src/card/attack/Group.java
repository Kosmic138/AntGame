package card.attack;

import player.Player;

public class Group extends AbstractAttack {

    public Group() {
        super(6, 4, 18);
    }

    public Group(int attack, int weapons, int prop) {
        super(attack, weapons, prop);
    }

    @Override
    public void attack(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defend(getAttack());
            System.out.println("Group attacking!");
        }
    }
}
