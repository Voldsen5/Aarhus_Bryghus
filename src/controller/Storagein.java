package controller;

import model.*;

import java.util.ArrayList;

public interface Storagein {


    public ArrayList<ProduktKategori> getProduktkategori();

    public  void storeProduktKatagori(ProduktKategori produktKategori);


    // -------------------------------------------------------------------------

    public  ArrayList<Produkt> getProdukts();

    public  void storeProdukt(Produkt produkt);

    public  void deleteProdukt(Produkt produkt);
//
//    // -------------------------------------------------------------------------

    public  ArrayList<OrdreLinje> getOrdreLinjer();

    public  void storeOrdreLinjer(OrdreLinje ordreLinje);


    public  ArrayList<ProduktMedPant> getProduktMedPants();

    public  void storeProduktMedPant(ProduktMedPant produktMedPant);

    public  ArrayList<Statistik> getStatistiks();

    public  void storeStatistik(Statistik statistik);


    public  ArrayList<Salg> getSalg();

    public  void storeSalg(Salg salg);


    public  ArrayList<Ordre> getOrdrer();

    public  void storeOrdre(Ordre ordre);

    public  void deleteOrdre(Ordre ordre);

    //    // -------------------------------------------------------------------------

    public  ArrayList<Kunde> getKunder();

    public  void storeKunde(Kunde kunde);

    public  void deleteKunde(Kunde kunde);

    //----------------------------------------------------------------------------------

    public  ArrayList<Kontekst> getKontekster();

    public  void storeKontekst(Kontekst kontekst);

    public  void deleteKontekst(Kontekst kontekst);

    //----------------------------------------------------------------------------------

    public ArrayList<Pris> getPriser();

    public  void storePris(Pris pris);

    public  void deletePris(Pris pris);

    //----------------------------------------------------------------------------------

    public  ArrayList<Betalingsmetode> getKlippekort();

    public  void storeKlippekort(Betalingsmetode klippekort);

    public  void removeKlip(Betalingsmetode klippekort);

    public  void storeKlip(Klip klip);

}
