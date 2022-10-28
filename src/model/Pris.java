package model;

public class Pris {
    private double beløb;
    Kontekst kontekst;

    public Pris(double beløb) {
        this.beløb = beløb;
    }

    public double getBeløb() {
        return beløb;
    }

    public void setBeløb(double beløb) {
        this.beløb = beløb;
    }

    public Kontekst getKontekst() {
        return kontekst;
    }
}
