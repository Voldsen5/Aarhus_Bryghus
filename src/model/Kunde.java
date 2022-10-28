package model;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private int alder;
    private int tlfNr;
    private String email;
    ArrayList<Ordre> ordres;

    public Kunde(String navn, int alder, int tlfNr, String email, ArrayList<Ordre> ordres) {
        this.navn = navn;
        this.alder = alder;
        this.tlfNr = tlfNr;
        this.email = email;
        this.ordres = ordres;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public int getTlfNr() {
        return tlfNr;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Ordre> getOrdres() {
        return ordres;
    }
}
