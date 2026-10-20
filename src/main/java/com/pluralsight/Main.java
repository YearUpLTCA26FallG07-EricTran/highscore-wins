package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input

        String input = "Home:Visitor|21:9";
        String[] tokens = input.split(Pattern.quote("|"));

        String[] team = input.split(tokens[0]);
        String[] score = input.split(tokens[1]);

        String team1 = team[0];
        String team2 = team[1];

        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);



        System.out.print("Please enter the game score: " );
   




        //format





        //Output
        String winner;

        if (score1 > score2) {
            System.out.println("Winner: " + score1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + score2);
        } else
            System.out.println("Tie!");
    }
}
