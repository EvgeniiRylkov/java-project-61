package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String name;

    Cli(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    static String firstGreeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        var user =  new Cli(userName);
        System.out.println("Hello, " + user.getName() + "!");
        return userName;
    }
}
