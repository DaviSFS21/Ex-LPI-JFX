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
import java.util.Objects;

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
    @FXML
    Button m1;
    @FXML
    Button m2;

    public void showInfo() {
        Notebook notebook = new Notebook(brandText.getText(),colorText.getText(),Integer.parseInt(pagesText.getText()));
        infoLabel.setText(notebook.toString());
    }

    public void m1() {
        Notebook notebook = new Notebook(brandText.getText(),colorText.getText(),Integer.parseInt(pagesText.getText()));
        infoLabel.setText(notebook.removePage());
    }

    public void m2() {
        Notebook notebook = new Notebook(brandText.getText(),colorText.getText(),Integer.parseInt(pagesText.getText()));
        infoLabel.setText(notebook.open());
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

