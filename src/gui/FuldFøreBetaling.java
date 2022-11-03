package gui;

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

public class FuldFøreBetaling extends Stage {


    public FuldFøreBetaling(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle("Fuldføre Betaling");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }


    // -------------------------------------------------------------------------

    TextArea Kvittering = new TextArea();
    ArrayList<OrdreLinje>temp = new ArrayList<>();
    CheckBox test = new CheckBox();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        pane.add(Kvittering, 0, 0);




    }
}

