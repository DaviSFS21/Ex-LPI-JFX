package com.davi.classgui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class BikeController {
    @FXML
    ChoiceBox<String> typeChoice = new ChoiceBox<>();
    @FXML
    Label infoLabel = new Label();
    @FXML
    TextField modelText = new TextField();
    @FXML
    TextField yearText = new TextField();
    @FXML
    Button register;

    @FXML
    public void initialize() {
        typeChoice.getItems().addAll("MTB", "Speed", "Gravel");
        typeChoice.setValue("MTB");
    }

    public void showInfo() {
        infoLabel.setText(modelText.getText() + " " + typeChoice.getValue() + " " + yearText.getText());
    }
}
