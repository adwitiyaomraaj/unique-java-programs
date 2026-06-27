


import java.util.Scanner;

public class UnoGame {
    private Player[] players;
    
    private int currentPlayer;
    private boolean gameDirection;
    private Card currentCard;
    private Deck deck;

    
    public UnoGame(Player[] players) {
        this.players = players;
        this.currentPlayer = 0;
        this.gameDirection = true; 
        this.deck = new Deck();
        initializeGame();
    }

    
    private void initializeGame() {
        
        for (Player player : players) {
            for (int i = 0; i < 7; i++) {
                player.drawCard(deck.drawCard());
            }
        }
        
        
        do {
            currentCard = deck.drawCard();
        
        } while (currentCard.getValue().equals("Wild") || currentCard.getValue().equals("Wild Draw Four") || 
                 currentCard.getValue().equals("Skip") || currentCard.getValue().equals("Reverse") || 
                 currentCard.getValue().equals("Draw Two"));

        
        System.out.println("Starting card: " + currentCard);
        startGame();
    }

    
    private void startGame() {
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Player player = players[currentPlayer];
            System.out.println("\n" + player.getName() + "'s turn. Current card: " + currentCard);

            
            System.out.println(player.getName() + "'s hand: " + player.getHand());

            
            if (player instanceof AIPlayer) {
                ((AIPlayer) player).playTurn(currentCard, deck);
            } else {
                playerTurn(scanner, player);
            }

            
            if (player.getHand().isEmpty()) {
                System.out.println(player.getName() + " has won the game!");
                break;
            }

            nextPlayer();
        }
        scanner.close();
    }

    
    private void playerTurn(Scanner scanner, Player player) {
        System.out.println("Enter the index of the card you want to play (or type 'draw' to draw a card):");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("draw")) {
            Card drawnCard = deck.drawCard();
            player.drawCard(drawnCard);
            System.out.println(player.getName() + " drew a card: " + drawnCard);
        } else {
            try {
                int cardIndex = Integer.parseInt(input);
                if (cardIndex < 0 || cardIndex >= player.getHand().size()) {
                    System.out.println("Invalid index. Try again.");
                    playerTurn(scanner, player);
                    
                    return;
                }
                Card cardToPlay = player.getHand().get(cardIndex);
                if (player.canPlayCard(cardToPlay, currentCard)) {
                    player.playCard(cardIndex);
                    System.out.println(player.getName() + " played: " + cardToPlay);
                    handleCardAction(cardToPlay, scanner);
                } else {
                    System.out.println("Cannot play that card. Try again.");
                    playerTurn(scanner, player);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid index or 'draw'.");
                playerTurn(scanner, player);
            }
        }
    }

    
    private void handleCardAction(Card card, Scanner scanner) {
        
        switch (card.getValue()) {
            case "Skip":
                System.out.println("Skipping the next player.");
                nextPlayer(); 
                break;
            case "Reverse":
                System.out.println("Reversing direction!");
                gameDirection = !gameDirection; 
                break;
            case "Draw Two":
                System.out.println("Next player draws two cards.");
                nextPlayer();
                players[currentPlayer].drawCard(deck.drawCard());
                players[currentPlayer].drawCard(deck.drawCard());
                break;
            case "Wild":
                handleWildCard(scanner); 
                break;
            case "Wild Draw Four":
                System.out.println("Wild Draw Four played! Next player draws four cards.");
                nextPlayer(); 
                for (int i = 0; i < 4; i++) {
                    players[currentPlayer].drawCard(deck.drawCard());
                }
                handleWildCard(scanner); 
                break;
            default:
                currentCard = card; 
                break;
        }

        
        if (card.getValue().equals("Skip") || card.getValue().equals("Reverse")) {
            currentCard = new Card(card.getColor(), card.getValue(), false);
            System.out.println("The next player can only play a " + currentCard.getColor() + " card.");
        }
    }

    
    private void handleWildCard(Scanner scanner) {
        System.out.println("Choose a color (Red, Green, Blue, Yellow):");
        String color = scanner.nextLine();
        
        currentCard = new Card(color, currentCard.getValue(), false);
        System.out.println("New color set to: " + color);
    }

    
    private void nextPlayer() {
        if (gameDirection) {
            currentPlayer = (currentPlayer + 1) % players.length; 
        } else {
            currentPlayer = (currentPlayer - 1 + players.length) % players.length; 
        }
    }

    
    public static void main(String[] args) {
        Player[] players = {
            
            new Player("Alice"),
            
            new AIPlayer("Bob"),
            
            new AIPlayer("Charlie"),
            
            new AIPlayer("Daisy")
        };

        
        new UnoGame(players);
    }
}
