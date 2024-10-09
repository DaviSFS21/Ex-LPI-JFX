package com.davi.classgui.controllers;

import com.davi.classgui.entities.Bike;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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
        Bike bike = new Bike(modelText.getText(), typeChoice.getValue(), Integer.parseInt(yearText.getText()));
        infoLabel.setText("Bike: " + bike);
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
