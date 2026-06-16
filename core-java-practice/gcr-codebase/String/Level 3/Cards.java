import java.util.Scanner;
public class Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards to deal: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();
        String[] deck = initDeck();
        String[] shuffled = shuffleDeck(deck);
        String[][] players = distribute(shuffled, n, x);
        if (players != null) {
            printPlayers(players);
        }
        sc.close();
    }

    public static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[idx++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        String[] copy = new String[n];
        for (int i = 0; i < n; i++) {
            copy[i] = deck[i];
        }
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = copy[i];
            copy[i] = copy[randomCardNumber];
            copy[randomCardNumber] = temp;
        }
        return copy;
    }

    public static String[][] distribute(String[] deck, int n, int x) {
        if (n > deck.length) {
            System.out.println("Cannot deal more cards than the deck contains.");
            return null;
        }
        if (x <= 0 || n % x != 0) {
            System.out.println("Cards cannot be distributed evenly to players.");
            return null;
        }
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
        }
    }
}
