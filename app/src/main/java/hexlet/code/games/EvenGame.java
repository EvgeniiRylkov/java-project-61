package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static boolean evenGame() {
        var number = askQuestion();
        String answer = getUserAnswer();
        boolean correctAnswer = isEven(number);
        boolean isCorrect = checkAnswer(correctAnswer, answer);
        writeResult(isCorrect, correctAnswer, answer);
        return isCorrect ? true : false;
    }
    public static void writeRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    static void writeResult(boolean isCorrect, boolean correctAnswer, String answer) {
        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            String correctAnswerSt = correctAnswer ? "yes" : "no";
            System.out.println("'" + answer + "'" + " is wrong answer ;(."
                    + " Correct answer was '" + correctAnswerSt + "'");
        }
    }
    static int askQuestion() {
        Random random = new Random();
        int number = random.nextInt(50);
        System.out.println("Question: " + number);
        return  number;
    }
    static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);
        return answer;
    }
    static  boolean checkAnswer(boolean correctAnswer, String answer) {
        String correctAnswerSt = correctAnswer ? "yes" : "no";
        return correctAnswerSt.equals(answer);
    }
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
