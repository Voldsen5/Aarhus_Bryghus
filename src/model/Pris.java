package model;

public class Pris {
    private double beløb;
    Kontekst kontekst;
    Produkt produkt;



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

    public Produkt getProdukt() {
        return produkt;
    }
}
