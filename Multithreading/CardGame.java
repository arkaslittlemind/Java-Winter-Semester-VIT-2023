import java.util.*;

public class CardGame {
    private static final String[] SUITS = {"Club", "Heart", "Diamond", "Spade"};
    private static final String[] RANKS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

    private static final int NUM_PLAYERS = 4;
    private static final int NUM_CARDS_PER_HAND = 4;
    private static final int NUM_KINGS_TO_WIN = 4;

    private List<Card> deck;
    private List<Card>[] players;
    private int[] kingsCount;

    private static class Card {
        private final String suit;
        private final String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public String getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return suit + "-" + rank;
        }
    }

    public CardGame() {
        deck = new ArrayList<>();
        players = new List[NUM_PLAYERS];
        kingsCount = new int[NUM_PLAYERS];
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(deck);
        for (int i = 0; i < NUM_PLAYERS; i++) {
            players[i] = new ArrayList<>();
        }
    }

    public void play() {
        int turn = 0;
        while (true) {
            System.out.println("Turn " + turn + ":");
            for (int i = 0; i < NUM_PLAYERS; i++) {
                drawCards(i);
                System.out.println("Player " + (i + 1) + " drew: " + players[i]);
                if (kingsCount[i] == NUM_KINGS_TO_WIN) {
                    System.out.println("Player " + (i + 1) + " wins!");
                    return;
                }
            }
            returnCards();
            turn++;
        }
    }

    private void drawCards(int playerIndex) {
        List<Card> hand = players[playerIndex];
        for (int i = 0; i < NUM_CARDS_PER_HAND; i++) {
            Card card = deck.remove(0);
            hand.add(card);
            if (card.getRank().equals("12")) {
                kingsCount[playerIndex]++;
            }
        }
    }

    private void returnCards() {
        for (int i = 0; i < NUM_PLAYERS; i++) {
            List<Card> hand = players[i];
            for (Card card : hand) {
                deck.add(card);
            }
            hand.clear();
            kingsCount[i] = 0;
        }
        Collections.shuffle(deck);
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.play();
    }
}
