package model;

public class OrdreLinje {
    private int antal;
    private String vareNavn;
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

    public double ordreLinjePris() {
       double p = 0.0;
       for (Pris k : produkt.getPriser()){
           p = k.getBeløb()*antal;
       }
       return p;
    }

    public double produktPris () {
        double p = 0.0;
        for (Pris k : produkt.getPriser()){
            p = k.getBeløb();
        }
        return p;
    }

    @Override
    public String toString() {
        return produkt.getNavn()+"     "+antal+"      "+produktPris()+"      "+ordreLinjePris();
    }
}
