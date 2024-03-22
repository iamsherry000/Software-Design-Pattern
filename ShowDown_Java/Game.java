package ShowDown_Java;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int TOTAL_PLAYER_NUM = 4;
    private int HUMAN_PLAYER_NUM = 1;

    public Game(){
    
    }
    
    public void initial() {
        List<Player> players = generatePlayers();
        for (Player player : players) {
            player.nameHimself();
        }
        System.out.println("Players: " + players);
    }

    private List<Player> generatePlayers() {
        List<Player> players = new ArrayList<>();
        
        for (int i = 0; i < HUMAN_PLAYER_NUM; i++) {
            HumanPlayer humanPlayer = new HumanPlayer();
            players.add(humanPlayer);
        }

        int AIPlayerNum = TOTAL_PLAYER_NUM - HUMAN_PLAYER_NUM;
        for (int i = 0; i < AIPlayerNum; i++) {
            AIPlayer AIPlayer = new AIPlayer();
            players.add(AIPlayer);
        }

        return players;
    }
}

