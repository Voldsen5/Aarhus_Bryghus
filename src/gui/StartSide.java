package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Produkt;
import model.ProduktKategori;
import storage.Storage;

public class StartSide extends Application {

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

        Button btnLedelse = new Button("Ledelse");
        Button btnKunde = new Button("Medarbejder");
        Button btnOpretProdukt = new Button("Opret Produkt");

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        btnLedelse.setPrefSize(100,50);
        btnKunde.setPrefSize(100,50);
        btnOpretProdukt.setPrefSize(100,50);


        HBox hBoxBtn = new HBox(btnLedelse, btnKunde,btnOpretProdukt);
        pane.add(hBoxBtn,0,0);
        hBoxBtn.setSpacing(80);
        GridPane.setHalignment(hBoxBtn,HPos.CENTER);
        GridPane.setValignment(hBoxBtn,VPos.CENTER);

        btnOpretProdukt.setOnAction(e -> OpretProdukt.launch());

    }





}
