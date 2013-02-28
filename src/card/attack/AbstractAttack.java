package card.attack;

import card.Card;
import player.Player;

/**
 *
 * @author Felix
 */
public abstract class AbstractAttack extends Card implements Attackable {

    private int attack;
    private int weapons;

    public AbstractAttack(int attack, int weapons) {
        this.attack = attack;
        this.weapons = weapons;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getWeapons() {
        return weapons;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureWeapons(getWeapons());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "attack=" + attack + ", weapons=" + weapons + '}';
    }
}