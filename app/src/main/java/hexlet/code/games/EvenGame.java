package hexlet.code.games;

import java.util.Random;
public class EvenGame {
    public static String askQuestion() {
        Random random = new Random();
        int number = random.nextInt(50);
        System.out.println("Question: " + number);
        return  Integer.toString(number);
    }
    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        boolean isEven = isEven(number);
        return isEven ? "yes" : "no";
    }
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
