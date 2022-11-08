package model;

import storage.Storage;

public class Betalingsmetode {
    private String navn;
    private Ordre ordre;
    private Salg salg;
    private Kunde kunde;
    private int klip;

    public Betalingsmetode(String navn, int klip){
        this.navn = navn;
        this.klip = 4;
    }

    public String getNavn() {
        return navn;
    }

    public int getKlip(){
        return klip;
    }
}

