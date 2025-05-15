package com.example.opt3strategymethod;

public class Monster {
    private MonsterGedrag gedrag;

    public Monster(MonsterGedrag gedrag) {
        this.gedrag = gedrag;
    }

    public void versperWeg() {
        gedrag.reageer(); // Strategy Pattern: gedragee via interface
    }

    public String getNaam() {
        return gedrag.getClass().getSimpleName();
    }

    public String toonFoutmelding() {
        return gedrag.toString();
    }
}

