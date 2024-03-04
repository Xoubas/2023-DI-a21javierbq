package com.example.pg14_checkbox;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private CheckBox checkBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        checkBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue)
                label.setText("Selected");
            else
                label.setText("Not Selected");
        });
    }
}