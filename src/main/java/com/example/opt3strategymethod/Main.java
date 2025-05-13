package com.example.opt3strategymethod;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game spel = new Game();

        System.out.println("Welkom bij Scrum Escape Building!");
        System.out.println("Typ 'status' om je voortgang te zien.");
        System.out.println("Typ 'ga naar kamer [nummer]' om een kamer te betreden.");
        System.out.println("Typ 'stop' om het spel af te sluiten.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("stop")) {
                System.out.println("Tot de volgende keer!");
                break;
            } else if (input.equals("status")) {
                spel.toonStatus();
            } else if (input.startsWith("ga naar kamer")) {
                try {
                    int kamerNummer = Integer.parseInt(input.replaceAll("[^0-9]", ""));
                    spel.betreedKamer(kamerNummer);
                } catch (NumberFormatException e) {
                    System.out.println("Ongeldig kamernummer.");
                }
            } else {
                System.out.println("Onbekend commando.");
            }
        }
        scanner.close();
    }
}
