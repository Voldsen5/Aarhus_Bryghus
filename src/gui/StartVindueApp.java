package gui;

import controller.Controller;
import javafx.application.Application;
import model.*;


public class StartVindueApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(OrdrePane.class);
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
//
//        //Produkter
//        Produkt pilsner = Controller.createProdukt("Pilsner", 160);
//        Produkt stavns = Controller.createProdukt("sortØl", 150);
//        flaskeØl.addProdukt(pilsner);
//        fadøl.addProdukt(pilsner);
//        spiritus.addProdukt(stavns);







    }
}

