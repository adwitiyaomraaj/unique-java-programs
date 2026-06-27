
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    
    public Deck() {
        cards = new ArrayList<>();
        
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw Two"};

        
        for (String color : colors) {
            for (String value : values) {
                cards.add(new Card(color, value, false));
                
                if (!value.equals("0")) { 
                    cards.add(new Card(color, value, false));
                }
            }
        }

        
        cards.add(new Card("Wild", "Wild", true));
        cards.add(new Card("Wild", "Wild Draw Four", true));

        Collections.shuffle(cards);
    }

    
    public Card drawCard() {
        
        return cards.remove(cards.size() - 1);
    }
}
