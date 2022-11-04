package hexlet.code;

import static hexlet.code.Cli.firstGreeting;
import static hexlet.code.Engine.startGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var userName = "unnamed";
        String chosenNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            boolean isWinner = false;
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("0 - Exit");
            chosenNumber = scanner.next();
            System.out.println("Your choice: " + chosenNumber);
            System.out.println();

            if (chosenNumber.equals("1")) {
                userName = firstGreeting();
            } else {
                isWinner = startGame(chosenNumber);
            }

            if (isWinner) {
                System.out.println("Congratulations, " + userName + "!");
            } else {
                System.out.println("Let's try again, " + userName + "!");
            }
        } while (!(chosenNumber.equals("0")));
        scanner.close();
    }
}
