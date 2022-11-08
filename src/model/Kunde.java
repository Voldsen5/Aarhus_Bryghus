package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Kunde implements Serializable {
    private String navn;
    private int alder;
    private int tlfNr;
    private String email;
   private final ArrayList<Ordre> ordrer = new ArrayList<>();

    public Kunde(String navn, int alder, int tlfNr, String email) {
        this.navn = navn;
        this.alder = alder;
        this.tlfNr = tlfNr;
        this.email = email;

    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public int getTlfNr() {
        return tlfNr;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Ordre> getOrdrer() {
        return new ArrayList<>(ordrer);
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public void setTlfNr(int tlfNr) {
        this.tlfNr = tlfNr;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void addOrdre(Ordre ordre){
        ordrer.add(ordre);
        ordre.kunde = this;
    }

    public void removeOrdre(Ordre ordre){
        ordrer.remove(ordre);
        ordre.kunde = null;
    }

}
