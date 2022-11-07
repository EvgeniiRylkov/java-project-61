package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static String askQuestion() {
        Random random = new Random();
        int number1 = random.nextInt(50);
        int number2 = random.nextInt(50);
        String question = number1 + " " +  number2;
        System.out.println("Question: " + question);
        return question;
    }

    public static String getCorrectAnswer(String question) {
        String[] words = question.split("\\s");
        int number1 = Integer.parseInt(words[0]);
        int number2 = Integer.parseInt(words[1]);
        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);
        int result = 1;
        for (int i = min; i >= 0; i--) {
            if (max % i == 0 & min % i == 0) {
                result = i;
                break;
            }
        }
        return Integer.toString(result);
    }
}
