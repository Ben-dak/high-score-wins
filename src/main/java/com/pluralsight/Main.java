package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the race result (Format: Home:Visitor|HomeScore:VisitorScore): ");
        String input = myScanner.nextLine().trim();

        String[] sections = input.split("\\|");

        //This section will split the variables
        String[] team = sections[0].split(":");
        String homeTeam = team[0];
        String visitorTeam = team[1];

        String[] scores = sections[1].split(":");
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);
    }
}
