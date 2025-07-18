import java.util.*;

public class HousingCardGame {

    static class Player {
        int id;
        Set<Integer> cards = new HashSet<>();
        Set<Integer> matchedCards = new HashSet<>();

        Player(int id, Set<Integer> cards) {
            this.id = id;
            this.cards = cards;
        }

        boolean markNumber(int number) {
            if (cards.contains(number)) {
                matchedCards.add(number);
                return matchedCards.size() == cards.size(); // Winner condition
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int totalPlayers = 10;
        int cardsPerPlayer = 10;
        int numberRange = 100;

        // Generate unique cards for each player
        List<Player> players = new ArrayList<>();
        Set<Integer> usedNumbers = new HashSet<>();
        Random rand = new Random();

        for (int i = 1; i <= totalPlayers; i++) {
            Set<Integer> playerCards = new HashSet<>();
            while (playerCards.size() < cardsPerPlayer) {
                int num = rand.nextInt(numberRange) + 1;
                playerCards.add(num);
            }
            players.add(new Player(i, playerCards));
        }

        // Create shuffled deck
        List<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= numberRange; i++) deck.add(i);
        Collections.shuffle(deck);

        System.out.println("🎮 Game Start!");
        System.out.println("-------------------------------------");

        // Call numbers one by one and check for winner
        for (int call : deck) {
            System.out.println("📢 Number Called: " + call);

            for (Player player : players) {
                boolean isWinner = player.markNumber(call);
                if (isWinner) {
                    System.out.println("\n🏆 Player " + player.id + " is the winner!");
                    System.out.println("Their cards: " + player.cards);
                    System.out.println("Matched cards: " + player.matchedCards);
                    return;
                }
            }

            try {
                Thread.sleep(300); // simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("No winner!");
    }
}
