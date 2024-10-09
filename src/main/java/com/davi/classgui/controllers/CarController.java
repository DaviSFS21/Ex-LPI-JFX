package com.davi.classgui.controllers;

import com.davi.classgui.entities.Car;
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
        Car car = new Car(brandText.getText(), modelText.getText(), Integer.parseInt(yearText.getText()));
        infoLabel.setText("Car: " + car);
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
