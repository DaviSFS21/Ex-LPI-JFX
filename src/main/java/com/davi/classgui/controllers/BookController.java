package com.davi.classgui.controllers;

import com.davi.classgui.entities.Book;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class BookController {
    @FXML
    TextField titleText = new TextField();
    @FXML
    TextField authorText = new TextField();
    @FXML
    TextField pagesText = new TextField();
    @FXML
    Button register;
    @FXML
    javafx.scene.control.Label infoLabel = new Label();

    public void showInfo() {
        Book book = new Book(titleText.getText(), authorText.getText(), Integer.parseInt(pagesText.getText()));
        infoLabel.setText("Book" + book);
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
