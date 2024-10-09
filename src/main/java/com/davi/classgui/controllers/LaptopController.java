package com.davi.classgui.controllers;

import com.davi.classgui.entities.Laptop;
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

public class LaptopController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField modelText = new TextField();
    @FXML
    TextField cpuText = new TextField();
    @FXML
    Button register;
    @FXML
    javafx.scene.control.Label infoLabel = new Label();

    public void showInfo() {
        Laptop laptop = new Laptop(brandText.getText(), modelText.getText(), cpuText.getText());
        infoLabel.setText(laptop.toString());
    }

    public void m1() {
        Laptop laptop = new Laptop(brandText.getText(), modelText.getText(), cpuText.getText());
        infoLabel.setText(laptop.upgradeRAM());
    }

    public void m2() {
        Laptop laptop = new Laptop(brandText.getText(), modelText.getText(), cpuText.getText());
        infoLabel.setText(laptop.update());
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
