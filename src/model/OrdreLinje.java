package model;

import java.util.ArrayList;

public class OrdreLinje {
    private int antal;
    private ArrayList<Produkt> produkter;
    private String vareNavn;
    private double pris;
    private double samletPris;
    Produkt produkt;

    public Produkt getProdukt() {
        return produkt;
    }

    public OrdreLinje(String vareNavn, int antal, double pris, double samletPris) {
        this.antal = antal;
        this.vareNavn = vareNavn;
        this.pris = pris;
        this.samletPris = samletPris;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public String getVareNavn() {
        return vareNavn;
    }

    public double getPris() {
        return pris;
    }

    public double getSamletPris() {
        return samletPris;
    }

}
