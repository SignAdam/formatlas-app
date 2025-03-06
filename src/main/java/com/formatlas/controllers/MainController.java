package com.formatlas.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private void connexionButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/connexion-view.fxml"));
        Parent connexionView = loader.load();
        Scene connexionScene = new Scene(connexionView);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(connexionScene);
        currentStage.show();
    }

    public void inscriptionButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/inscription-view.fxml"));
        Parent inscriptionView = loader.load();
        Scene inscriptionScene = new Scene(inscriptionView);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(inscriptionScene);
        currentStage.show();
    }
}
