package controller;

import model.Pris;
import model.Produkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import storage.Storage;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private Storage storage;

    @BeforeEach
    void setUp(){
        storage = new Storage();
        Controller.setStorage(storage);
    }


    @Test
    void procentRabat() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 3);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(50);

        //Assert
        assertEquals(150, actualResult);

    }
    @Test
    void procentRabat1() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 2);
        Controller.createPris(500, null,test);


        //Act
        double actualResult = Controller.procentRabat(50);

        //Assert
        assertEquals(500, actualResult);

    }
    @Test
    void procentRabat2() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 3);
        Controller.createPris(600, null,test);


        //Act
        double actualResult = Controller.procentRabat(50);

        //Assert
        assertEquals(900, actualResult);

    }
    @Test
    void samletPantPris() {
        //Arrange
        Produkt s1 = Controller.createProdukt("bakki");
        Produkt s2 = Controller.createProdukt("bakki");
        Produkt s3 = Controller.createProdukt("bakki");
        s1.setPantPris(100);
        s2.setPantPris(50);
        s3.setPantPris(100);

        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(250, actualResult);
    }

    @Test
    void samletPantPris2() {
        //Arrange
        Produkt s1 = Controller.createProdukt("bakki");
        Produkt s2 = Controller.createProdukt("bakki");
        Produkt s3 = Controller.createProdukt("bakki");
        s1.setPantPris(200);
        s2.setPantPris(50);
        s3.setPantPris(150);
        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(400, actualResult);
    }

    @Test
    void samletPantPris3() {
        //Arrange
        Produkt s1 = Controller.createProdukt("bakki");
        Produkt s2 = Controller.createProdukt("bakki");
        Produkt s3 = Controller.createProdukt("bakki");
        s1.setPantPris(200);
        s2.setPantPris(10);
        s3.setPantPris(250);

        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(460, actualResult);
    }

}