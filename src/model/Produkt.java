package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Produkt implements Serializable {
    private String navn;
    private int pris;


    private double PantPris;
    private final ArrayList<Pris> priser = new ArrayList<>();
    private final ArrayList<OrdreLinje> ordreLinjer = new ArrayList<>();
    private ProduktKategori produktKategori;

    public double getPantPris() {
        return PantPris;
    }

    public void setPantPris(double pantPris) {
        PantPris = pantPris;
    }

    public ProduktMedPant getProduktMedPant() {
        return produktMedPant;
    }

    public void setProduktMedPant(ProduktMedPant produktMedPant) {
        this.produktMedPant = produktMedPant;
    }

    private ProduktMedPant produktMedPant;


    public Produkt(String navn) {
        this.navn = navn;
        this.produktKategori = produktKategori;
//        this.antal = antal;
    }

    public ArrayList <OrdreLinje> getOrdreLinjer() {
        return new ArrayList<>(ordreLinjer);
    }

    public ProduktKategori getProduktKategori() {
        return produktKategori;
    }

    public void setProduktKategori(ProduktKategori produktKategori) {
        this.produktKategori = produktKategori;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    private final ArrayList<Rundvisning>rundvisninger = new ArrayList<>();


    public ArrayList<Rundvisning>getRundvisninger(){
        return new ArrayList<>(rundvisninger);
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

    /** Pre: The ordreLinje is not connected to a produkt. */
    public void addOrdreLinje (OrdreLinje ordreLinje) {
        ordreLinjer.add(ordreLinje);
        ordreLinje.setProdukt(this);
    }

    /** Pre: The ordreLinje is connected to this produkt. */
    public void removeOrdreLinje (OrdreLinje ordreLinje) {
        ordreLinjer.remove(ordreLinje);
    }

    public double produktPris () {
        double p = 0.0;
        for (Pris k : priser){
            p = k.getBeløb();
        }
        return p;
    }


    @Override
    public String toString() {
        return "Navn: " + navn+" Pris: "+produktPris();}

}
