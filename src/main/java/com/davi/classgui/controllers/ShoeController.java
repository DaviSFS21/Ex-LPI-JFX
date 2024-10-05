package com.davi.classgui.controllers;

import com.davi.classgui.entities.Shoe;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ShoeController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField colorText = new TextField();
    @FXML
    ChoiceBox<String> typeChoice = new ChoiceBox<>();
    @FXML
    Label infoLabel = new Label();
    @FXML
    Button register;

    public void initialize() {
        typeChoice.getItems().addAll("Casual","Running","Basketball");
    }

    public void showInfo() {
        Shoe shoe = new Shoe(brandText.getText(), colorText.getText(), typeChoice.getValue());
        infoLabel.setText(shoe.toString());
    }

    @FXML
    Button back;
    public void toMenu(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent bikeView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/menu-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Main menu");
        stage.setScene(new Scene(bikeView));
        stage.show();
    }
}

