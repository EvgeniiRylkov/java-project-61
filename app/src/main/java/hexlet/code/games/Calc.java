package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static boolean calcGame() {
        var question = askQuestion();
        String answer = getUserAnswer();
        String correctAnswer = getCorrectAnswer(question);
        boolean isCorrect = checkAnswer(correctAnswer, answer);
        writeResult(isCorrect, correctAnswer, answer);
        return isCorrect ? true : false;
    }
    public static void writeRules() {
        System.out.println("What is the result of the expression?");
    }
    static void writeResult(boolean isCorrect, String correctAnswer, String answer) {
        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        }
    }
    static String askQuestion() {
        Random random = new Random();
        String[] mathOperations = {"+", "-", "*"};
        int number1 = random.nextInt(50);
        int number2 = random.nextInt(50);
        String mathOperation = mathOperations[random.nextInt(3)];
        String question = number1 + " " + mathOperation + " " + number2;
        System.out.println("Question: " + number1 + " " + mathOperation + " " + number2);
        return question;
    }
    static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);
        return answer;
    }
    static  boolean checkAnswer(String correctAnswer, String answer) {
        return correctAnswer.equals(answer);
    }
    static String getCorrectAnswer(String question) {
        String[] words = question.split("\\s");
        int number1 = Integer.parseInt(words[0]);
        System.out.println(number1);
        int number2 = Integer.parseInt(words[2]);
        System.out.println(number2);
        System.out.println(words[1]);
        int result = 0;
        switch (words[1]) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            default:
                break;
        }
        System.out.println(result);
        return Integer.toString(result);
    }
}
