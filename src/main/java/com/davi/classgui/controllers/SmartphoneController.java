package com.davi.classgui.controllers;

import com.davi.classgui.entities.Smartphone;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SmartphoneController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField modelText = new TextField();
    @FXML
    TextField sizeText = new TextField();
    @FXML
    Label infoLabel = new Label();
    @FXML
    Button register;
    @FXML
    Button m1;
    @FXML
    Button m2;

    public void showInfo() {
        Smartphone smartphone = new Smartphone(brandText.getText(),modelText.getText(),Double.parseDouble(sizeText.getText()));
        infoLabel.setText(smartphone.toString());
    }

    public void m1() {
        Smartphone smartphone = new Smartphone(brandText.getText(),modelText.getText(),Double.parseDouble(sizeText.getText()));
        infoLabel.setText(smartphone.charge());
    }

    public void m2() {
        Smartphone smartphone = new Smartphone(brandText.getText(),modelText.getText(),Double.parseDouble(sizeText.getText()));
        infoLabel.setText(smartphone.takePhoto());
    }

    @FXML
    Button back;
    public void toMenu(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent menuView = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/davi/classgui/menu-view.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Main menu");
        stage.setScene(new Scene(menuView));
        stage.show();
    }
}
