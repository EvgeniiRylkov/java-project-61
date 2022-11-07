package hexlet.code;

import static hexlet.code.Cli.firstGreeting;
import static hexlet.code.Engine.startGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var userName = "";
        String chosenNumber;
        boolean isWinner = false;
        boolean isGreeted = false;
        do {
            printList();
            chosenNumber = scanner.next();
            printConfirmation(chosenNumber);
            System.out.println();

            if (chosenNumber.equals("1")) {
                userName = firstGreeting();
                isGreeted = true;
            } else {
                if (!isGreeted) {
                    userName = firstGreeting();
                    isGreeted = true;
                }
                isWinner = startGame(chosenNumber);
            }
            printCongratulation(isWinner, userName);
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
    }
    static void  printCongratulation(boolean isWinner, String userName) {
        if (isWinner) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
