module com.example.screen {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;
    requires java.logging;
    requires javafx.swing;


    opens com.example.screen to javafx.fxml;
    exports com.example.screen;
}