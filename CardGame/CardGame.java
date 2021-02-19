package CardGame;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CardGame {

    private List<Card> drawPile;
    private Set<Player> players;

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();

        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            System.out.println("What is the player's name (leave blank for end of players)?");
            name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Human player = new Human(name);
            cardGame.addPlayer(player);
        }
        scanner.close();

        while (true) {
            for (Player player : cardGame.getPlayers()) {
                player.takeTurn();
            }
        }

    }
    
    private Set<Player> getPlayers() {
        return players;
    }

    public CardGame() {
        players = new HashSet<>();
        drawPile = generateDeck();
        Collections.shuffle(drawPile);
    }

    private List<Card> generateDeck() {
        LinkedList<Card> deck = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(suit, i));
            }
        }
        return deck;
    }

    public List<Card> getDrawPile() {
        return drawPile;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}