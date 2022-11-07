package hexlet.code;

import static hexlet.code.Cli.firstGreeting;
import static hexlet.code.Engine.startGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var userName = "";
        String chosenNumber;
        boolean isWinner;
        boolean isGreeted = false;
        do {
            printList();
            chosenNumber = scanner.next();
            printConfirmation(chosenNumber);

            if (chosenNumber.equals("1")) {
                userName = firstGreeting();
                isGreeted = true;
            } else if (!chosenNumber.equals("0")) {
                if (!isGreeted) {
                    userName = firstGreeting();
                    isGreeted = true;
                }
                isWinner = startGame(chosenNumber);
                Engine.printCongratulation(isWinner, userName);
            }
        } while (!(chosenNumber.equals("0")));
        scanner.close();
    }
    static void printList() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
    static void printConfirmation(String chose) {
        System.out.println("Your choice: " + chose);
        System.out.println();
    }
}
