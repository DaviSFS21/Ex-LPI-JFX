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

    public void toBook(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent bookView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/book-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Book Class");
        stage.setScene(new Scene(bookView));
        stage.show();
    }

    public void toCar(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent carView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/car-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Car Class");
        stage.setScene(new Scene(carView));
        stage.show();
    }

    public void toJoystick(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent joystickView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/joystick-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Joystick Class");
        stage.setScene(new Scene(joystickView));
        stage.show();
    }

    public void toLaptop(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent laptopView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/laptop-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Laptop Class");
        stage.setScene(new Scene(laptopView));
        stage.show();
    }

    public void toNotebook(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent notebookView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/notebook-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Notebook Class");
        stage.setScene(new Scene(notebookView));
        stage.show();
    }

    public void toPen(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent penView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/pen-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Pen Class");
        stage.setScene(new Scene(penView));
        stage.show();
    }

    public void toShoe(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent shoeView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/shoe-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Shoe Class");
        stage.setScene(new Scene(shoeView));
        stage.show();
    }

    public void toSmartphone(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent smartphoneView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/smartphone-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Smartphone Class");
        stage.setScene(new Scene(smartphoneView));
        stage.show();
    }

    public void toWatch(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent watchView = FXMLLoader.load(getClass().getResource("/com/davi/classgui/watch-view.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Watch Class");
        stage.setScene(new Scene(watchView));
        stage.show();
    }
}
