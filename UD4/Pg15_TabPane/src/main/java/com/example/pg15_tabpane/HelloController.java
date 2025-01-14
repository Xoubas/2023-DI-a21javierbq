package com.example.pg15_tabpane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label tab2Label;
    @FXML
    private TextField tab2TextField;
    @FXML
    private Label tab1Label;
    @FXML
    private TextField tab1TextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tab1Label.setLabelFor(tab1TextField);
        tab2Label.setLabelFor(tab2TextField);
    }
}