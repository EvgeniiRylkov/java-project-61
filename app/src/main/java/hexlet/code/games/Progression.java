package hexlet.code.games;

import java.util.Random;

public class Progression {
    public static String askQuestion() {
        Random random = new Random();
        int startNumber = random.nextInt(50);
        int increment = random.nextInt(50);
        int arrayLength = random.nextInt(5) + 5;
        var stringsInProgression = new String[arrayLength];
        stringsInProgression[0] = Integer.toString(startNumber);
        for (int i = 1; i < arrayLength; i++) {
            stringsInProgression[i] = Integer.toString(startNumber + i * increment);
        }
        int hiddenIndex = random.nextInt(arrayLength);
        stringsInProgression[hiddenIndex] = "..";
        StringBuilder question = new StringBuilder();
        for (var stringInProgression
                : stringsInProgression) {
            question.append(stringInProgression).append(" ");
        }
        System.out.println("Question: " + question);
        return question.toString();
    }

    public static String getCorrectAnswer(String question) {
        String[] words = question.split("\\s");
        int hiddenIndex = 0;
        int increment = 0;
        int result = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals("..")) {
                hiddenIndex = i;
                break;
            }
        }
        // System.out.println("HiddenIndex is " + hiddenIndex);
        for (int i = 0; i < words.length - 1; i++) {
            if (i != hiddenIndex & (i + 1) != hiddenIndex) {
                increment = Integer.parseInt(words[i + 1]) - Integer.parseInt(words[i]);
            }
        }
        // System.out.println("Increment is " + increment);
        if (hiddenIndex != 0) {
            result = Integer.parseInt(words[0]) + hiddenIndex * increment;
        } else {
            result = Integer.parseInt(words[1]) - increment;
        }
        return Integer.toString(result);
    }
}
