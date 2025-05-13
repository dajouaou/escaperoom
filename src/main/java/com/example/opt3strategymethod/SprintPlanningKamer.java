package com.example.opt3strategymethod;

import java.util.Scanner;

public class SprintPlanningKamer extends Kamer {
    public SprintPlanningKamer(Speler speler) {
        super(speler);
    }

    @Override
    protected void toonOpdracht() {
        System.out.println("Welke taken plan je voor deze sprint?");
        System.out.println("Typ bijv. 'task1, task2'");

        Scanner scanner = new Scanner(System.in);
        String antwoord = scanner.nextLine();

        if (!antwoord.toLowerCase().contains("task")) {
            speler.setMonster(new Monster(new ScopeCreep())); // Strategy Pattern toegepast
        } else {
            speler.voegKamerToe(1);
            speler.verwijderMonster();
        }
    }

    @Override
    protected void checkResultaten() {
        if (speler.heeftMonster()) {
            speler.getMonster().versperWeg(); // Strategy wordt uitgevoerd
        } else {
            System.out.println("Goed gedaan! Je mag door.");
        }
    }

    @Override
    protected void geefToegang() {
        if (!speler.heeftMonster()) {
            System.out.println("De deur naar de volgende kamer opent...");
        }
    }
}

