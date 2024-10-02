module com.davi.classgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.davi.classgui to javafx.fxml;
    exports com.davi.classgui;
    exports com.davi.classgui.controllers;
    opens com.davi.classgui.controllers to javafx.fxml;
}