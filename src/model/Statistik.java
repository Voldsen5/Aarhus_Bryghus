package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Statistik implements Observer, Serializable {

    private int dagligSalg;
    private LocalDate dato;


    public Statistik(LocalDate dato) {
        this.dagligSalg = 0;
        this.dato = dato;
    }

    public int getDagligSalg() {
        return dagligSalg;
    }

    public void setDagligSalg() {
        dagligSalg = dagligSalg+1;
    }

    @Override
    public void update() {
        System.out.println("Dagligsag : "+" Antal : "+dagligSalg+"  Dato: "+dato);
    }

    @Override
    public String toString() {
        return "Dagligsag : "+" Antal: "+dagligSalg+"  Dato: "+dato;
    }
}
