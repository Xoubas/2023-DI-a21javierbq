package com.example.pg14_textfield;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label nome;
    @FXML
    private Label ocupacion;
    @FXML
    private Label enderezo;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf1;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nome.setLabelFor(tf1);
        enderezo.setLabelFor(tf2);
        ocupacion.setLabelFor(tf3);
    }
}