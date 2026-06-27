


import java.util.Random;

public class AIPlayer extends Player {
    private Random random;

    
    public AIPlayer(String name) {
        super(name);
        random = new Random();
    }

    
    public void playTurn(Card currentCard, Deck deck) {
        
        for (int i = 0; i < getHand().size(); i++) {
            Card card = getHand().get(i);
            
            if (canPlayCard(card, currentCard)) {
                playCard(i);
                
                System.out.println(getName() + " played: " + card);
                
                return;
            }
        }
        
        Card drawnCard = deck.drawCard();
        drawCard(drawnCard);
        System.out.println(getName() + " drew a card: " + drawnCard);
    }
}
