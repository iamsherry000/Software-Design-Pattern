package ShowDown_Java;

public abstract class Player {
    protected String name; 
    
    // constructor
    public Player() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void nameHimself();

    // without this, will show 
    // Players: [ShowDown_Java.HumanPlayer@28d93b30, ShowDown_Java.AIPlayer@1b6d3586, 
    //           ShowDown_Java.AIPlayer@4554617c, ShowDown_Java.AIPlayer@74a14482]
    @Override
    public String toString() {
        return name; 
    }
}
