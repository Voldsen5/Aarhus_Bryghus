package gui;

import controller.Controller;
import javafx.application.Application;
import model.*;
import storage.Storage;

import java.io.*;


public class StartVindueApp {

    public static void main(String[] args) {
        initStorage();
//      Storage p = new Storage();
      Storage p = getSaveStorage();
        saveStorage(p);
//        Storage k = getSaveStorage();
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
        Produkt sweetgeorgiabrown = Controller.createProdukt("Georgia Brown");
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

        Produkt whisky45ProcentRør = Controller.createProdukt("Whisky 45% 50cl rør");
        Produkt whisky4cl = Controller.createProdukt("Whisky 4 cl");
        Produkt whisky43ProcentRør = Controller.createProdukt("Whisky 43% 50cl rør");
        Produkt whiskyGlasBrikker = Controller.createProdukt("2*whisky glas + brikker");
        Produkt liquorofAarhus = Controller.createProdukt("Liquor of Aarhus");
        Produkt lynggin50cl = Controller.createProdukt("Lyng gin 50 cl");
        Produkt lynggin4cl = Controller.createProdukt("Lyng gin 4 cl");

        Produkt klosterbryg20liter = Controller.createProdukt("Klosterbryg, 20L");
        Produkt jazzClassic25liter = Controller.createProdukt("Jazz Classic, 25L");
        Produkt extraPilsner25liter = Controller.createProdukt("Extra Pilsner, 25L");
        Produkt celebration20liter = Controller.createProdukt("Celebration, 20L");
        Produkt blondie25liter = Controller.createProdukt("Blondie, 25L");
        Produkt forårsbryg20liter = Controller.createProdukt("Forårsbryg, 20L");
        Produkt indiapaleale20liter = Controller.createProdukt("India Pale Ale, 20L");
        Produkt Julebryg20liter = Controller.createProdukt("Julebryg, 20L");
        Produkt imperialstout20liter = Controller.createProdukt("Imperial Stout, 20L");
        Produkt pant = Controller.createProdukt("Pant");













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

        spiritus.addProdukt(whisky45ProcentRør);
        spiritus.addProdukt(whisky4cl);
        spiritus.addProdukt(whisky43ProcentRør);
        spiritus.addProdukt(whiskyGlasBrikker);
        spiritus.addProdukt(liquorofAarhus);
        spiritus.addProdukt(lynggin50cl);
        spiritus.addProdukt(lynggin4cl);

        fustage.addProdukt(klosterbryg20liter);
        fustage.addProdukt(jazzClassic25liter);
        fustage.addProdukt(extraPilsner25liter);
        fustage.addProdukt(celebration20liter);
        fustage.addProdukt(blondie25liter);
        fustage.addProdukt(forårsbryg20liter);
        fustage.addProdukt(indiapaleale20liter);
        fustage.addProdukt(Julebryg20liter);
        fustage.addProdukt(imperialstout20liter);
        fustage.addProdukt(pant);

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
        Pris prisFredagsbarFadølÆblebrus = Controller.createPris(15, fredagsbar, æblebrus);
        Pris prisFredagsbarFadølChips = Controller.createPris(10, fredagsbar, chips);
        Pris prisFredagsbarFadølPeanuts = Controller.createPris(15, fredagsbar, peanuts);
        Pris prisFredagsbarFadølCola = Controller.createPris(15, fredagsbar, cola);
        Pris prisFredagsbarFadølNikoline = Controller.createPris(15, fredagsbar, nikoline);
        Pris prisFredagsbarFadøl7Up = Controller.createPris(15, fredagsbar, sevenup);
        Pris prisFredagsbarFadølVand = Controller.createPris(10, fredagsbar, vand);
        Pris prisFredagsbarFadølØlpølser = Controller.createPris(30, fredagsbar, ølpølser);

        Pris prisFredagsbarWhisky45procentRør = Controller.createPris(599, fredagsbar, whisky45ProcentRør);
        Pris prisButikWhisky45procentRør = Controller.createPris(599, butik, whisky45ProcentRør);
        Pris prisFredagsbarWhisky4cl = Controller.createPris(50, fredagsbar, whisky4cl);
        Pris prisFredagsbarWhisky43procentRør = Controller.createPris(499, fredagsbar, whisky43ProcentRør);
        Pris prisButikWhisky43procentRør = Controller.createPris(499, butik, whisky43ProcentRør);
        Pris prisFredagsbarWhiskyGlasBrikker = Controller.createPris(80, fredagsbar, whiskyGlasBrikker);
        Pris prisButikWhiskyGlasBrikker = Controller.createPris(80, butik, whiskyGlasBrikker);
        Pris prisFredagsbarLiquorofAarhus = Controller.createPris(175, fredagsbar, liquorofAarhus);
        Pris prisButikLiquorofAarhus = Controller.createPris(175, butik, liquorofAarhus);
        Pris prisFredagsbarLyngGin50cl = Controller.createPris(350, fredagsbar, lynggin50cl);
        Pris prisButikLyngGin50cl = Controller.createPris(350, butik, lynggin50cl);
        Pris prisFredagsbarLyngGin4cl = Controller.createPris(40, fredagsbar, lynggin4cl);

        Pris prisButikFustageKlosterbryg = Controller.createPris(775, butik, klosterbryg20liter);
        Pris prisButikFustageJazzClassic = Controller.createPris(625, butik, jazzClassic25liter);
        Pris prisButikFustageExtraPilsner = Controller.createPris(575, butik, extraPilsner25liter);
        Pris prisButikFustageCelebration = Controller.createPris(775, butik, celebration20liter);
        Pris prisButikFustageBlondie = Controller.createPris(700, butik, blondie25liter);
        Pris prisButikFustageForårsbryg = Controller.createPris(775, butik, forårsbryg20liter);
        Pris prisButikFustageIndiaPaleAle = Controller.createPris(775, butik, indiapaleale20liter);
        Pris prisButikFustageJulebryg = Controller.createPris(775, butik, Julebryg20liter);
        Pris prisButikFustageImperialStout = Controller.createPris(775, butik, imperialstout20liter);
        Pris prisButikFustagePant = Controller.createPris(200, butik, pant);






















    }

    public static void saveStorage(Storage temp){
    String fileName = "Aarhus_Bryghus\\src\\storage\\storageGem.ser";
    try(
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            ) {
               objOut.writeObject(temp);
                } catch (Exception e){
                System.out.println(e);
                }
    }
    public static Storage getSaveStorage(){
        try(
                FileInputStream fileIn = new FileInputStream("Aarhus_Bryghus\\src\\storage\\storageGem.ser");
                ObjectInputStream objIn = new ObjectInputStream(fileIn);

        )
        {
            Object obj = objIn.readObject();
            return (Storage) obj;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }



//    public static void saveStorage3(ArrayList<Ordre>temp){
//
//    }
//    public static void saveStorage4(ArrayList<OrdreLinje>temp){
//
//    }
//    public static void saveStorage5(ArrayList<Pris>temp){
//
//    }
//    public static void saveStorage6(ArrayList<Statistik>temp){
//
//    }
//    public static void saveStorage7(ArrayList<Salg>temp){
//
//    }



}

