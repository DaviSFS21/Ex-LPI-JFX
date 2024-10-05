package com.davi.classgui.controllers;

import com.davi.classgui.entities.Notebook;
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

public class NotebookController {
    @FXML
    TextField brandText = new TextField();
    @FXML
    TextField colorText = new TextField();
    @FXML
    TextField pagesText = new TextField();
    @FXML
    Button register;
    @FXML
    javafx.scene.control.Label infoLabel = new Label();

    public void showInfo() {
        Notebook notebook = new Notebook(brandText.getText(),colorText.getText(),Integer.parseInt(pagesText.getText()));
        infoLabel.setText(notebook.toString());
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

