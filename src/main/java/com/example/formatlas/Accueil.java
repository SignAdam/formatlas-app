package com.example.formatlas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Accueil {
    public static void main(String[] args) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Accueil.class.getResource("accueil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Formatlas");
        stage.setScene(scene);
        stage.show();
    }
}
