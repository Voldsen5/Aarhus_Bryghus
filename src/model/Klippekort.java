package model;

import storage.Storage;

public class Klippekort {
    Kunde kunde;
    private int klip;

    public Klippekort(Kunde kunde, int klip) {
        this.kunde = kunde;
        this.klip = klip;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public int getKlip() {
        return klip;
    }

    public void setKlip(int klip) {
        this.klip = klip;
    }
}
