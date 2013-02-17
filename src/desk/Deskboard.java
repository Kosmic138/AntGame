package desk;

import java.util.Scanner;

import card.Card;

import player.Player;

/**
 *
 * @author Felix
 */
public class Deskboard {
	
	static Scanner sc = new Scanner(System.in);
	public static int card;
	
	public enum GameState {
		playing, p1_won, p2_won;
	}
	
	private static GameState currentState;
	
	public enum Turn {
		p1, p2
	}
	
	public static Turn currentTurn = Turn.p1;
	
	public static void setCurrentTurn(Turn t) {
		currentTurn = t;
	}
	
	private static void startGame() {
		currentState = GameState.playing;
		currentTurn = Turn.p1;
	}

    public static void main(String[] args) {

        System.out.println("ZACATEK");
        startGame();
        Player p1 = new Player("Castle 1", 100, 10, 40, 40, 40, 2, 2, 2);
        Player p2 = new Player("Castle 2", 100, 10, 40, 40, 40, 2, 2, 2);
        							//	   100, 10,  5,  5,  5, 2, 2, 2);
        Player.setCards();
        
        
        Player.getInfo(p1);
        System.out.println("");
        Player.readCards(1);
        
        System.out.println("");
        
        Player.getInfo(p2);
        System.out.println("");
        Player.readCards(2);
        
        System.out.println("");
        System.out.println("HRA");
        
        while(currentState == GameState.playing){
        	if(currentTurn == Turn.p1) {
        		Player.giveIncome(p1);
        		System.out.println("");
            	System.out.println("Player1 volí kartu (1 - 8).");
        		card = sc.nextInt();
				if(card >= 1 && card <= 8){
					Card x = new Card();											//Needed to rewrite abstract class Card to normal class, right?
					if(card == 1) {x = Player.p1card1;}								//Divné??
					if(card == 2) {x = Player.p1card2;}
					if(card == 3) {x = Player.p1card3;}
					if(card == 4) {x = Player.p1card4;}
					if(card == 5) {x = Player.p1card5;}
					if(card == 6) {x = Player.p1card6;}
					if(card == 7) {x = Player.p1card7;}
					if(card == 8) {x = Player.p1card8;}
					Player.useCard(x, p1, p2);
				}
				else {
					System.out.println("Zvolte prosím kartu v rozmezí (1 - 8)");
				}
        	}
        	
        	if(currentTurn == Turn.p2) {
        		Player.giveIncome(p2);
        		System.out.println("");
            	System.out.println("Player2 volí kartu (1 - 8).");
        		card = sc.nextInt();
				if(card >= 1 && card <= 8){
					Card x = new Card();											//Needed to rewrite abstract class Card to normal class, right?
					if(card == 1) {x = Player.p2card1;}								//Divné??
					if(card == 2) {x = Player.p2card2;}
					if(card == 3) {x = Player.p2card3;}
					if(card == 4) {x = Player.p2card4;}
					if(card == 5) {x = Player.p2card5;}
					if(card == 6) {x = Player.p2card6;}
					if(card == 7) {x = Player.p2card7;}
					if(card == 8) {x = Player.p2card8;}
					Player.useCard(x, p2, p1);
				}
				else {
					System.out.println("Zvolte prosím kartu v rozmezí (1 - 8)");
				}
				
				
				//je potøeba rozlišit, jakou kartu vybral, v závislosti na vybraném èislu
        	} 
        	while(card < 1 || card > 8);
        }
    }
}