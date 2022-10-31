package controller;


import model.Kunde;
import model.Ordre;
import model.Rabat;
import model.Salg;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller2 {

    /**
     * Create a new Company.
     * Pre: name not empty, hours >= 0.
     */
    public static Ordre createOrdre(int antal, double samletPris, LocalDate dato, Kunde kunde, String status) {
        Ordre ordre = new Ordre(antal, samletPris, dato, kunde, status);
        Storage.storeOrdre(ordre);
        return ordre;
    }

    /**
     * Delete the company.
     * Pre: The company has no employees.
     */
    public static void deleteOrdre(Ordre ordre) {
        Storage.deleteOrdre(ordre);
    }

    /**
     * Update the company.
     * Pre: name not empty, hours >= 0.
     */
    public static void updateOrdre(Ordre ordre, int antal, double samletPris, LocalDate dato, Kunde kunde, String staus) {
        ordre.setAntal(antal);
        ordre.setSamletPris(samletPris);
        ordre.getKunde(kunde);
        ordre.setStatus(staus);

    }

    public static ArrayList<Ordre> getOrdre() {
        return Storage.getOrdre();
    }

    // -------------------------------------------------------------------------

    /**
     * Create a new employee.
     * Pre: name not empty, wage >= 0.
     */
    public static Kunde createKunde(String name, int alder, int tlFNr, String email) {
        Kunde kunde = new Kunde(name, alder, tlFNr, email);
        Storage.storeKunde(kunde);
        return kunde;
    }

    /**
     * Delete the employee.
     */
    public static void deleteKunde(Kunde kunde) {
        Storage.deleteKunde(kunde);
    }

    /**
     * Update the employee.
     * Pre: wage >= 0.
     */


    public static ArrayList<Kunde> getKunde() {
        return Storage.getKunde();
    }
}
    // -------------------------------------------------------------------------

