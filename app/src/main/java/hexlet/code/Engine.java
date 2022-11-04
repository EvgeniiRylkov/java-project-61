package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;

import static hexlet.code.games.Calc.calcGame;
import static hexlet.code.games.EvenGame.evenGame;

public class Engine {
    public static boolean startGame(String gameNumber) {
        boolean isWinner = false;
        switch (gameNumber) {
            case "2":
                EvenGame.writeRules();
                break;
            case "3":
                Calc.writeRules();
                break;
            default:
                break;
        }
        int i = 0;
        do {
            switch (gameNumber) {
                case "2":
                    isWinner = evenGame();
                    break;
                case "3":
                    isWinner = calcGame();
                    break;
                default:
                    break;
            }
            i++;
        } while (isWinner & i < 3);
        return isWinner;
    }
}
