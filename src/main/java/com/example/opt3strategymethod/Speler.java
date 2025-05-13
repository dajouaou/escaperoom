package com.example.opt3strategymethod;


import java.util.*;

public class Speler {
    private String naam;
    private int huidigeKamer = 0;
    private String status = "";
    private List<Integer> kamersGehaald = new ArrayList<>();
    private Monster actiefMonster;

    public Speler(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public int getHuidigeKamer() {
        return huidigeKamer;
    }

    public void setHuidigeKamer(int kamer) {
        this.huidigeKamer = kamer;
    }

    public void voegKamerToe(int kamer) {
        if (!kamersGehaald.contains(kamer)) {
            kamersGehaald.add(kamer);
        }
    }

    public List<Integer> getKamersGehaald() {
        return kamersGehaald;
    }

    public void setMonster(Monster monster) {
        this.actiefMonster = monster;
    }

    public boolean heeftMonster() {
        return actiefMonster != null;
    }

    public Monster getMonster() {
        return actiefMonster;
    }

    public String getMonsterNaam() {
        return actiefMonster.getNaam();
    }

    public void verwijderMonster() {
        actiefMonster = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

