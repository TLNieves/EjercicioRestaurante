module com.example.restaurante {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.restaurante to javafx.fxml;
    exports com.example.restaurante;
}