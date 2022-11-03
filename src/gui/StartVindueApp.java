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
        Produkt æblebrus = Controller.createProdukt("Æblebrus");
        Produkt chips = Controller.createProdukt("Chips");
        Produkt peanuts = Controller.createProdukt("Peanuts");
        Produkt cola = Controller.createProdukt("Cola");
        Produkt nikoline = Controller.createProdukt("Nikoline");
        Produkt sevenup = Controller.createProdukt("7-Up");
        Produkt vand = Controller.createProdukt("Vand");
        Produkt ølpølser = Controller.createProdukt("Ølpølser");







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
        fadøl.addProdukt(jazzclassic);
        fadøl.addProdukt(extrapilsner);
        fadøl.addProdukt(celebration);
        fadøl.addProdukt(blondie);
        fadøl.addProdukt(forårsbryg);
        fadøl.addProdukt(indiapaleale);
        fadøl.addProdukt(julebryg);
        fadøl.addProdukt(imperialstout);
        fadøl.addProdukt(special);
        fadøl.addProdukt(æblebrus);
        fadøl.addProdukt(chips);
        fadøl.addProdukt(peanuts);
        fadøl.addProdukt(cola);
        fadøl.addProdukt(nikoline);
        fadøl.addProdukt(sevenup);
        fadøl.addProdukt(vand);
        fadøl.addProdukt(ølpølser);

        Kontekst fredagsbar = Controller.createKontekst("Fredagsbar");
        Kontekst butik = Controller.createKontekst("Butik");

        Pris prisButikKlosterbryg = Controller.createPris(36, butik, klosterbryg);
        Pris prisButikSweetGeorgiaBrown = Controller.createPris(36, butik, sweetgeorgiabrown);
        Pris prisButikExtraPilsner = Controller.createPris(36, butik, extrapilsner);
        Pris prisButikCelebration = Controller.createPris(36, butik, celebration);
        Pris prisButikBlondie = Controller.createPris(36, butik, blondie);
        Pris prisButikForårsbryg = Controller.createPris(36, butik, forårsbryg);
        Pris prisButikIndiaPaleAle = Controller.createPris(36, butik, indiapaleale);
        Pris prisButikJulebryg = Controller.createPris(36, butik, julebryg);
        Pris prisButikJuletønden = Controller.createPris(36, butik, juletønden);
        Pris prisButikOldStrongAle = Controller.createPris(36, butik, oldstrongale);
        Pris prisButikFregattenJylland = Controller.createPris(36, butik, fregattenjylland);
        Pris prisButikImperialStout = Controller.createPris(36, butik, imperialstout);
        Pris prisButikTribute = Controller.createPris(36, butik, tribute);
        Pris prisButikBlackMonster = Controller.createPris(60, butik, blackmonster);

        Pris prisFredagsbarKlosterbryg = Controller.createPris(70, fredagsbar, klosterbryg);
        Pris prisFredagsbarSweetGeorgiaBrown = Controller.createPris(70, fredagsbar, sweetgeorgiabrown);
        Pris prisFredagsbarExtraPilsner = Controller.createPris(70, fredagsbar, extrapilsner);
        Pris prisFredagsbarCelebration = Controller.createPris(70, fredagsbar, celebration);
        Pris prisFredagsbarBlondie = Controller.createPris(70, fredagsbar, blondie);
        Pris prisFredagsbarForårsbryg = Controller.createPris(70, fredagsbar, forårsbryg);
        Pris prisFredagsbarIndiaPaleAle = Controller.createPris(70, fredagsbar, indiapaleale);
        Pris prisFredagsbarJulebryg = Controller.createPris(70, fredagsbar, julebryg);
        Pris prisFredagsbarJuletønden = Controller.createPris(70, fredagsbar, juletønden);
        Pris prisFredagsbarOldStrongAle = Controller.createPris(70, fredagsbar, oldstrongale);
        Pris prisFredagsbarFregattenJylland = Controller.createPris(70, fredagsbar, fregattenjylland);
        Pris prisFredagsbarImperialStout = Controller.createPris(70, fredagsbar, imperialstout);
        Pris prisFredagsbarTribute = Controller.createPris(70, fredagsbar, tribute);
        Pris prisFredagsbarBlackMonster = Controller.createPris(100, fredagsbar, blackmonster);

        Pris prisFredagsbarFadølKlosterbryg = Controller.createPris(38, fredagsbar, klosterbryg);
        Pris prisFredagsbarFadølJazzClassic = Controller.createPris(38, fredagsbar, jazzclassic);
        Pris prisFredagsbarFadølExtraPilsner = Controller.createPris(38, fredagsbar, extrapilsner);
        Pris prisFredagsbarFadølCelebration = Controller.createPris(38, fredagsbar, celebration);
        Pris prisFredagsbarFadølBlondie = Controller.createPris(38, fredagsbar, blondie);
        Pris prisFredagsbarFadølForårsbryg = Controller.createPris(38, fredagsbar, forårsbryg);
        Pris prisFredagsbarFadølIndiaPaleAle = Controller.createPris(38, fredagsbar, indiapaleale);
        Pris prisFredagsbarFadølJulebryg = Controller.createPris(38, fredagsbar, julebryg);
        Pris prisFredagsbarFadølImperialStout = Controller.createPris(38, fredagsbar, imperialstout);
        Pris prisFredagsbarFadølSpecial = Controller.createPris(38, fredagsbar, special);

















    }
}

