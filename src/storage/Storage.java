package storage;


import model.Produkt;
import model.ProduktKategori;


import java.util.ArrayList;

public class Storage {
    private static final ArrayList<ProduktKategori> produktkategori = new ArrayList<>();
//    private static final ArrayList<Employee> employees = new ArrayList<>();
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

//    public static ArrayList<Employee> getEmployees() {
//        return new ArrayList<>(employees);
//    }
//
//    public static void storeEmployee(Employee employee) {
//        employees.add(employee);
//    }
//
//    public static void deleteEmployee(Employee employee) {
//        employees.remove(employee);
//    }
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
