package model;

import java.io.Serializable;

public class AftaltPris implements Rabat, Serializable {
    @Override
    public double udregnRabat(double aftaltPris) {
        return aftaltPris;
    }
}
