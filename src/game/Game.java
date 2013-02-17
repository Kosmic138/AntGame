package game;

import card.attack.Attackable;
import card.harmful.Harassing;
import card.source.Suppliable;
import player.Player;
import player.PlayerStatus;

/**
 *
 * @author Felix
 */
public class Game {

    private Player p1;
    private Player p2;

    public Game(Player p1, Player p2) {
        // Firstly, set random start player
        if (Math.random() >= 0.5) {
            p1.setStatus(PlayerStatus.ON_TURN);
            p2.setStatus(PlayerStatus.ON_HOLD);
        } else {
            p1.setStatus(PlayerStatus.ON_HOLD);
            p2.setStatus(PlayerStatus.ON_TURN);
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    /* GAME API ***************************************************************/
    /**
     * Start the game
     *
     * @return void
     */
    public void start() {
        // shuffleCards();
        // p1.setCards(randomCards(8));
        // p2.setCards(randomCards(8));
        round();
    }

    /**
     * Change players + increase supplies
     *
     * @return void
     */
    public void round() {
        if (p1.getStatus() == PlayerStatus.ON_TURN) {
            p1.setStatus(PlayerStatus.PLAYING);
            p2.setStatus(PlayerStatus.ON_HOLD);
        } else if (p2.getStatus() == PlayerStatus.ON_TURN) {
            p2.setStatus(PlayerStatus.PLAYING);
            p1.setStatus(PlayerStatus.ON_HOLD);
        }
    }

    /**
     * Gets current player [in state PLAYING]
     *
     * @return Player
     */
    public Player getCurrentPlayer() {
        if (p1.getStatus() == PlayerStatus.PLAYING) {
            return p1;
        } else if (p2.getStatus() == PlayerStatus.PLAYING) {
            return p2;
        }
        throw new IllegalStateException("No players in PLAYING state.");
    }

    /**
     * Gets current player enemy [in state PLAYING]
     *
     * @return Player
     */
    public Player getCurrentPlayerEnemy() {
        if (p1.getStatus() == PlayerStatus.PLAYING) {
            return p2;
        } else if (p2.getStatus() == PlayerStatus.PLAYING) {
            return p1;
        }
        throw new IllegalStateException("No players in PLAYING state.");
    }

    /* CARD EXECUTING *********************************************************/
    public void execute(Player executor, Attackable card, Player victim) {
        if (card.canUse(executor)) {
            print(executor, victim);
            card.attack(executor, victim);
            print(executor, victim);
            System.out.println();
            swapTurn(executor, victim);
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
            swapTurn(executor, victim);
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
            swapTurn(executor, victim);
        } else {
            System.out.println("Player " + executor.getName() + " cant use " + card);
        }
    }

    private void print(Player executor, Player victim) {
        System.out.println(executor);
        System.out.println(victim);
    }

    private void swapTurn(Player executor, Player victim) {
        executor.setStatus(PlayerStatus.ON_HOLD);
        victim.setStatus(PlayerStatus.ON_TURN);
    }
}
