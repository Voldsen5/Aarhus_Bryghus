package model;

import java.io.Serializable;

public class Statistik implements Observer, Serializable {

    private int dagligSalg;


    public Statistik(int dagligSalg) {
        this.dagligSalg = dagligSalg;
    }

    public int getDagligSalg() {
        return dagligSalg;
    }

    public void setDagligSalg(int dagligSalg) {
        this.dagligSalg = dagligSalg;
    }

    @Override
    public void update() {
        System.out.println("Dagligsag : "+dagligSalg++);
    }
}
