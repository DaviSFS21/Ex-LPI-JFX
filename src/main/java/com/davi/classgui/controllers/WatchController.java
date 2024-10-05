package com.davi.classgui.controllers;

import com.davi.classgui.entities.Watch;
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

public class WatchController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField modelText = new TextField();
    @FXML
    ChoiceBox<String> typeChoice = new ChoiceBox<>();
    @FXML
    Label infoLabel = new Label();
    @FXML
    Button register;

    public void initialize() {
        typeChoice.getItems().addAll("Digital","Analogic","Fitness tracker");
    }

    public void showInfo() {
        Watch watch = new Watch(brandText.getText(), modelText.getText(), typeChoice.getValue());
        infoLabel.setText(watch.toString());
    }

    @FXML
    Button back;
    public void toMenu(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent bikeView = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/davi/classgui/menu-view.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Main menu");
        stage.setScene(new Scene(bikeView));
        stage.show();
    }
}
