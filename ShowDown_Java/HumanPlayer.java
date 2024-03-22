package ShowDown_Java;

import java.util.Scanner;

public class HumanPlayer extends Player implements CommandLine{

    // constructor 
    public HumanPlayer() {
        
    }

    @Override 
    public void nameHimself() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String playerName = scanner.nextLine();
        this.name = playerName;
        // System.out.println("Your name is set to: " + this.name);
        scanner.close();
    }
}
