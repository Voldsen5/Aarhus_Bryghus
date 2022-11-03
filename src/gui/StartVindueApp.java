package gui;

import controller.Controller;
import javafx.application.Application;
import model.*;


public class StartVindueApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(StartSide.class);
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
        Produkt klosterbryg = Controller.createProdukt("Klosterbryg");
        Produkt sweetgeorgiabrown = Controller.createProdukt("Sweet Georgia Brown");
        Produkt extrapilsner = Controller.createProdukt("Extra Pilsner");
        Produkt celebration = Controller.createProdukt("Celebration");
        Produkt blondie = Controller.createProdukt("Blondie");
        Produkt forårsbryg = Controller.createProdukt("Forårsbryg");
        Produkt indiapaleale = Controller.createProdukt("India Pale Ale");
        Produkt julebryg = Controller.createProdukt("Julebryg");
        Produkt juletønden = Controller.createProdukt("Juletønden");
        Produkt oldstrongale = Controller.createProdukt("Old Strong Ale");
        Produkt fregattenjylland = Controller.createProdukt("Fregatten Jylland");
        Produkt imperialstout = Controller.createProdukt("Imperial Stout");
        Produkt tribute = Controller.createProdukt("Tribute");
        Produkt blackmonster = Controller.createProdukt("Black Monster");

        Produkt jazzclassic = Controller.createProdukt("Jazz Classic");
        Produkt special = Controller.createProdukt("Special");






        flaskeØl.addProdukt(klosterbryg);
        flaskeØl.addProdukt(sweetgeorgiabrown);
        flaskeØl.addProdukt(extrapilsner);
        flaskeØl.addProdukt(celebration);
        flaskeØl.addProdukt(blondie);
        flaskeØl.addProdukt(forårsbryg);
        flaskeØl.addProdukt(indiapaleale);
        flaskeØl.addProdukt(julebryg);
        flaskeØl.addProdukt(juletønden);
        flaskeØl.addProdukt(oldstrongale);
        flaskeØl.addProdukt(fregattenjylland);
        flaskeØl.addProdukt(imperialstout);
        flaskeØl.addProdukt(tribute);
        flaskeØl.addProdukt(blackmonster);



        fadøl.addProdukt(klosterbryg);
        fadøl.addProdukt(extrapilsner);

        Kontekst fredagsbar = Controller.createKontekst("Fredagsbar");
        Kontekst butik = Controller.createKontekst("Butik");

        Pris prisButikKlosterbryg = Controller.createPris(36, fredagsbar, klosterbryg);
        Pris prisButikSweetGeorgiaBrown = Controller.createPris(36, fredagsbar, sweetgeorgiabrown);










    }
}

