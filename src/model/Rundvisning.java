package model;

import java.time.LocalDateTime;

public class Rundvisning {
    private LocalDateTime dato;
    private int antalDeltagelser;
    private String navn;

    public Rundvisning(LocalDateTime dato, int antalDeltagelser, String navn) {
        this.dato = dato;
        this.antalDeltagelser = antalDeltagelser;
        this.navn = navn;
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
