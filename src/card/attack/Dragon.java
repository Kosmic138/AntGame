package card.attack;

import player.Player;

public class Dragon extends AbstractAttack {

    public Dragon() {
        super(25, 21, 5);
    }

    public Dragon(int attack, int weapons, int prop) {
        super(attack, weapons, prop);
    }

    @Override
    public void attack(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseWeapons(getWeapons());
            victim.defend(getAttack());
            System.out.println("Dragon attacking!");
        }
    }
}
