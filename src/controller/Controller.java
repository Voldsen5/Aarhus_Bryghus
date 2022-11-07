package controller;


import gui.OpretOrdreLinje;
import model.*;
import storage.Storage;

public class Controller {

    /**
     * Create a new Company.
     * Pre: name not empty, hours >= 0.
     */
    public static ProduktKategori createProduktkategori(String name) {
        ProduktKategori produktKategori = new ProduktKategori(name);
        Storage.storeProduktKatagori(produktKategori);
        return produktKategori;
    }

    public static Produkt createProdukt(String navn) {
        Produkt produkt = new Produkt(navn);
        Storage.storeProdukt(produkt);
        return produkt;
    }

    public static OrdreLinje createOrdreLinje(Produkt produkt, int antal) {
        OrdreLinje ordreLinje = new OrdreLinje(produkt,antal);
        Storage.storeOrdreLinjer(ordreLinje);
        return ordreLinje;
    }

    public static Kontekst createKontekst(String event) {
        Kontekst kontekst = new Kontekst(event);
        Storage.storeKontekst(kontekst);
        return kontekst;
    }

    public static Pris createPris(double beløb, Kontekst kontekst, Produkt produkt) {
        Pris pris = new Pris(beløb, kontekst, produkt);
        Storage.storePris(pris);
        return pris;
    }


    public static void addProduktTilKategori(ProduktKategori produktKategori, Produkt produkt) {
        produktKategori.addProdukt(produkt);
        produkt.setProduktKategori(produktKategori);
    }

    public static void addPristilProdukt(Pris pris, Produkt produkt) {
        produkt.addPris(pris);
    }

    public static double SamletOrdrePris() {
        double samlet = 0.0;
        for (OrdreLinje p : Storage.getOrdreLinjer()){
            samlet = samlet + p.ordreLinjePris();
        }

        return samlet;
    }

    public static ProduktMedPant createProduktMedPant(Produkt produkt,double pantPris) {
        ProduktMedPant produktMedPant = new ProduktMedPant(produkt,pantPris);
        Storage.storeProduktMedPant(produktMedPant);
        return produktMedPant;
    }

    public static void addPanttoProduktkategori(Produkt produkt, ProduktMedPant produktMedPant) {
        produktMedPant.setProdukt(produkt);
    }


    public static double samletPantPris() {
        double samlet = 0.0;
        for (ProduktMedPant p : Storage.getProduktMedPants()){
            samlet = samlet + p.getPantPris();
        }
        return samlet;
    }

    public static double procentRabat(double procent){
        double x = 0.0;
        x = ((SamletOrdrePris() * procent) / 100);
        return SamletOrdrePris() - x;
    }

    public static double fastPris(double nyPris){
        return nyPris;
    }

    public static Klippekort createKlippekort(Kunde kunde, int klip) {
        Klippekort klippekort = new Klippekort(kunde, klip);
        Storage.storeKlippekort(klippekort);
        return klippekort;
    }







//    /**
//     * Delete the company.
//     * Pre: The company has no employees.
//     */
//    public static void deleteCompany(Company company) {
//        Storage.deleteCompany(company);
//    }
//
//    /**
//     * Update the company.
//     * Pre: name not empty, hours >= 0.
//     */
//    public static void updateCompany(Company company, String name, int hours) {
//        company.setName(name);
//        company.setHours(hours);
//    }
//
//    public static ArrayList<Company> getCompanies() {
//        return Storage.getProduktkategori();
//    }

    // -------------------------------------------------------------------------

//    /**
//     * Create a new employee.
//     * Pre: name not empty, wage >= 0.
//     */
//    public static Employee createEmployee(String name, int wage) {
//        Employee employee = new Employee(name, wage);
//        Storage.storeEmployee(employee);
//        return employee;
//    }
//
//    /**
//     * Delete the employee.
//     */
//    public static void deleteEmployee(Employee employee) {
//        Company company = employee.getCompany();
//        if (company != null)
//            company.removeEmployee(employee);
//        Storage.deleteEmployee(employee);
//    }
//
//    /**
//     * Update the employee.
//     * Pre: wage >= 0.
//     */
//    public static void updateEmployee(Employee employee, String name, int wage) {
//        employee.setName(name);
//        employee.setWage(wage);
//    }
//
//    public static ArrayList<Employee> getEmployees() {
//        return Storage.getEmployees();
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Add the employee to the company.
//     * If the employee is connected to another company, this connected is removed.
//     */
//    public static void addEmployeeToCompany(Employee employee, Company company) {
//        var oldCompany = employee.getCompany();
//        if (oldCompany != null)
//            company.removeEmployee(employee);
//        company.addEmployee(employee);
//    }
//
//    /**
//     * Remove the employee's company, if the employee has a company.
//     */
//    public static void removeCompanyOfEmployee(Employee employee) {
//        var company = employee.getCompany();
//        if (company != null)
//            company.removeEmployee(employee);
//    }
//
//    //----------------------------------------------------------------------------------
//
//    public static Customer createCustomer(String name) {
//        Customer customer = new Customer(name);
//        Storage.storeCustomer(customer);
//        return customer;
//    }
//
//
//    public static void deleteCustomer(Customer customer) {
//        Storage.deleteCustomer(customer);
//    }
//
//
//    public static void updateCustomer(Customer customer, String name) {
//        customer.setName(name);
//
//    }
//
//    public static ArrayList<Customer> getCustomers() {
//        return Storage.getCustomers();
//    }





}
