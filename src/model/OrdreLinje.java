package model;

import java.util.ArrayList;

public class OrdreLinje {
    private int antal;
    private ArrayList<Produkt> produkter;

    public OrdreLinje(int antal) {
        this.antal = antal;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public ArrayList<Produkt> getProdukter() {
        return produkter;
    }

    public void setProdukter(ArrayList<Produkt> produkter) {
        this.produkter = produkter;
    }
}
