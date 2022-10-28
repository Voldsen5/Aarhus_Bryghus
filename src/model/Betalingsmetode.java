package model;

public class Betalingsmetode {
    private String navn;
    private Ordre ordre;
    private Salg salg;

    public Betalingsmetode(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }


}

