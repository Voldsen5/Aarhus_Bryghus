package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.OrdreLinje;
import model.ProcentRabat;
import model.Produkt;
import model.ProduktKategori;
import model.ProduktMedPant;
import storage.Storage;

public class OpretOrdreLinje extends Application {
    public void start(Stage stage) {
        stage.setTitle("AarhusBryghus");
        GridPane pane = new GridPane();
        this.initContent(pane);
        this.owner = stage;

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();

    }

    private Stage owner;
    private final ListView<ProduktKategori> LvwProduktKategori = new ListView<>();
    private final ListView<Produkt> LvwProduktvisning = new ListView<>();
    private final ListView<ProduktMedPant> LvwProduktmedpantVisning= new ListView<>();
    private final ListView<OrdreLinje> LvwOrdreLinje = new ListView<>();
    private final ListView<ProduktMedPant> LvwProductmedPant = new ListView<>();
    private final Button btnTilfojProdukt = new Button("Tilføj Produkt");
    private final TextField txfAntal = new TextField();
    private final TextField txfSamletPris = new TextField();
    private final TextField txfPantPris = new TextField();
    private final Label lblSamletPris = new Label("Samlet Pris:");
    private final Label lblPantPris = new Label("Pant Pris:");
    private final Label lblProduktKatagori = new Label("Produkt katagori:");
    private final Label lblProdukter = new Label("Produkter:");
    private final Label lblKvittering = new Label("   Navn           Antal   Pris     OrdreLinjePris");
    private final Label lblAntal = new Label("Antal:");
    private final Button btnBetal = new Button("Betal");
    private OpretSalg salgVindue;
    private final Label lblRabat = new Label("Rabatter:");
    private final TextField txfRabat = new TextField();
    private final RadioButton rbRabatProcent = new RadioButton("Procent Rabat");
    private final RadioButton rbAftaltPris = new RadioButton("Aftalt Pris");
    private final ToggleGroup tg = new ToggleGroup();



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

//        VBox vboxL = new VBox(lblProdukter,LvwProduktmedpantVisning);
//        pane.add(vboxL,1,0);


        VBox vboxPK = new VBox(lblProduktKatagori,LvwProduktKategori);
        pane.add(vboxPK,0,0);

        VBox vboxP = new VBox(lblProdukter,LvwProduktvisning);
        pane.add(vboxP,1,0);


        VBox vboxK = new VBox(lblKvittering,LvwOrdreLinje);
        pane.add(vboxK,1,2);

//        VBox vboxO = new VBox(lblKvittering,LvwProductmedPant);
//        pane.add(vboxO,1,2);

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
        txfSamletPris.setEditable(false);

        pane.add(txfPantPris,0,2);
        GridPane.setValignment(txfPantPris, VPos.BOTTOM);
        GridPane.setHalignment(txfPantPris,HPos.RIGHT);
        txfPantPris.setMaxWidth(145);
        txfPantPris.setEditable(false);
        txfPantPris.setDisable(true);

        pane.add(lblPantPris,0,2);
        GridPane.setValignment(lblPantPris, VPos.BOTTOM);
        GridPane.setHalignment(lblPantPris,HPos.LEFT);
        lblPantPris.setDisable(true);

        VBox vboxRabat = new VBox(lblRabat, rbRabatProcent, rbAftaltPris, txfRabat);
        vboxRabat.setSpacing(10);
        txfRabat.setMaxWidth(100);
        rbAftaltPris.setToggleGroup(tg);
        rbRabatProcent.setToggleGroup(tg);
        GridPane.setValignment(vboxRabat, VPos.BOTTOM);
        pane.add(vboxRabat,0,1);

        btnTilfojProdukt.setOnAction(event -> this.opretOrdreLinje());

        LvwProduktKategori.setOnMouseClicked(event -> this.visProdukter());
        LvwProduktKategori.getItems().addAll(Storage.getProduktkategori());

        btnBetal.setOnAction(event -> this.betalNu(new Stage()));

        LvwOrdreLinje.getItems().addAll(Storage.getOrdreLinjer());
        

    }

    private void visProdukter() {
        if (LvwProduktKategori.getSelectionModel().getSelectedIndex() == -1) {
            return;
        }
        if (LvwProduktKategori.getSelectionModel().getSelectedIndex() == 3) {
            txfAntal.setDisable(true);
            txfAntal.setVisible(false);
            lblAntal.setText("");
            GridPane.setHalignment(btnTilfojProdukt, HPos.CENTER);
            LvwProduktvisning.getItems().clear();
            LvwProduktvisning.setVisible(false);
            LvwProduktvisning.setDisable(true);
            LvwProduktmedpantVisning.getItems().addAll(Storage.getProduktMedPants());
        }
            ProduktKategori f = Storage.getProduktkategori().get(LvwProduktKategori.getSelectionModel().getSelectedIndex());
            LvwProduktvisning.getItems().clear();
            LvwProduktvisning.getItems().addAll(f.getProdukter());
//            LvwProduktmedpantVisning.getItems().clear();
//            LvwProduktvisning.setVisible(true);
//            LvwProduktvisning.setDisable(false);
//            txfAntal.setDisable(false);
//            txfAntal.setVisible(true);
//            lblAntal.setText("Antal");
//            GridPane.setHalignment(btnTilfojProdukt, HPos.LEFT);



    }

    private void opretOrdreLinje(){
        if (!txfAntal.getText().isEmpty()){
            LvwOrdreLinje.getItems().clear();
            Produkt j = LvwProduktvisning.getSelectionModel().getSelectedItem();
            Controller.createOrdreLinje(j, Integer.parseInt(txfAntal.getText()));
            txfAntal.clear();
            LvwOrdreLinje.getItems().addAll(Storage.getOrdreLinjer());
            txfSamletPris.clear();
            if (txfRabat.getText() == null) {
                txfSamletPris.setText("" + Controller.SamletOrdrePris());
            } else if (rbRabatProcent.isSelected()) {
                txfSamletPris.setText("" + Controller.procentRabat(Integer.parseInt(txfRabat.getText())));
            } else if (rbAftaltPris.isSelected()) {
                txfSamletPris.setText("" + Controller.fastPris(Integer.parseInt(txfRabat.getText())));
            }

        }

        if (LvwProduktKategori.getSelectionModel().getSelectedIndex() == 3) {
            LvwProductmedPant.getItems().clear();
            Produkt j = LvwProduktvisning.getSelectionModel().getSelectedItem();
            Controller.createProduktMedPant(j,200);
            lblKvittering.setText("  Produkt                               PantPris");
            LvwOrdreLinje.getItems().clear();
            LvwOrdreLinje.setDisable(true);
            txfSamletPris.setDisable(true);
            lblSamletPris.setText("");
            txfPantPris.setDisable(false);
            lblPantPris.setDisable(false);
            txfPantPris.setText(""+Controller.samletPantPris());
            LvwProductmedPant.getItems().addAll(Storage.getProduktMedPants());



        }
    }

    private double rabatfelt(){
       if (rbRabatProcent.isSelected()) {
            return Controller.procentRabat(Integer.parseInt(txfRabat.getText()));
        }
       else if (rbAftaltPris.isSelected()){
            return Controller.fastPris(Integer.parseInt(txfRabat.getText()));
        }
        return 0;
    }

    private void betalNu(Stage owner) {
        salgVindue = new OpretSalg("",owner,Storage.getOrdreLinjer(),Storage.getProduktMedPants());
        this.salgVindue.showAndWait();




    }
}
