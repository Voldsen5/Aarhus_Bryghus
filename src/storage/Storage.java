package storage;


import model.Produkt;
import model.ProduktKategori;


import java.util.ArrayList;

public class Storage {
    private static final ArrayList<ProduktKategori> produktkategori = new ArrayList<>();
    private static final ArrayList<Produkt> produkts = new ArrayList<>();
//    private static final ArrayList<Customer> customers = new ArrayList<>();

    // -------------------------------------------------------------------------

    public static ArrayList<ProduktKategori> getProduktkategori() {
        return new ArrayList<>(produktkategori);
    }

    public static void storeCompany(ProduktKategori produktKategori) {
        produktkategori.add(produktKategori);
    }

    public static void deleteCompany(ProduktKategori produktKategori) {
        produktkategori.remove(produktKategori);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Produkt> getProdukts() {
        return new ArrayList<>(produkts);
    }

    public static void storeProdukt(Produkt produkt) {
        produkts.add(produkt);
    }

    public static void deleteEmployee(Produkt produkt) {
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
}
