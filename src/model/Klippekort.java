package model;

import storage.Storage;

import java.util.ArrayList;

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

    public ArrayList<Klippekort> getKlippekort() {
        return new ArrayList<>(klip);
    }

    private void add(Klippekort klippekort) {
    }

    private void remove(int klip) {
    }

    public void addKlip(Klippekort klippekort) {
        klippekort.add(klippekort);
        klippekort.klip = 4;
    }


    public void removeKlippekort(Klippekort klippekort) {
        klippekort.remove(klip);
        klippekort.klip = 1;
    }

}
