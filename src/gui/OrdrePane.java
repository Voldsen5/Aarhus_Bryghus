package gui;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Produkt;
import model.ProduktKategori;
import storage.Storage;

public class OrdrePane extends Application {
    public void start(Stage stage) {
        stage.setTitle("AarhusBryghus");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<ProduktKategori> LvwProduktKategori = new ListView<>();
    private final ListView<Produkt> LvwProduktvisning = new ListView<>();
    private final ListView<Produkt> LvwOrdreLinje = new ListView<>();
    private final Button btnTilfojProdukt = new Button("Tilføj Produkt");
    private final TextField txfAntal = new TextField();
    private final TextField txfSamletPris = new TextField();
    private final Label lblSamletPris = new Label("Samlet Pris:");
    private final Label lblProduktKatagori = new Label("Produkt katagori:");
    private final Label lblProdukter = new Label("Produkter:");
    private final Label lblKvittering = new Label("Kvittering:");
    private final Label lblAntal = new Label("Antal:");
    private final Button btnBetal = new Button("Betal");


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        pane.add(btnBetal,1,3);

        VBox vboxPK = new VBox(lblProduktKatagori,LvwProduktKategori);
        pane.add(vboxPK,0,0);

        VBox vboxP = new VBox(lblProdukter,LvwProduktvisning);
        pane.add(vboxP,1,0);

        VBox vboxK = new VBox(lblKvittering,LvwOrdreLinje);
        pane.add(vboxK,1,2);

        pane.add(btnTilfojProdukt,1,1);
        GridPane.setHalignment(btnTilfojProdukt,HPos.LEFT);

        pane.add(lblAntal,1,1);
        GridPane.setHalignment(lblAntal,HPos.CENTER);

        pane.add(txfAntal,1,1);
        GridPane.setHalignment(txfAntal,HPos.RIGHT);
        txfAntal.setMaxWidth(85);

        pane.add(lblSamletPris,0,2);
        GridPane.setHalignment(lblSamletPris,HPos.LEFT);

        pane.add(txfSamletPris,0,2);
        GridPane.setHalignment(txfSamletPris,HPos.RIGHT);
        txfSamletPris.setMaxWidth(145);

        LvwProduktKategori.getItems().addAll(Storage.getProduktkategori());
    }
}
