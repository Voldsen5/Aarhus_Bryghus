package model;

import java.time.LocalDate;

public class Ordre {
    private int antal;
    private double samletPris;
    private LocalDate dato;
    Kunde kunde;
    private String status;
    Rabat rabat;
    Salg salg;

    public Ordre(int antal, double samletPris, LocalDate dato, Kunde kunde, String status) {
        this.antal = antal;
        this.samletPris = samletPris;
        this.dato = dato;
        this.kunde = kunde;
        this.status = status;
    }

    public int getAntal() {
        return antal;
    }

    public double getSamletPris() {
        return samletPris;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public Kunde getKunde(Kunde kunde) {
        return this.kunde;
    }

    public String getStatus() {
        return status;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public void setSamletPris(double samletPris) {
        this.samletPris = samletPris;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRabat(Rabat rabat) {
        this.rabat = rabat;
    }

    public void setSalg(Salg salg) {
        this.salg = salg;
    }


}
