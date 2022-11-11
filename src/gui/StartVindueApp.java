package gui;

import controller.Controller;
import javafx.application.Application;
import model.*;
import storage.Storage;

import java.io.*;


public class StartVindueApp {

    public static void main(String[] args) {
        Storage storage = Storage.loadStorage();
        if (storage == null){
            storage = new Storage();
            System.out.println("Empty Storage created");
        }
        Controller.setStorage(storage);
        initStorage();
        Application.launch(StartSide.class);
        Storage.saveStorage(Controller.getStorage());
    }

    public static void initStorage() {
        //ProduktKategorier
        ProduktKategori flaskeØl = Controller.createProduktkategori("Flaskeøl");
        ProduktKategori fadøl = Controller.createProduktkategori("Fadøl");
        ProduktKategori spiritus = Controller.createProduktkategori("Spiritus");
        ProduktKategori fustage = Controller.createProduktkategori("Fustage");
        ProduktKategori kulsyre = Controller.createProduktkategori("Kulsyre");
        ProduktKategori malt = Controller.createProduktkategori("Malt");
        ProduktKategori beklædning = Controller.createProduktkategori("Beklædning");
        ProduktKategori anlæg = Controller.createProduktkategori("Anlæg");
        ProduktKategori glas = Controller.createProduktkategori("Glas");
        ProduktKategori sampakning = Controller.createProduktkategori("Sampakning");
        ProduktKategori rundvisning = Controller.createProduktkategori("Rundvisning");
        ProduktKategori klippekort = Controller.createProduktkategori("Klippekort");


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

        Controller.createProduktMedPant(klosterbryg20liter, 200);
        Controller.createProduktMedPant(jazzClassic25liter, 200);
        Controller.createProduktMedPant(extraPilsner25liter, 200);
        Controller.createProduktMedPant(celebration20liter, 200);
        Controller.createProduktMedPant(blondie25liter, 200);
        Controller.createProduktMedPant(forårsbryg20liter, 200);
        Controller.createProduktMedPant(indiapaleale20liter, 200);
        Controller.createProduktMedPant(Julebryg20liter, 200);
        Controller.createProduktMedPant(imperialstout20liter, 200);


        Produkt kulsyre6kg = Controller.createProdukt("Kulsyre 6kg");
        Produkt kulsyrePant = Controller.createProdukt("Kulsyre Pant");
        Produkt kulsyre4kg = Controller.createProdukt("Kulsyre 4kg");
        Produkt kulsyre10kg = Controller.createProdukt("Kulsyre 10kg");

        Produkt malt25kgSæk = Controller.createProdukt("Malt 25kg sæk");

        Produkt tshirt = Controller.createProdukt("T-shirt");
        Produkt polo = Controller.createProdukt("Polo");
        Produkt cap = Controller.createProdukt("Cap");

        Produkt anlæg1Hane = Controller.createProdukt("Anlæg 1 Hane");
        Produkt anlæg2Haner = Controller.createProdukt("Anlæg 2 Haner");
        Produkt barFlereHaner = Controller.createProdukt("Bar med flere haner");
        Produkt anlægLevering = Controller.createProdukt("Anlæg Levering");
        Produkt krus = Controller.createProdukt("Krus");

        Produkt drikkeglas = Controller.createProdukt("Glas");

        Produkt gaveæske2Øl2Glas = Controller.createProdukt("Gaveæske 2 øl, 2 glas");
        Produkt gaveæske4Øl = Controller.createProdukt("Gaveæske 4 øl");
        Produkt trækasse6Øl = Controller.createProdukt("Trækasse 6 øl");
        Produkt gavekurv6Øl2Glas = Controller.createProdukt("Gavekurv 6 øl, 2 glas");
        Produkt trækasse6Øl6Glas = Controller.createProdukt("Gaveæske 2 øl, 2 glas");
        Produkt trækasse12Øl = Controller.createProdukt("Trækasse 12 øl");
        Produkt papkasse12øl = Controller.createProdukt("Papkasse 12 øl");

        Produkt rundvisningPrPersonDag = Controller.createProdukt("Rundvisning pr person pr dag");

        Produkt klippekort4Klip = Controller.createProdukt("Klippekort, 4 klip");


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

//        klosterbryg20liter.setPantPris(200);
//        jazzClassic25liter.setPantPris(200);
//        extraPilsner25liter.setPantPris(200);
//        celebration20liter.setPantPris(200);
//        blondie25liter.setPantPris(200);
//        forårsbryg20liter.setPantPris(200);
//        indiapaleale20liter.setPantPris(200);
//        Julebryg20liter.setPantPris(200);
//        imperialstout20liter.setPantPris(200);

        kulsyre.addProdukt(kulsyre6kg);
        kulsyre.addProdukt(kulsyrePant);
        kulsyre.addProdukt(kulsyre4kg);
        kulsyre.addProdukt(kulsyre10kg);

        malt.addProdukt(malt25kgSæk);

        beklædning.addProdukt(tshirt);
        beklædning.addProdukt(polo);
        beklædning.addProdukt(cap);

        anlæg.addProdukt(anlæg1Hane);
        anlæg.addProdukt(anlæg2Haner);
        anlæg.addProdukt(barFlereHaner);
        anlæg.addProdukt(anlægLevering);
        anlæg.addProdukt(krus);

        glas.addProdukt(drikkeglas);

        sampakning.addProdukt(gaveæske2Øl2Glas);
        sampakning.addProdukt(gaveæske4Øl);
        sampakning.addProdukt(trækasse6Øl);
        sampakning.addProdukt(gavekurv6Øl2Glas);
        sampakning.addProdukt(trækasse6Øl6Glas);
        sampakning.addProdukt(trækasse12Øl);
        sampakning.addProdukt(papkasse12øl);

        rundvisning.addProdukt(rundvisningPrPersonDag);

        klippekort.addProdukt(klippekort4Klip);


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

//        Pris prisFredagsbarKlosterbryg = Controller.createPris(70, fredagsbar, klosterbryg);
//        Pris prisFredagsbarSweetGeorgiaBrown = Controller.createPris(70, fredagsbar, sweetgeorgiabrown);
//        Pris prisFredagsbarExtraPilsner = Controller.createPris(70, fredagsbar, extrapilsner);
//        Pris prisFredagsbarCelebration = Controller.createPris(70, fredagsbar, celebration);
//        Pris prisFredagsbarBlondie = Controller.createPris(70, fredagsbar, blondie);
//        Pris prisFredagsbarForårsbryg = Controller.createPris(70, fredagsbar, forårsbryg);
//        Pris prisFredagsbarIndiaPaleAle = Controller.createPris(70, fredagsbar, indiapaleale);
//        Pris prisFredagsbarJulebryg = Controller.createPris(70, fredagsbar, julebryg);
//        Pris prisFredagsbarJuletønden = Controller.createPris(70, fredagsbar, juletønden);
//        Pris prisFredagsbarOldStrongAle = Controller.createPris(70, fredagsbar, oldstrongale);
//        Pris prisFredagsbarFregattenJylland = Controller.createPris(70, fredagsbar, fregattenjylland);
//        Pris prisFredagsbarImperialStout = Controller.createPris(70, fredagsbar, imperialstout);
//        Pris prisFredagsbarTribute = Controller.createPris(70, fredagsbar, tribute);
//        Pris prisFredagsbarBlackMonster = Controller.createPris(100, fredagsbar, blackmonster);
//
//        Pris prisFredagsbarFadølKlosterbryg = Controller.createPris(38, fredagsbar, klosterbryg);
//        Pris prisFredagsbarFadølJazzClassic = Controller.createPris(38, fredagsbar, jazzclassic);
//        Pris prisFredagsbarFadølExtraPilsner = Controller.createPris(38, fredagsbar, extrapilsner);
//        Pris prisFredagsbarFadølCelebration = Controller.createPris(38, fredagsbar, celebration);
//        Pris prisFredagsbarFadølBlondie = Controller.createPris(38, fredagsbar, blondie);
//        Pris prisFredagsbarFadølForårsbryg = Controller.createPris(38, fredagsbar, forårsbryg);
//        Pris prisFredagsbarFadølIndiaPaleAle = Controller.createPris(38, fredagsbar, indiapaleale);
//        Pris prisFredagsbarFadølJulebryg = Controller.createPris(38, fredagsbar, julebryg);
//        Pris prisFredagsbarFadølImperialStout = Controller.createPris(38, fredagsbar, imperialstout);
//        Pris prisFredagsbarFadølSpecial = Controller.createPris(38, fredagsbar, special);
//        Pris prisFredagsbarFadølÆblebrus = Controller.createPris(15, fredagsbar, æblebrus);
//        Pris prisFredagsbarFadølChips = Controller.createPris(10, fredagsbar, chips);
//        Pris prisFredagsbarFadølPeanuts = Controller.createPris(15, fredagsbar, peanuts);
//        Pris prisFredagsbarFadølCola = Controller.createPris(15, fredagsbar, cola);
//        Pris prisFredagsbarFadølNikoline = Controller.createPris(15, fredagsbar, nikoline);
//        Pris prisFredagsbarFadøl7Up = Controller.createPris(15, fredagsbar, sevenup);
//        Pris prisFredagsbarFadølVand = Controller.createPris(10, fredagsbar, vand);
//        Pris prisFredagsbarFadølØlpølser = Controller.createPris(30, fredagsbar, ølpølser);
        //---------------------------------------------------------------------------------------
//        //pris med klip
//        Pris prisFredagsbarKlosterbrygMedKlip = Controller.createPrisMedKlip(70, fredagsbar, klosterbryg,Controller.createKlip(2));
//        Pris prisFredagsbarSweetGeorgiaBrownMedKlip = Controller.createPrisMedKlip(70, fredagsbar, sweetgeorgiabrown,Controller.createKlip(2));
//        Pris prisFredagsbarExtraPilsnerMedKlip = Controller.createPrisMedKlip(70, fredagsbar, extrapilsner,Controller.createKlip(2));
//        Pris prisFredagsbarCelebrationMedKlip = Controller.createPrisMedKlip(70, fredagsbar, celebration, Controller.createKlip(2));
//        Pris prisFredagsbarBlondieMedKlip = Controller.createPrisMedKlip(70, fredagsbar, blondie,Controller.createKlip(2));
//        Pris prisFredagsbarForårsbrygMedKlip = Controller.createPrisMedKlip(70, fredagsbar, forårsbryg,Controller.createKlip(2));
//        Pris prisFredagsbarIndiaPaleAleMedKlip = Controller.createPrisMedKlip(70, fredagsbar, indiapaleale,Controller.createKlip(2));
//        Pris prisFredagsbarJulebrygMedKlip = Controller.createPrisMedKlip(70, fredagsbar, julebryg,Controller.createKlip(2));
//        Pris prisFredagsbarJuletøndenMedKlip = Controller.createPrisMedKlip(70, fredagsbar, juletønden,Controller.createKlip(2));
//        Pris prisFredagsbarOldStrongAleMedKlip = Controller.createPrisMedKlip(70, fredagsbar, oldstrongale,Controller.createKlip(2));
//        Pris prisFredagsbarFregattenJyllandMedKlip = Controller.createPrisMedKlip(70, fredagsbar, fregattenjylland,Controller.createKlip(2));
//        Pris prisFredagsbarImperialStoutMedKlip = Controller.createPrisMedKlip(70, fredagsbar, imperialstout,Controller.createKlip(2));
//        Pris prisFredagsbarTributeMedKlip = Controller.createPrisMedKlip(70, fredagsbar, tribute,Controller.createKlip(2));
//        Pris prisFredagsbarBlackMonsterMedKlip = Controller.createPrisMedKlip(100, fredagsbar, blackmonster,Controller.createKlip(3));
//
//        Pris prisFredagsbarFadølKlosterbrygMedKlip = Controller.createPrisMedKlip(38, fredagsbar, klosterbryg,Controller.createKlip(1));
//        Pris prisFredagsbarFadølJazzClassicMedKlip = Controller.createPrisMedKlip(38, fredagsbar, jazzclassic,Controller.createKlip(1));
//        Pris prisFredagsbarFadølExtraPilsnerMedKlip = Controller.createPrisMedKlip(38, fredagsbar, extrapilsner,Controller.createKlip(1));
//        Pris prisFredagsbarFadølCelebrationMedKlip = Controller.createPrisMedKlip(38, fredagsbar, celebration,Controller.createKlip(1));
//        Pris prisFredagsbarFadølBlondieMedKlip = Controller.createPrisMedKlip(38, fredagsbar, blondie,Controller.createKlip(1));
//        Pris prisFredagsbarFadølForårsbrygMedKlip = Controller.createPrisMedKlip(38, fredagsbar, forårsbryg,Controller.createKlip(1));
//        Pris prisFredagsbarFadølIndiaPaleAleMedKlip = Controller.createPrisMedKlip(38, fredagsbar, indiapaleale,Controller.createKlip(1));
//        Pris prisFredagsbarFadølJulebrygMedKlip = Controller.createPrisMedKlip(38, fredagsbar, julebryg,Controller.createKlip(1));
//        Pris prisFredagsbarFadølImperialStoutMedKlip = Controller.createPrisMedKlip(38, fredagsbar, imperialstout,Controller.createKlip(1));
//        Pris prisFredagsbarFadølSpecialMedKlip = Controller.createPrisMedKlip(38, fredagsbar, special,Controller.createKlip(1));
//        Pris prisFredagsbarFadølÆblebrus = Controller.createPris(15, fredagsbar, æblebrus);
        Pris prisFredagsbarFadølChips = Controller.createPris(10, fredagsbar, chips);
        Pris prisFredagsbarFadølPeanuts = Controller.createPris(15, fredagsbar, peanuts);
        Pris prisFredagsbarFadølCola = Controller.createPris(15, fredagsbar, cola);
        Pris prisFredagsbarFadølNikoline = Controller.createPris(15, fredagsbar, nikoline);
        Pris prisFredagsbarFadøl7Up = Controller.createPris(15, fredagsbar, sevenup);
        Pris prisFredagsbarFadølVand = Controller.createPris(10, fredagsbar, vand);
        Pris prisFredagsbarFadølØlpølser = Controller.createPris(30, fredagsbar, ølpølser);


        //----------------------------------------------------------------------------------------

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

        Pris prisFredagsbarKulsyre6kg = Controller.createPris(400, fredagsbar, kulsyre6kg);
        Pris prisButikKulsyre6kg = Controller.createPris(400, butik, kulsyre6kg);
        Pris prisFredagsbarKulsyrePant = Controller.createPris(1000, fredagsbar, kulsyrePant);
        Pris prisButikKulsyrePant = Controller.createPris(1000, butik, kulsyrePant);

        Pris prisButikMalt25kgSæk = Controller.createPris(300, butik, malt25kgSæk);

        Pris prisFredagsbarTshirt = Controller.createPris(70, fredagsbar, tshirt);
        Pris prisButikTshirt = Controller.createPris(70, butik, tshirt);
        Pris prisFredagsbarPolo = Controller.createPris(100, fredagsbar, polo);
        Pris prisButikPolo = Controller.createPris(100, butik, polo);
        Pris prisFredagsbarCap = Controller.createPris(30, fredagsbar, cap);
        Pris prisButikCap = Controller.createPris(30, butik, cap);

        Pris prisButikAnlæg1Hane = Controller.createPris(250, butik, anlæg1Hane);
        Pris prisButikAnlæg2Haner = Controller.createPris(400, butik, anlæg2Haner);
        Pris prisButikBarFlereHaner = Controller.createPris(500, butik, barFlereHaner);
        Pris prisButikAnlægLevering = Controller.createPris(500, butik, anlægLevering);
        Pris prisButikKrus = Controller.createPris(60, butik, krus);

        Pris prisButikDrikkeglas = Controller.createPris(15, butik, drikkeglas);

        Pris prisFredagsbarGaveæske2ØL2Glas = Controller.createPris(110, fredagsbar, gaveæske2Øl2Glas);
        Pris prisFredagsbarGaveæske4Øl = Controller.createPris(140, fredagsbar, gaveæske4Øl);
        Pris prisFredagsbarTrækasse6Øl = Controller.createPris(260, fredagsbar, trækasse6Øl);
        Pris prisFredagsbarGavekurv6Øl2Glas = Controller.createPris(260, fredagsbar, gavekurv6Øl2Glas);
        Pris prisFredagsbarTrækasse6Øl6Glas = Controller.createPris(350, fredagsbar, trækasse6Øl6Glas);
        Pris prisFredagsbarTrækasse12Øl = Controller.createPris(410, fredagsbar, trækasse12Øl);
        Pris prisFredagsbarPapkasse12Øl = Controller.createPris(370, fredagsbar, papkasse12øl);
        Pris prisButikGaveæske2ØL2Glas = Controller.createPris(110, fredagsbar, gaveæske2Øl2Glas);
        Pris prisButikGaveæske4Øl = Controller.createPris(140, fredagsbar, gaveæske4Øl);
        Pris prisButikTrækasse6Øl = Controller.createPris(260, fredagsbar, trækasse6Øl);
        Pris prisButikGavekurv6Øl2Glas = Controller.createPris(260, fredagsbar, gavekurv6Øl2Glas);
        Pris prisButikTrækasse6Øl6Glas = Controller.createPris(350, fredagsbar, trækasse6Øl6Glas);
        Pris prisButikTrækasse12Øl = Controller.createPris(410, fredagsbar, trækasse12Øl);
        Pris prisButikPapkasse12Øl = Controller.createPris(370, fredagsbar, papkasse12øl);

        Pris prisButikRundvisningPrPersonDag = Controller.createPris(100, butik, rundvisningPrPersonDag);

        Pris prisFredagsbarKlippekort4Klip = Controller.createPris(130, fredagsbar, klippekort4Klip);
        Pris prisButikKlippekort4Klip = Controller.createPris(130, butik, klippekort4Klip);


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

