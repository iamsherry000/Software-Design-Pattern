package ShowDown_Java;

public abstract class Player {
    String name; 
    
    // constructor
    public Player(String name) {
        this.name = name;
    }

    public abstract void nameHimself();

}
