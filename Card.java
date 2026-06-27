

public class Card {
    
    private String color;
    private String value;
    private boolean isWild;

    
    public Card(String color, String value, boolean isWild) {
        this.color = color;
        this.value = value;
        this.isWild = isWild;
    }

    
    public String getColor() {
        
        return color;
    }

    
    public String getValue() {
        return value;
    }

    
    public boolean isWild() {
        return isWild;
    }

    @Override
    
    public String toString() {
        return color + " " + value;
    }
}
