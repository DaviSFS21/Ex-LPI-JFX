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
import java.util.Objects;

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
    @FXML
    Button m1;
    @FXML
    Button m2;

    public void initialize() {
        typeChoice.getItems().addAll("Casual","Running","Basketball");
    }

    public void showInfo() {
        Shoe shoe = new Shoe(brandText.getText(), colorText.getText(), typeChoice.getValue());
        infoLabel.setText(shoe.toString());
    }

    public void m1() {
        Shoe shoe = new Shoe(brandText.getText(), colorText.getText(), typeChoice.getValue());
        infoLabel.setText(shoe.wear());
    }

    public void m2() {
        Shoe shoe = new Shoe(brandText.getText(), colorText.getText(), typeChoice.getValue());
        infoLabel.setText(shoe.store());
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

