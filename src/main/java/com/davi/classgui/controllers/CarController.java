package com.davi.classgui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CarController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField modelText = new TextField();
    @FXML
    TextField yearText = new TextField();
    @FXML
    Label infoLabel = new Label();
    @FXML
    Button register;

    public void showInfo() {
        infoLabel.setText(brandText.getText() + " " + modelText.getText() + " " + yearText.getText());
    }
}
