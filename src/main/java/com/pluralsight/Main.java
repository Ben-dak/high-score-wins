package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the race result (Format: Home:Visitor|HomeScore:VisitorScore): ");
        String input = myScanner.nextLine().trim();

        String[] sections = input.split("\\|");



    }
}
