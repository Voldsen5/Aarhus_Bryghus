package gui;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OpretSalg extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Opret Salg");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    ListView ordre = new ListView<>();
    LocalDate now = LocalDate.from(LocalDateTime.now());
    Label datoVisning = new Label("Dato :  "+now);
    Button gennemført = new Button("Fuldføre Betaling");

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

        pane.add(ordre, 8, 1);
        GridPane.setHalignment(ordre, HPos.CENTER);

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


        Label SamletPris = new Label("Samlet Pris : ");
        pane.add(SamletPris, 9, 9);
        GridPane.setHalignment(SamletPris, HPos.LEFT);

        pane.add(gennemført, 9, 10);
        GridPane.setHalignment(gennemført, HPos.LEFT);







    }
}
