package CardGame;

import java.util.Scanner;

public class Human extends Player {

    protected Human(String name) {
        this.name = name;
    }

    @Override
    public void takeTurn() {
        System.out.println(String.format("%s's turn", name));
        System.out.println("Would you like to do?");
        Scanner scanner = new Scanner(System.in);
        String response;
        while (true) {
            System.out.println("(Hit/Stand/Double Down/Split)");
            response = scanner.nextLine();
            try {
                PlayerDecisions.valueOf(response);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid response!");
            }
        }
        scanner.close();

        
    }
    
}
