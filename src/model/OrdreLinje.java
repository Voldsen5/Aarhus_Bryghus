package model;

public class OrdreLinje {
    private int antal;
    private String vareNavn;
    private double pris;
    Produkt produkt;

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public OrdreLinje(Produkt produkt, int antal) {
        this.antal = antal;
       this.produkt = produkt;
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

    public double ordreLinjePris() {
       double p = 0.0;
       p = getProdukt().getPris()*antal;
       return p;
    }

    @Override
    public String toString() {
        return produkt.getNavn()+"     "+antal+"      "+produkt.getPris()+"      "+ordreLinjePris();
    }
}
