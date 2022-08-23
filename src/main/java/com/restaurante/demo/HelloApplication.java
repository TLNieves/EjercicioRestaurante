package com.restaurante.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label user_id=new Label("Nombre");
        Label phone = new Label("Telefono");
        Label direccion = new Label("Direccion");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        Button si = new Button("Guardar");
        Button no = new Button("Cancelar");
        GridPane root = new GridPane();
        root.addRow(0, user_id, tf1);
        root.addRow(1, phone, tf2);
        root.addRow(2, direccion,tf3);
        root.addRow(3,si,no);
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 320, 320);
        stage.setTitle("Restaurante");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}