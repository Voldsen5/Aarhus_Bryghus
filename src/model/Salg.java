package model;

import java.time.LocalDate;

public class Salg {
    private double pris;
    private LocalDate dato;
    private Betalingsmetode betalingsmetode;
    private Ordre ordre;

    public Salg (double pris, LocalDate dato){
        this.pris = pris;
        this.dato = dato;
    }

    public double getPris() {
        return pris;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Betalingsmetode getBetalingsmetode() {
        return betalingsmetode;
    }

    public Ordre getOrdre() {
        return ordre;
    }
}
