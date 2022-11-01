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

    void setName(String name) {
        this.name = name;
    }

    static void firstGreeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        scanner.close();
        var user =  new Cli(userName);
        System.out.println("Hello, " + user.getName() + "!");
    }
}
