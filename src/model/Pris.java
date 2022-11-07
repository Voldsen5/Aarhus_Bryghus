package model;

public class Pris {
    private double beløb;
    Kontekst kontekst;
    Produkt produkt;
    Klip klip;



    public Pris(double beløb, Kontekst kontekst, Produkt produkt) {
        this.beløb = beløb;
        this.kontekst = kontekst;
        this.produkt = produkt;
        produkt.addPris(this);
    }

    public Pris(double beløb, Kontekst kontekst, Produkt produkt, Klip klip) {
        this.beløb = beløb;
        this.kontekst = kontekst;
        this.produkt = produkt;
        this.klip = klip;
        produkt.addPris(this);
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
}
