package com.formatlas.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class InscriptionController {
    @FXML
    private void retourAccueilButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/main-view.fxml"));
        Parent accueilView = loader.load();
        Scene accueilScene = new Scene(accueilView);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(accueilScene);
        currentStage.show();
    }
}
