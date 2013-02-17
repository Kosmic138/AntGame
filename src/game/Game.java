package game;

import card.attack.Attackable;
import card.harmful.Harassing;
import card.source.Suppliable;
import player.Player;

/**
 *
 * @author Felix
 */
public class Game {

    private Player p1;
    private Player p2;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /* GAME API ***************************************************************/
    public void round() {
        // Process round
        p1.increaseSupply();
        p2.increaseSupply();
    }

    /* CARD EXECUTING *********************************************************/
    public void execute(Player executor, Attackable card, Player victim) {
        if (card.canUse(executor)) {
            print(executor, victim);
            card.attack(executor, victim);
            print(executor, victim);
            System.out.println();
        } else {
            System.out.println("Player " + executor.getName() + " cant use " + card);
        }
    }

    public void execute(Player executor, Harassing card, Player victim) {
        if (card.canUse(executor)) {
            print(executor, victim);
            card.harass(executor, victim);
            print(executor, victim);
            System.out.println();
        } else {
            System.out.println("Player " + executor.getName() + " cant use " + card);
        }
    }

    public void execute(Player executor, Suppliable card, Player victim) {
        if (card.canUse(executor)) {
            print(executor, victim);
            card.supply(executor);
            print(executor, victim);
            System.out.println();
        } else {
            System.out.println("Player " + executor.getName() + " cant use " + card);
        }
    }

    private void print(Player executor, Player victim) {
        System.out.println(executor);
        System.out.println(victim);
    }
}
