package com.example.pg14_boton;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button holaButton;

//    @FXML
//    protected void onHelloButtonClick() {
//        System.out.println("Hola bro");
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        holaButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Hola bro");
            }
        });
    }
}