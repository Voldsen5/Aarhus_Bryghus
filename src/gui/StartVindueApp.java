package gui;

import controller.Controller;
import javafx.application.Application;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class StartVindueApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(StartVindueGui.class);
    }

    public static void initStorage() {

    }
}

