package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String askQuestion() {
        Random random = new Random();
        String[] mathOperations = {"+", "-", "*"};
        int number1 = random.nextInt(50);
        int number2 = random.nextInt(50);
        String mathOperation = mathOperations[random.nextInt(3)];
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
