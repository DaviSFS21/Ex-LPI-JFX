package com.davi.classgui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;
import java.io.IOException;

public class BookController {
    @FXML
    TextField titleText = new TextField();
    @FXML
    TextField authorText = new TextField();
    @FXML
    TextField pagesText = new TextField();
    @FXML
    Button registerBook;
    @FXML
    javafx.scene.control.Label infoLabel = new Label();

    public void showInfo() {
        infoLabel.setText(titleText.getText() + " " + authorText.getText() + " " + pagesText.getText());
    }
}
