package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
    public static boolean startGame(String gameNumber) {
        String question = null;
        String answer = null;
        String correctAnswer = null;
        boolean isCorrect = false;
        writeRules(gameNumber);
        int i = 0;
        do {
            switch (gameNumber) {
                case "2":
                    question = EvenGame.askQuestion();
                    answer = getUserAnswer();
                    correctAnswer = EvenGame.getCorrectAnswer(question);
                    isCorrect = checkAnswer(correctAnswer, answer);
                    break;
                case "3":
                    question = Calc.askQuestion();
                    answer = getUserAnswer();
                    correctAnswer = Calc.getCorrectAnswer(question);
                    isCorrect = checkAnswer(correctAnswer, answer);
                    break;
                case "4":
                    question = GCD.askQuestion();
                    answer = getUserAnswer();
                    correctAnswer = GCD.getCorrectAnswer(question);
                    isCorrect = checkAnswer(correctAnswer, answer);
                    break;
                default:
                    break;
            }
            writeResult(isCorrect, correctAnswer, answer);
            i++;
        } while (isCorrect & i < 3);
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
    public static  boolean checkAnswer(String correctAnswer, String answer) {
        return correctAnswer.equals(answer);
    }
}