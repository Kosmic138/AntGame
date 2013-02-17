package card.attack;

import player.Player;

public class Group extends AbstractAttack {

    public Group() {
        super(6, 4);
    }

    public Group(int attack, int weapons) {
        super(attack, weapons);
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
