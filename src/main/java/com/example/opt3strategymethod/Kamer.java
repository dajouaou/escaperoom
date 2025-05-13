package com.example.opt3strategymethod;

public abstract class Kamer {
    protected Speler speler;

    public Kamer(Speler speler) {
        this.speler = speler;
    }

    // Template method: vaste volgorde van stappen
    public final void betreedKamer() {
        toonIntro();
        toonOpdracht();
        checkResultaten();
        geefToegang();
    }

    protected void toonIntro() {
        System.out.println("Je betreedt een nieuwe kamer...");
    }

    protected abstract void toonOpdracht();
    protected abstract void checkResultaten();
    protected abstract void geefToegang();
}

