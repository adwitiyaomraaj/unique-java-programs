


import java.util.ArrayList;
import java.util.List;

public class Player {
    
    private String name;
    private List<Card> hand;

    
    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    
    public String getName() {
        
        return name;
    }

    
    public void drawCard(Card card) {
        hand.add(card);
    }

    
    public void playCard(int index) {
        hand.remove(index);
    }

    
    public List<Card> getHand() {
        return hand;
    }

    
    public boolean canPlayCard(Card card, Card currentCard) {
        
        return card.getColor().equals(currentCard.getColor()) || 
               card.getValue().equals(currentCard.getValue()) || 
               card.isWild();
    }
}
