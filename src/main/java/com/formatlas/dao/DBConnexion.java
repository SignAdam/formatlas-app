package com.formatlas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {
    private static final String URL = "jdbc:mysql://localhost:3306/formatlas_db"; // URL de la base de données
    private static final String USERNAME = "root"; // Nom d'utilisateur de la base de données
    private static final String PASSWORD = "fadam782"; // Mot de passe de la base de données

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); // Établir la connexion à la base de données
            System.out.println("Connexion à la base de données réussie !");
        } catch (SQLException e) {
            System.err.println("Echec de la connexion: " + e.getMessage());
            e.printStackTrace();
        }
        return conn; // Retourner la connexion
    }
}
