package model;

public class ProduktMedPant {
    private double pantPris;
    private Produkt produkt;

    public ProduktMedPant(Produkt produkt, double pantPris) {
        this.pantPris = pantPris;
        this.produkt = produkt;
    }

    public double getPantPris() {
        return pantPris;
    }

    public void setPantPris(double pantPris) {
        this.pantPris = pantPris;
    }

    @Override
    public String toString() {
        return produkt.getNavn()+"                    "+pantPris;
    }


    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }


}
