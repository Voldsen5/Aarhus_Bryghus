package storage;


import model.*;


import java.util.ArrayList;

public class Storage {
    private static final ArrayList<ProduktKategori> produktkategori = new ArrayList<>();
    private static final ArrayList<Produkt> produkts = new ArrayList<>();
    private static final ArrayList<Ordre> ordrer = new ArrayList<>();
    private static final ArrayList<Kunde> kunder = new ArrayList<>();
    private static final ArrayList<OrdreLinje> ordreLinjer = new ArrayList<>();
    private static final ArrayList<Kontekst> kontekster = new ArrayList<>();
    private static final ArrayList<Pris> priser = new ArrayList<>();



    // -------------------------------------------------------------------------

    public static ArrayList<ProduktKategori> getProduktkategori() {
        return new ArrayList<>(produktkategori);
    }

    public static void storeProduktKatagori(ProduktKategori produktKategori) {
        produktkategori.add(produktKategori);
    }


    // -------------------------------------------------------------------------

    public static ArrayList<Produkt> getProdukts() {
        return new ArrayList<>(produkts);
    }

    public static void storeProdukt(Produkt produkt) {
        produkts.add(produkt);
    }

    public static void deleteProdukt(Produkt produkt) {
        produkts.remove(produkt);
    }
//
//    // -------------------------------------------------------------------------

  public static ArrayList<OrdreLinje> getOrdreLinjer() {
        return new ArrayList<>(ordreLinjer);
    }

    public static void storeOrdreLinjer(OrdreLinje ordreLinje) {
        ordreLinjer.add(ordreLinje);
    }




    public static ArrayList<Ordre> getOrdrer() {
    return new ArrayList<>(ordrer);
}

    public static void storeOrdre(Ordre ordre) {
        ordrer.add(ordre);
    }

    public static void deleteOrdre(Ordre ordre) {
        ordrer.remove(ordre);
    }

    //    // -------------------------------------------------------------------------

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public static void storeKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public static void deleteKunde(Kunde kunde) {
        kunder.remove(kunde);
    }

    //----------------------------------------------------------------------------------

    public static ArrayList<Kontekst> getKontekster() {
        return new ArrayList<>();
    }

    public static void storeKontekst(Kontekst kontekst) {
        kontekster.add(kontekst);
    }

    public static void deleteKontekst(Kontekst kontekst) {
        kontekster.remove(kontekst);
    }

    //----------------------------------------------------------------------------------

    public static ArrayList<Produkt> getPriser() {
        return new ArrayList<>();
    }

    public static void storePris(Pris pris) {
        priser.add(pris);
    }

    public static void deletePris(Pris pris) {
        priser.remove(pris);
    }
}
