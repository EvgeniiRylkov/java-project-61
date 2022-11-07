package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static boolean startGame(String gameNumber) {
        String question;
        String answer;
        String correctAnswer;
        boolean isCorrect;
        final int timesToRepeat = 3;
        writeRules(gameNumber);
        int i = 0;
        do {
            question = askQuestion(gameNumber);
            answer = getUserAnswer();
            correctAnswer = getCorrectAnswer(gameNumber, question);
            isCorrect = checkAnswer(correctAnswer, answer);
            writeResult(isCorrect, correctAnswer, answer);
            i++;
        } while (isCorrect & i < timesToRepeat);
        return isCorrect;
    }

    public static void writeResult(boolean isCorrect, String correctAnswer, String answer) {
        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        }
    }

    public static void writeRules(String gameNumber) {
        switch (gameNumber) {
            case "2":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                System.out.println("What is the result of the expression?");
                break;
            case "4":
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case "5":
                System.out.println("What number is missing in the progression?");
                break;
            case "6":
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                break;
        }

    }

    public static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);
        return answer;
    }

    public static boolean checkAnswer(String correctAnswer, String answer) {
        return correctAnswer.equals(answer);
    }

    static void printCongratulation(boolean isWinner, String userName) {
        if (isWinner) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

    static String askQuestion(String gameNumber) {
        String question = "";
        switch (gameNumber) {
            case "2":
                question = EvenGame.askQuestion();
                break;
            case "3":
                question = Calc.askQuestion();
                break;
            case "4":
                question = GCD.askQuestion();
                break;
            case "5":
                question = Progression.askQuestion();
                break;
            case "6":
                question = PrimeGame.askQuestion();
            default:
                break;
        }
        return question;
    }

    static String getCorrectAnswer(String gameNumber, String question) {
        String correctAnswer = "";
        switch (gameNumber) {
            case "2":
                correctAnswer = EvenGame.getCorrectAnswer(question);
                break;
            case "3":
                correctAnswer = Calc.getCorrectAnswer(question);
                break;
            case "4":
                correctAnswer = GCD.getCorrectAnswer(question);
                break;
            case "5":
                correctAnswer = Progression.getCorrectAnswer(question);
                break;
            case "6":
                correctAnswer = PrimeGame.getCorrectAnswer(question);
            default:
                break;
        }
        return correctAnswer;
    }
}
