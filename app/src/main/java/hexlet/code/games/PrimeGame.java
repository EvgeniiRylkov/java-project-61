package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    public static String askQuestion() {
        Random random = new Random();
        int number = random.nextInt(1000);
        String question = Integer.toString(number);
        System.out.println("Question: " + question);
        return question.toString();
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        boolean isPrime = isPrime(number);
        return isPrime ? "yes" : "no";
    }

    static boolean isPrime(int number) {
        boolean isNotPrime = false;
        for (int i = 2 ; i <= number / 2 ; i++) {
            if (number % i == 0) {
                isNotPrime = true;
                break;
            }
        }
        return  !isNotPrime;
    }
}
