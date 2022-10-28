package model;

import java.util.ArrayList;

public class ProduktKategori {
    private String navn;
    private final ArrayList<Produkt> produkter = new ArrayList<>();

    public ArrayList<Produkt>getProdukter(){
        return new ArrayList<>(produkter);
    }

    public void addProdukt(Produkt produkt){
    produkter.add(produkt);
    }

    public void removeProdukt(Produkt produkt){
        produkter.remove(produkt);
    }

    public ProduktKategori(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn+"";
    }
}
