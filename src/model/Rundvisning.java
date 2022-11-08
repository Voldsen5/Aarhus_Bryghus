package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Rundvisning implements Serializable {
    private LocalDateTime dato;
    private int antalDeltagelser;
    private String navn;

    Produkt produkt;

    Rundvisning(LocalDateTime dato, int antalDeltagelser, String navn) {
        this.dato = dato;
        this.antalDeltagelser = antalDeltagelser;
        this.navn = navn;
    }

    public Produkt getProdukt(){
        return produkt;
    }

    public LocalDateTime getDato() {
        return dato;
    }

    public void setDato(LocalDateTime dato) {
        this.dato = dato;
    }

    public int getAntalDeltagelser() {
        return antalDeltagelser;
    }

    public void setAntalDeltagelser(int antalDeltagelser) {
        this.antalDeltagelser = antalDeltagelser;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
