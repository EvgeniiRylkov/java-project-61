package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    public static String askQuestion() {
        Random random = new Random();
        final int upperLimit = 1000;
        int number = random.nextInt(upperLimit);
        System.out.println("Question: " + number);
        return Integer.toString(number);
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        boolean isPrime = isPrime(number);
        return isPrime ? "yes" : "no";
    }

    static boolean isPrime(int number) {
        boolean isNotPrime = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isNotPrime = true;
                break;
            }
        }
        return !isNotPrime;
    }
}
