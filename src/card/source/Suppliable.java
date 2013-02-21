package card.source;

import card.Playable;
import player.Player;

/**
 *
 * @author Felix
 */
public interface Suppliable extends Playable {

    public void supply(Player executor);
}
