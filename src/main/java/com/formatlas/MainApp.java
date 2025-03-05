package com.formatlas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException { //throws IOException permet de catcher les erreurs d'entrée/sortie
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/main-view.fxml")); // FMXLLoader permet de charger le fichier FXML
        stage.setScene(new Scene(fxmlLoader.load(), 600, 400));
        stage.setTitle("FormAtlas");
        stage.setResizable(false); // Éviter le redimensionnement de la fenêtre
        stage.show();
    }
    public static void main(String[] args) {
        launch(); // Lance l'application
    }
}
