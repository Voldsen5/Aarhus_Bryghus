package model;

import java.time.LocalDateTime;

public class Produkt {
    private String navn;
    private double pris;
    private int antal;

    public Produkt(String navn, double pris, int antal) {
        this.navn = navn;
        this.pris = pris;
        this.antal = antal;
    }

    public CreateRundvisning(String navn, int antalDeltagelser, LocalDateTime dato) {
        navn = navn;
        antalDeltagelser = antalDeltagelser;
        dato = dato;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }
}
