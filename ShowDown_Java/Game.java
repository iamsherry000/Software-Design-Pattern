package ShowDown_Java;

import java.util.List;

public class Game {
    private List<Player> players;
    private Deck deck;
    
    public Game(List<Player> players,Deck deck){
        this.players = players;
        this.deck = deck;
        
    }
    
    public void initial() {
        int totalPlayerNum = 4;
        int humanPlayerNum = 1;
        int AIPlayerNum = totalPlayerNum - humanPlayerNum;
        
    }
}

