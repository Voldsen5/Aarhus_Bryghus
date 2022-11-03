package gui;

import controller.Controller;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.OrdreLinje;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class OpretSalg extends Stage {


    public OpretSalg(String title, Stage owner, ArrayList<OrdreLinje>temp) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle("Salg");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }


    // -------------------------------------------------------------------------

    ListView<OrdreLinje> lvwordre = new ListView<>();
    LocalDate now = LocalDate.from(LocalDateTime.now());
    Label datoVisning = new Label("Dato :  "+now);
    Button gennemført = new Button("Fuldføre Betaling");
    ArrayList<OrdreLinje>temp = new ArrayList<>();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label ordreNavn = new Label("Ordre");
        pane.add(ordreNavn, 8, 0);
        GridPane.setHalignment(ordreNavn, HPos.CENTER);

        pane.add(lvwordre, 8, 1);
        GridPane.setHalignment(lvwordre, HPos.CENTER);

        String[] betalingmetode = {"Dankort    ","MobilPay  ","Kontant    ","Klippekort","Regning   "};
        for (int i = 0; i < betalingmetode.length ; i++) {
            CheckBox betalingsbox = new CheckBox(""+betalingmetode[i]);
            pane.add(betalingsbox, 8, i+4);
            GridPane.setHalignment(betalingsbox, HPos.CENTER);
        }

        Label lblbetaling = new Label("Tilføj Betalingsmetode : ");
        pane.add(lblbetaling, 8, 2);
        GridPane.setHalignment(lblbetaling, HPos.CENTER);

        pane.add(datoVisning, 9, 0);
        GridPane.setHalignment(datoVisning, HPos.RIGHT);


        Label SamletPris = new Label("");
        pane.add(SamletPris, 9, 9);
        GridPane.setHalignment(SamletPris, HPos.LEFT);

        pane.add(gennemført, 9, 10);
        GridPane.setHalignment(gennemført, HPos.LEFT);

        lvwordre.getItems().addAll(Storage.getOrdreLinjer());
    }
}
