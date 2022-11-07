package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String askQuestion() {
        Random random = new Random();
        int upperLimit = 50;
        String[] mathOperations = {"+", "-", "*"};
        int number1 = random.nextInt(upperLimit);
        int number2 = random.nextInt(upperLimit);
        String mathOperation = mathOperations[random.nextInt(mathOperations.length)];
        String question = number1 + " " + mathOperation + " " + number2;
        System.out.println("Question: " + question);
        return question;
    }
    public static String getCorrectAnswer(String question) {
        String[] words = question.split("\\s");
        int number1 = Integer.parseInt(words[0]);
        int number2 = Integer.parseInt(words[2]);
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
        return Integer.toString(result);
    }
}
