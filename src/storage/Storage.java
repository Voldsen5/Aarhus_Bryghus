package storage;


import controller.Storagein;
import model.*;

import java.io.*;
import java.util.ArrayList;

public class Storage implements Storagein, Serializable {
    private  final ArrayList<ProduktKategori> produktkategori = new ArrayList<>();
    private  final ArrayList<Produkt> produkts = new ArrayList<>();
    private  final ArrayList<Ordre> ordrer = new ArrayList<>();
    private  final ArrayList<Kunde> kunder = new ArrayList<>();
    private  final ArrayList<OrdreLinje> ordreLinjer = new ArrayList<>();
    private  final ArrayList<Kontekst> kontekster = new ArrayList<>();
    private  final ArrayList<Pris> priser = new ArrayList<>();
    private  final ArrayList<Statistik> statistiks = new ArrayList<>();
    private  final ArrayList<Salg> salgs = new ArrayList<>();
    private  final ArrayList<ProduktMedPant> produktMedPants = new ArrayList<>();
    private  final ArrayList<Betalingsmetode> klippekorts = new ArrayList<>();
    private  final ArrayList<Klip> klips = new ArrayList<>();




    // -------------------------------------------------------------------------

    public  ArrayList<ProduktKategori> getProduktkategori() {
        return produktkategori;
    }

    public  void storeProduktKatagori(ProduktKategori produktKategori) {
        produktkategori.add(produktKategori);
    }


    // -------------------------------------------------------------------------

    public  ArrayList<Produkt> getProdukts() {
        return produkts;
    }

    public  void storeProdukt(Produkt produkt) {
        produkts.add(produkt);
    }

    public  void deleteProdukt(Produkt produkt) {
        produkts.remove(produkt);
    }
//
//    // -------------------------------------------------------------------------

  public  ArrayList<OrdreLinje> getOrdreLinjer() {
        return ordreLinjer;
    }

    public  void storeOrdreLinjer(OrdreLinje ordreLinje) {
        ordreLinjer.add(ordreLinje);
    }


    public  ArrayList<ProduktMedPant> getProduktMedPants() {
        return produktMedPants;
    }

    public  void storeProduktMedPant(ProduktMedPant produktMedPant) {
        produktMedPants.add(produktMedPant);
    }

    public  ArrayList<Statistik> getStatistiks() {
        return statistiks;
    }

    public  void storeStatistik(Statistik statistik) {
        statistiks.add(statistik);
    }


    public  ArrayList<Salg> getSalg() {
        return salgs;
    }

    public  void storeSalg(Salg salg) {
        salgs.add(salg);
    }


    public  ArrayList<Ordre> getOrdrer() {
    return ordrer;
}

    public  void storeOrdre(Ordre ordre) {
        ordrer.add(ordre);
    }

    public  void deleteOrdre(Ordre ordre) {
        ordrer.remove(ordre);
    }

    //    // -------------------------------------------------------------------------

    public  ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public  void storeKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public  void deleteKunde(Kunde kunde) {
        kunder.remove(kunde);
    }

    //----------------------------------------------------------------------------------

    public  ArrayList<Kontekst> getKontekster() {
        return kontekster;
    }

    public  void storeKontekst(Kontekst kontekst) {
        kontekster.add(kontekst);
    }

    public  void deleteKontekst(Kontekst kontekst) {
        kontekster.remove(kontekst);
    }

    //----------------------------------------------------------------------------------
    public  ArrayList<Pris> getPriser() {
        return priser;
    }

    public  void storePris(Pris pris) {
        priser.add(pris);
    }

    public  void deletePris(Pris pris) {
        priser.remove(pris);
    }

    //----------------------------------------------------------------------------------

    public  ArrayList<Betalingsmetode> getKlippekort() {
        return klippekorts;
    }

    public  void storeKlippekort(Betalingsmetode klippekort) {
        klippekorts.add(klippekort);
    }

    public  void removeKlip(Betalingsmetode klippekort) {
        klippekorts.remove(klippekort);
    }

    public  void storeKlip(Klip klip) {
        klips.add(klip);
    }


    public static Storage loadStorage() {
        String fileName = "storageGem.ser";
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            Storage storage = (Storage) obj;
            System.out.println("Storage loaded from file " + fileName);
            return storage;
        } catch (ClassCastException ex) {
            System.out.println("Class of serialized object changed");
            System.out.println(ex);
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Class of serialized object not found");
            System.out.println(ex);
            return null;
        } catch (IOException ex) {
            System.out.println("Error reading file");
            System.out.println(ex);
            return null;
        }
    }

    public static void saveStorage(Storage storage) {
        String fileName = "storageGem.ser";
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(storage);
            System.out.println("Storage saved in file " + fileName);
        } catch (IOException ex) {
            System.out.println("Error writing file");
            System.out.println(ex);
            throw new RuntimeException();
        }
    }


}
