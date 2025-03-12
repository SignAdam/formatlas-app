package com.formatlas;

import com.formatlas.dao.DBConnexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException { //throws IOException permet de catcher les erreurs d'entrée/sortie
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/main-view.fxml")); // FMXLLoader permet de charger le fichier FXML
        stage.setScene(new Scene(fxmlLoader.load(), 600, 400));
        stage.setTitle("FormAtlas");
        stage.setResizable(false); // Éviter le redimensionnement de la fenêtre
        stage.show();
    }
    public static void main(String[] args) throws SQLException { //throws SQLException permet de catcher les erreurs SQL
        launch(); // Lance l'application
        Connection conn = DBConnexion.getConnection();
        if (conn != null) {
            System.out.println("Connexion à la base de données réussie !");
        } else {
            System.out.println("Echec de la connexion à la base de données.");
        }
    }
}
