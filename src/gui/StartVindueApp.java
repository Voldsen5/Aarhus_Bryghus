package gui;

import controller.Controller;
import javafx.application.Application;
import model.*;


public class StartVindueApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(OpretOrdreLinje.class);
    }

    public static void initStorage() {
        //ProduktKategorier
        ProduktKategori flaskeØl =  Controller.createProduktkategori("Flaskeøl");
        ProduktKategori fadøl =  Controller.createProduktkategori("Fadøl");
        ProduktKategori spiritus =  Controller.createProduktkategori("Spiritus");
        ProduktKategori fustage =  Controller.createProduktkategori("Fustage");
        ProduktKategori kulsyre =  Controller.createProduktkategori("Kulsyre");
        ProduktKategori malt =  Controller.createProduktkategori("Malt");
        ProduktKategori anlæg =  Controller.createProduktkategori("Anlæg");
        ProduktKategori rundvisning =  Controller.createProduktkategori("Rundvisning");


        //Produkter
        Produkt klosterbryg = Controller.createProdukt("Klosterbryg", 36);
        Produkt sweetgeorgiabrown = Controller.createProdukt("Sweet Georgia Brown", 36);
        Produkt extrapilsner = Controller.createProdukt("Extra Pilsner", 36);
        flaskeØl.addProdukt(klosterbryg);
        flaskeØl.addProdukt(sweetgeorgiabrown);
        flaskeØl.addProdukt(extrapilsner);
        fadøl.addProdukt(klosterbryg);
        fadøl.addProdukt(extrapilsner);

        Kontekst fredagsbar = Controller.createKontekst("Fredagsbar");
        Kontekst butik = Controller.createKontekst("Butik");







    }
}

