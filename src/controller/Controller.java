package controller;


import model.*;
import storage.Storage;

public class Controller {
    private static Storage storage;

    public static Storage getStorage() {
        return storage;
    }


    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    /**
     * Pre: At produkt Kategori med samme String navn ikke allerede er skabt.
     */

    public static ProduktKategori createProduktkategori(String name) {
        ProduktKategori produktKategori = new ProduktKategori(name);
        storage.storeProduktKatagori(produktKategori);
        return produktKategori;
    }

    /**
     * Pre: At produkt med samme String navn ikke allerede er skabt.
     */

    public static Produkt createProdukt(String navn) {
        Produkt produkt = new Produkt(navn);
        storage.storeProdukt(produkt);
        return produkt;
    }

    /**
     * Pre: antal >= 1.
     */

    public static OrdreLinje createOrdreLinje(Produkt produkt, int antal) {
        OrdreLinje ordreLinje = new OrdreLinje(produkt, antal);
        storage.storeOrdreLinjer(ordreLinje);
        return ordreLinje;
    }

    /**
     * Pre: At kontekst med samme String event ikke allerede er skabt.
     */

    public static Kontekst createKontekst(String event) {
        Kontekst kontekst = new Kontekst(event);
        storage.storeKontekst(kontekst);
        return kontekst;
    }

    /**
     * Pre: kotekst og produkt skal være skabt.
     */

    public static Pris createPris(double beløb, Kontekst kontekst, Produkt produkt) {
        Pris pris = new Pris(beløb, kontekst, produkt,null);
        storage.storePris(pris);
        return pris;
    }

    public static Pris createPrisMedKlip(double beløb, Kontekst kontekst, Produkt produkt) {
        Pris prismedKlip = new Pris(beløb, kontekst, produkt,null);
        storage.storePris(prismedKlip);
        return prismedKlip;
    }

    /**
     * Pre: Produkt katagori og produkt er skabt.
     */

    public static void addProduktTilKategori(ProduktKategori produktKategori, Produkt produkt) {
        produktKategori.addProdukt(produkt);
        produkt.setProduktKategori(produktKategori);
    }


    public static double samletOrdrePris() {
        double samlet = 0.0;
        for (OrdreLinje p : storage.getOrdreLinjer()) {
            samlet = samlet + p.ordreLinjePris();
        }
        return samlet;
    }

    /**
     * Pre: At produkt med pant ikke allerede er skabt.
     */

    public static ProduktMedPant createProduktMedPant(Produkt produkt, double pantPris) {
        ProduktMedPant produktMedPant = new ProduktMedPant(produkt, pantPris);
        storage.storeProduktMedPant(produktMedPant);
        return produktMedPant;
    }

    /**
     * Pre: procent >= 100  & procent <= 1.
     */
    public static double procentRabat(double procent) {
        double x = 0.0;
        x = ((samletOrdrePris() * procent) / 100);
        return samletOrdrePris() - x;
    }

    public static double samletPantPris(){
        double x = 0.0;
        for (Produkt p : storage.getProdukts()){
            x = x+p.getPantPris();
        }
        return x;
    }

    /**
     * Pre: nyPris >= 0.
     */

    public static double fastPris(double nyPris) {
        return nyPris;
    }

    public static Betalingsmetode createKlippekort(String navn, Ordre ordre, Salg salg, Kunde kunde, int klip) {
        Betalingsmetode klippekort = new Betalingsmetode(navn, klip);
        storage.storeKlippekort(klippekort);
        return klippekort;
    }

    public static Klip createKlip(int klip) {
        Klip klipper = new Klip(klip);
        storage.storeKlip(klipper);
        return klipper;
    }

}


