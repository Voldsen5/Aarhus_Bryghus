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
        Controller.createOrdreLinje(test, 1);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(0);

        //Assert
        assertEquals(100, actualResult);

    }
    @Test
    void procentRabat2() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 1);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(1);

        //Assert
        assertEquals(99, actualResult);

    }

    @Test
    void procentRabat3() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 1);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(50);

        //Assert
        assertEquals(50, actualResult);

    }

    @Test
    void procentRabat4() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 1);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(99);

        //Assert
        assertEquals(1, actualResult);

    }


    @Test
    void procentRabat5() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 1);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(100);

        //Assert
        assertEquals(0, actualResult);

    }

    @Test
    void procentRabat6() {
        //Arrange
        Produkt test = Controller.createProdukt("test");
        Controller.createOrdreLinje(test, 1);
        Controller.createPris(100, null,test);


        //Act
        double actualResult = Controller.procentRabat(101);

        //Assert
        assertEquals(-1, actualResult);

    }

//--------------------------------------------------------------------------------------------------------------------------

    @Test
    void samletPantPris() {
        //Arrange
        Produkt s1 = Controller.createProdukt("Fustage");
        s1.setPantPris(200);

        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(200, actualResult);
    }

    @Test
    void samletPantPris2() {
        //Arrange
        Produkt s1 = Controller.createProdukt("Fustage");
        Produkt s2 = Controller.createProdukt("Fustage");
        Produkt s3 = Controller.createProdukt("Fustage");
        Produkt s4 = Controller.createProdukt("Fustage");
        Produkt s5 = Controller.createProdukt("Fustage");
        s1.setPantPris(200);
        s2.setPantPris(200);
        s3.setPantPris(200);
        s4.setPantPris(200);
        s5.setPantPris(200);
        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(1000, actualResult);
    }

    @Test
    void samletPantPris3() {
        //Arrange
        Produkt s1 = Controller.createProdukt("Fustage");
        Produkt s2 = Controller.createProdukt("Fustage");
        Produkt s3 = Controller.createProdukt("Fustage");
        Produkt s4 = Controller.createProdukt("Fustage");
        Produkt s5 = Controller.createProdukt("Fustage");
        Produkt s6 = Controller.createProdukt("Fustage");
        s1.setPantPris(200);
        s2.setPantPris(200);
        s3.setPantPris(200);
        s4.setPantPris(200);
        s5.setPantPris(200);
        s6.setPantPris(200);

        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(1200, actualResult);
    }

    @Test
    void samletPantPris4() {
        //Arrange
        Produkt s1 = Controller.createProdukt("Fustage");
        Produkt s2 = Controller.createProdukt("Fustage");
        Produkt s3 = Controller.createProdukt("Fustage");
        Produkt s4 = Controller.createProdukt("Fustage");
        Produkt s5 = Controller.createProdukt("Fustage");
        Produkt s6 = Controller.createProdukt("Fustage");
        Produkt s7 = Controller.createProdukt("Fustage");
        Produkt s8 = Controller.createProdukt("Fustage");
        Produkt s9 = Controller.createProdukt("Fustage");
        Produkt s10 = Controller.createProdukt("Fustage");
        s1.setPantPris(200);
        s2.setPantPris(200);
        s3.setPantPris(200);
        s4.setPantPris(200);
        s5.setPantPris(200);
        s6.setPantPris(200);
        s7.setPantPris(200);
        s8.setPantPris(200);
        s9.setPantPris(200);
        s10.setPantPris(200);

        //Act
        double actualResult = Controller.samletPantPris();

        //Assert
        assertEquals(2000, actualResult);
    }


}