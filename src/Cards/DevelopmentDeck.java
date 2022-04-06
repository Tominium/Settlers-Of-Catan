package Cards;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class DevelopmentDeck {

    private Deque<DevelopmentCard> deck;

    public DevelopmentDeck() {
        deck = new ArrayDeque<DevelopmentCard>();

        fill("knight", 14);
        fill("road building", 14);
        fill("year of plenty", 14);
        fill("monopoly", 14);
        deck.offer(new DevelopmentCard("Library", 1));
        deck.offer(new DevelopmentCard("Market", 1));
        deck.offer(new DevelopmentCard("Chapel", 1));
        deck.offer(new DevelopmentCard("Great Hall", 1));
        deck.offer(new DevelopmentCard("University", 1));

    }

    public void fill(String type, int num) {
        for(int i = 0; i < num; i++) {
            deck.offer(new DevelopmentCard(type));
        }
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(deck));
    }

    public DevelopmentCard getCard() {
        return deck.pop();
    }
}
