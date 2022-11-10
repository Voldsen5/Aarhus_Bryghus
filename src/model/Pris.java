package model;

import java.io.Serializable;

public class Pris extends Produkt implements Serializable {
    private double beløb;
    Kontekst kontekst;
    Produkt produkt;
    Klip klip;



    public Pris(double beløb, Kontekst kontekst, Produkt produkt, String navn) {
        super(navn);
        this.beløb = beløb;
        this.kontekst = kontekst;
        this.produkt = produkt;
        produkt.addPris(this);

    }

    public void setKontekst(Kontekst kontekst) {
        this.kontekst = kontekst;
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

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public String toString() {
        return ""+beløb+" "+kontekst+" "+produkt;
    }
}
