package com.formatlas.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MainController {
    @FXML
    private Label titleLabel;
    public void initialize() {
        titleLabel.setText("Bienvenue chez FormAtlas");
    }}
