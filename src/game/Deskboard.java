package game;

import card.attack.Archer;
import card.harmful.Thief;
import card.source.Babylon;
import player.Player;

/**
 *
 * @author Felix
 */
public class Deskboard {

    public static void main(String[] args) {
        // Zalozit hrace
        Player p1 = new Player("Castle 1", 100, 10, 40, 40, 40, 2, 2, 2);
        Player p2 = new Player("Castle 2", 100, 1, 12, 40, 40, 2, 2, 2);

        // Zalozit hru
        Game game = new Game(p1, p2);
        game.start();

        // Neresit zadnej balicek karet ted..
        Archer archer = new Archer();
        Thief thief = new Thief();
        Babylon babylon = new Babylon();

        // p1 -> p2
        game.execute(game.getCurrentPlayer(), archer, game.getCurrentPlayerEnemy());
        game.round();
        
        // p1 + 
        game.execute(game.getCurrentPlayer(), thief, game.getCurrentPlayerEnemy());
        game.round();

        // p2 +
        game.execute(game.getCurrentPlayer(), babylon, game.getCurrentPlayerEnemy());
        game.round();

    }
}