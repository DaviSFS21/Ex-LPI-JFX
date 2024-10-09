package com.davi.classgui.controllers;

import com.davi.classgui.entities.Pen;
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

public class PenController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField colorText = new TextField();
    @FXML
    ChoiceBox<String> typeChoice = new ChoiceBox<>();
    @FXML
    Button register;
    @FXML
    javafx.scene.control.Label infoLabel = new Label();

    @FXML
    public void initialize() {
        typeChoice.getItems().addAll("Ballpoint", "Marker", "Brush");
        typeChoice.setValue("Ballpoint");
    }

    public void showInfo() {
        Pen pen = new Pen(brandText.getText(), colorText.getText(), typeChoice.getValue());
        infoLabel.setText(pen.toString());
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


