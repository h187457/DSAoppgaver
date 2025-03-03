package Comparable;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Game implements Comparable<Game> {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Game other) {
        return askAlex(this, other);
    }

    private int askAlex(Game game1, Game game2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which game do you prefer? (Enter 1 or 2)");
        System.out.println("1. " + game1.getName());
        System.out.println("2. " + game2.getName());

        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 1) return -1;  // game1 is better
            if (choice == 2) return 1;   // game2 is better
            System.out.println("Invalid input. Please enter 1 or 2.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GameRanking {
    public static void main(String[] args) {
        List<Game> games = Arrays.asList(
                new Game("Minecraft"),
                new Game("FIFA"),
                new Game("Cyberpunk"),
                new Game("Among Us"),
                new Game("The Witcher")
        );

        // Sort the games based on Alex's preferences
        games.sort(null);

        // Print the final ranking
        System.out.println("Alex's ranking:");
        for (int i = 0; i < games.size(); i++) {
            System.out.println((i + 1) + ". " + games.get(i));
        }
    }
}
