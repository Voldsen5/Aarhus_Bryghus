package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Produkt;
import model.ProduktKategori;
import storage.Storage;

public class StartVindueGui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("AarhusBryghus");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final ListView<ProduktKategori> LvwProduktKategori = new ListView<>();
    private final ListView<Produkt> LvwProduktvisning = new ListView<>();
    private final TextField txfnavn = new TextField();
    private final TextField txfpris = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        pane.add(LvwProduktKategori, 0, 0);
        pane.add(LvwProduktvisning, 1, 0);




        pane.add(txfnavn, 1, 1);
        txfnavn.setMaxWidth(100);



        LvwProduktKategori.setOnMouseClicked(event -> this.visProdukter());







        LvwProduktKategori.getItems().addAll(Storage.getProduktkategori());



    }

    private void visProdukter() {
        if (LvwProduktKategori.getSelectionModel().getSelectedIndex() == -1) {
            return;
        }
        ProduktKategori f = Storage.getProduktkategori().get(LvwProduktKategori.getSelectionModel().getSelectedIndex());
        LvwProduktvisning.getItems().addAll(f.getProdukter());
        //lav event brug addprodukt metode samt create produkt
        //lav nyt vindue med info.


    }





}
