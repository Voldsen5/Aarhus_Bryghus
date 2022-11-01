package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Produkt {
    private String navn;
    private double pris;
    private final ArrayList<Pris> priser = new ArrayList<>();
    OrdreLinje ordreLinje;

    public OrdreLinje getOrdreLinje() {
        return ordreLinje;
    }

    ProduktKategori produktKategori;

    public ProduktKategori getProduktKategori() {
        return produktKategori;
    }

    public void setProduktKategori(ProduktKategori produktKategori) {
        this.produktKategori = produktKategori;
    }



    private final ArrayList<Rundvisning>rundvisninger = new ArrayList<>();


    public ArrayList<Rundvisning>getRundvisninger(){
        return new ArrayList<>(rundvisninger);
    }

    public Produkt(String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
        this.produktKategori = produktKategori;
//        this.antal = antal;
    }

    public Rundvisning CreateRundvisning(String navn, int antalDeltagelser, LocalDateTime dato) {
        Rundvisning rundvisning = new Rundvisning(dato,antalDeltagelser, navn);
        rundvisninger.add(rundvisning);
        rundvisning.produkt = this;
        return rundvisning;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }


    public ArrayList<Pris> getPriser() {
        return new ArrayList<>(priser);
    }

    /** Pre: The pris is not connected to a produkt. */
    public void addPris (Pris pris) {
        priser.add(pris);
        pris.produkt = this;
    }

    /** Pre: The pris is connected to this produkt. */
    public void removePris (Pris pris) {
        priser.remove(pris);
        pris.produkt = null;
    }

    @Override
    public String toString() {
        return "Navn: "+navn+ " -  Pris: " +pris;
    }
}
