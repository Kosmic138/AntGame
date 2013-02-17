package card.harmful;

import card.Playable;
import player.Player;

public interface Harassing extends Playable {

    public void harass(Player executor, Player victim);
}