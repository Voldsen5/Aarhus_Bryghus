package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.OrdreLinje;
import model.Pris;
import model.Produkt;
import model.ProduktKategori;
import storage.Storage;

import java.util.ArrayList;

public class OpretProdukt extends Stage {

    public OpretProdukt(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle("Opret Produkt");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);

//    public void start(Stage stage) {
//        stage.setTitle("Opret Produkt");
//        GridPane pane = new GridPane();
//        this.initContent(pane);
//
//        Scene scene = new Scene(pane, 500, 500);
//        stage.setScene(scene);
//        stage.show();
    }

    // -------------------------------------------------------------------------

    private final ListView<ProduktKategori> LvwProduktKategori = new ListView<>();
    private final ListView<Produkt> LvwProduktvisning = new ListView<>();
    private final TextField txfnavn = new TextField();
    private final TextField txfpris = new TextField();
    private final Button tilfojProdukt = new Button("Tilføj Produkt");

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





        pane.add(txfnavn, 0, 1);
        txfnavn.setMaxWidth(100);
        GridPane.setHalignment(txfnavn, HPos.CENTER);

        Label navntext = new Label("Navn:");
        pane.add(navntext, 0, 1);

        pane.add(txfpris, 0, 2);
        txfpris.setMaxWidth(100);
        GridPane.setHalignment(txfpris, HPos.CENTER);

        Label prisText = new Label("Pris:");
        pane.add(prisText, 0, 2);

        pane.add(tilfojProdukt, 0, 3);
        GridPane.setHalignment(tilfojProdukt, HPos.CENTER);


        LvwProduktKategori.setOnMouseClicked(event -> this.visProdukter());
        LvwProduktKategori.getItems().addAll(Controller.getStorage().getProduktkategori());

        tilfojProdukt.setOnAction(event -> this.skabProdukt());
    }

    private void visProdukter() {
        if (LvwProduktKategori.getSelectionModel().getSelectedIndex() == -1) {
            return;
        }
        ProduktKategori f = Controller.getStorage().getProduktkategori().get(LvwProduktKategori.getSelectionModel().getSelectedIndex());
        LvwProduktvisning.getItems().clear();
        LvwProduktvisning.getItems().addAll(f.getProdukter());
    }

    private void skabProdukt(){
        Produkt p = Controller.createProdukt(txfnavn.getText());
        ProduktKategori f = Controller.getStorage().getProduktkategori().get(LvwProduktKategori.getSelectionModel().getSelectedIndex());
        Controller.addProduktTilKategori(f,p);
        Pris c = Controller.createPris(Integer.parseInt(txfpris.getText()), null, p);
        LvwProduktvisning.getItems().clear();
        LvwProduktvisning.getItems().addAll(f.getProdukter());
        txfpris.clear();
        txfnavn.clear();

    }





}
