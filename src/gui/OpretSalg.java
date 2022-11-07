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
import model.*;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class OpretSalg extends Stage {


    public OpretSalg(String title, Stage owner, ArrayList<OrdreLinje>tempOrdreLinjer) {
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
    private Stage owner;
    TextArea kvittering = new TextArea();
    ArrayList<CheckBox>tempCheckbox = new ArrayList<>();
    private final ArrayList<Observer> observers = new ArrayList<>();


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

        Label kvitteringNavn = new Label("Kvittering");
        pane.add(kvitteringNavn, 9, 0);
        GridPane.setHalignment(kvitteringNavn, HPos.CENTER);

        pane.add(lvwordre, 8, 1);
        GridPane.setHalignment(lvwordre, HPos.CENTER);

        String[] betalingmetode = {"Dankort    ","MobilPay  ","Kontant    ","Klippekort","Regning   "};
        for (int i = 0; i < betalingmetode.length ; i++) {
            CheckBox betalingsbox = new CheckBox(betalingmetode[i]);
            tempCheckbox.add(betalingsbox);
            pane.add(betalingsbox, 8, i+4);
            GridPane.setHalignment(betalingsbox, HPos.CENTER);
        }

        Label lblbetaling = new Label("Tilføj Betalingsmetode : ");
        pane.add(lblbetaling, 8, 2);
        GridPane.setHalignment(lblbetaling, HPos.CENTER);

//        pane.add(datoVisning, 9, 0);
//        GridPane.setHalignment(datoVisning, HPos.RIGHT);


        Label SamletPris = new Label("");
        pane.add(SamletPris, 9, 9);
        GridPane.setHalignment(SamletPris, HPos.LEFT);

        pane.add(gennemført, 9, 10);
        GridPane.setHalignment(gennemført, HPos.LEFT);

        lvwordre.setMaxHeight(250);
        lvwordre.getItems().addAll(Storage.getOrdreLinjer());

        pane.add(kvittering, 9, 1);
        kvittering.setMaxWidth(250);
        kvittering.setEditable(false);

        gennemført.setOnAction(event -> this.fulføreBetaling());
    }
    public void fulføreBetaling(){
        String temp = "";
        for (CheckBox p : tempCheckbox){
            if (p.isSelected()){
                temp = p.getText().toUpperCase(Locale.ROOT);
            }
        }
        for (OrdreLinje c : Storage.getOrdreLinjer()){
            kvittering.appendText("Produkt       Antal      Pris    OrdreLinjePris"+"\n");
            kvittering.appendText(""+c+"\n");
            kvittering.appendText("\n");
            kvittering.appendText("Samlet Pris På Ordre: "+Controller.SamletOrdrePris()+"\n");
            kvittering.appendText("Samlet Pris på pant: "+Controller.SamletPantPris()+"\n");
            kvittering.appendText("\n");

        }
        kvittering.appendText("\n"+"Betalingsmetode valgt : "+temp+"\n"+"Dato : "+now);


//        kvittering.appendText(""+Storage.getOrdreLinjer()+"\n"+"Betalingsmetode valgt : "+temp+"\n"+"Dato : "+now);
        //Controler liste appent new line

    }


}
