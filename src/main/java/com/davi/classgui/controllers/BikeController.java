package com.davi.classgui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.IOException;

public class BikeController {
    @FXML
    ChoiceBox<String> choiceType = new ChoiceBox<>();
    @FXML
    Label infoLabel = new Label();
    @FXML
    TextField modelText = new TextField();
    @FXML
    TextField yearText = new TextField();
    @FXML
    Button registerBike;

    @FXML
    public void initialize() {
        choiceType.getItems().addAll("MTB", "Speed", "Gravel");
        choiceType.setValue("MTB");
    }

    public void showInfo() {
        infoLabel.setText(modelText.getText() + " " + choiceType.getValue() + " " + yearText.getText());
    }
}
