package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import storage.Storage;

import java.util.List;

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

    private final ListView ProduktKategoriLw = new ListView();
    private final ListView Produktvisning =new ListView<>();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        pane.add(ProduktKategoriLw, 0, 0);
        pane.add(Produktvisning, 1, 0);

        Controller.createProduktkategori("Flaskeøl");
        Controller.createProduktkategori("Fadøl");
        Controller.createProduktkategori("Spiritus");
        Controller.createProduktkategori("Fustage");
        Controller.createProduktkategori("Kulsyre");
        Controller.createProduktkategori("Malt");
        Controller.createProduktkategori("Anlæg");
        Controller.createProduktkategori("Rundvisning");
        ProduktKategoriLw.getItems().addAll(Storage.getProduktkategori());



    }



    // -------------------------------------------------------------------------


}
