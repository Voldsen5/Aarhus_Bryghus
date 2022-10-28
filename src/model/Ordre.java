package model;

import java.time.LocalDate;

public class Ordre {
    private int antal;
    private double samletPris;
    private LocalDate dato;
    Kunde kunde;
    private String status;
    Rabat rabat;
    Salg salg;

    public Ordre(int antal, double samletPris, LocalDate dato, Kunde kunde, String status) {
        this.antal = antal;
        this.samletPris = samletPris;
        this.dato = dato;
        this.kunde = kunde;
        this.status = status;
    }

    public int getAntal() {
        return antal;
    }

    public double getSamletPris() {
        return samletPris;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public String getStatus() {
        return status;
    }
}
