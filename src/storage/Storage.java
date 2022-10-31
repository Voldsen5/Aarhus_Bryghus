package storage;


import model.Kunde;
import model.Ordre;
import model.Produkt;
import model.ProduktKategori;


import java.util.ArrayList;

public class Storage {
    private static final ArrayList<ProduktKategori> produktkategori = new ArrayList<>();
    private static final ArrayList<Produkt> produkts = new ArrayList<>();
    private static final ArrayList<Ordre> ordrer = new ArrayList<>();
    private static final ArrayList<Kunde> kunder = new ArrayList<>();


    // -------------------------------------------------------------------------

    public static ArrayList<ProduktKategori> getProduktkategori() {
        return new ArrayList<>(produktkategori);
    }

    public static void storeProduktKatagori(ProduktKategori produktKategori) {
        produktkategori.add(produktKategori);
    }

    public static void deleteProduktKatagori(ProduktKategori produktKategori) {
        produktkategori.remove(produktKategori);
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
//
//    public static ArrayList<Customer> getCustomers() {
//        return new ArrayList<>(customers);
//    }
//
//    public static void storeCustomer(Customer customer) {
//        customers.add(customer);
//    }
//
//    public static void deleteCustomer(Customer customer) {
//        customers.remove(customer);
//    }
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

}
