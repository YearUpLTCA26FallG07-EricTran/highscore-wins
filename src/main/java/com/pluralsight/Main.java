package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Please enter the game score: " );
        String gameScore = scanner.nextLine().trim();
        String[] tokens = gameScore.split(Pattern.quote("|"));

        String[] team = tokens[0].split(":");
        String[] score = tokens[1].split(":");

        String team1 = team[0];
        String team2 = team[1];

        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);

        

        //Output
        String winner;

        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else
            System.out.println("Tie!");
    }
}
