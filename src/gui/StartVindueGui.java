package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StartVindueGui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Kas-Project");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final Button tilmelding = new Button("Opret Tilmelding");
    private final Button oversigt = new Button("Vis Oversigt");
    private final Button admin = new Button("Administration");

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        pane.add(tilmelding, 0, 20);
        tilmelding.setPrefSize(150, 10);


        pane.add(oversigt, 4, 20);
        oversigt.setPrefSize(150, 10);


        pane.add(admin, 8, 20);
        admin.setPrefSize(150, 10);

    }

    // -------------------------------------------------------------------------


}
