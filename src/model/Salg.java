package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Salg implements Serializable {
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

    public void setPris(double pris) {
        this.pris = pris;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public void setBetalingsmetode(Betalingsmetode betalingsmetode) {
        this.betalingsmetode = betalingsmetode;
    }

    public void setOrdre(Ordre ordre) {
        this.ordre = ordre;
    }
}
