package com.davi.classgui.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MenuController {

    public void toBike(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent bikeView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/bike-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Bike Class");
        stage.setScene(new Scene(bikeView));
        stage.show();
    }
}
