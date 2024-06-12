public class Card {
    // For Uno
    public Color color; 
    public Number number;   

    // For Showdown
    public Suit suit;    
    public Rank rank;    

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE 
        // 2,3,4,5,6,7,8,9,10,J,Q,K,A
    }

    public enum Color {
        RED, BLUE, YELLOW, GREEN
    }
    
    // Constructor for Uno
    public Card(Color color, Number number) {
        this.color = color;
        this.number = number;
    }

    // Constructor for Showdown
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters for Uno
    public Color getColor() {
        return color;
    }

    public Number getNumber() {
        return number;
    }

    // Getters for Showdown
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

}
