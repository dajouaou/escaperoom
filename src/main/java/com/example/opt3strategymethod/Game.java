package com.example.opt3strategymethod;

import java.util.*;

public class Game {
    private List<Kamer> kamers = new ArrayList<>();
    private Speler speler;

    public Game() {
        Database.initDatabase();
        this.speler = Database.laadSpeler();
        kamers.add(new SprintPlanningKamer(speler));
        // Je kunt hier extra kamers toevoegen, zoals ReviewKamer etc.
    }

    public void toonStatus() {
        System.out.println("Huidige kamer: " + speler.getHuidigeKamer());
        System.out.println("Kamers gehaald: " + speler.getKamersGehaald());
        if (speler.heeftMonster()) {
            System.out.println("Actieve belemmering: " + speler.getMonsterNaam());
        } else {
            System.out.println("Geen actieve monsters.");
        }
    }

    public void betreedKamer(int nummer) {
        if (nummer <= 0 || nummer > kamers.size()) {
            System.out.println("Deze kamer bestaat niet.");
            return;
        }

        Kamer kamer = kamers.get(nummer - 1);
        speler.setHuidigeKamer(nummer);
        kamer.betreedKamer();
        Database.slaOp(speler);
    }
}

