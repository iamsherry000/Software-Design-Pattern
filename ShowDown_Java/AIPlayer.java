package ShowDown_Java;

import java.util.Random;

public class AIPlayer extends Player{
    private static final String[] NAMES = {"Alpha", "Beta", "Gamma", "Delta"};
    
    // constructor 
    public AIPlayer() {  
        super();
        nameHimself();
    }

    public void nameHimself() {
        Random rand = new Random();
        int index = rand.nextInt(NAMES.length);
        setName(NAMES[index]);
    }
}
