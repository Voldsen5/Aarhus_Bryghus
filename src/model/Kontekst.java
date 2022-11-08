package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Kontekst implements Serializable {
    private String event;
    private final ArrayList<Pris> priser = new ArrayList<>();

    public Kontekst(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public ArrayList<Pris> getPriser() {
        return new ArrayList<>(priser);
    }

    /** Pre: The pris is not connected to a kontekst. */
    public void addPris(Pris pris) {
        priser.add(pris);
        pris.kontekst = this;
    }

    /** Pre: The pris is connected to this kontekst. */
    public void removePris(Pris pris) {
        priser.remove(pris);
        pris.kontekst = null;
    }
}
