package card.attack;

import card.Playable;
import player.Player;

/**
 *
 * @author Felix
 */
public interface Attackable extends Playable {

    public void attack(Player executor, Player victim);
}