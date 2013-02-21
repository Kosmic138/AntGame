package game;

import card.Card;
import player.Player;

/**
 *
 * @author Felix
 */
public class GameException extends Exception {

    private Player player;
    private Card card;

    public GameException(Player player, String message) {
        super(message);
        this.player = player;
    }

    public GameException(Player player, String message, Card card) {
        super(message);
        this.player = player;
        this.card = card;
    }
}
