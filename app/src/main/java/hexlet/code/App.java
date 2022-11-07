package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.firstGreeting;
import static hexlet.code.Engine.startGame;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var userName = "";
        String chosenNumber;
        boolean isWinner;
        printList();
        chosenNumber = scanner.next();
        printConfirmation(chosenNumber);
        switch (chosenNumber) {
            case "1":
                userName = firstGreeting();
                break;
            case "2", "3", "4", "5", "6":
                userName = firstGreeting();
                isWinner = startGame(chosenNumber);
                Engine.printCongratulation(isWinner, userName);
                break;
            default:
                break;
        }
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
