package com.example.pg16_radiobuttons;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label etiquetaInformacion;
    @FXML
    private RadioButton opcion2;
    @FXML
    private RadioButton opcion3;
    @FXML
    private Label label;
    @FXML
    private RadioButton opcion1;

    private EventHandler eventHandler = new EventHandler() {
        @Override
        public void handle(Event event) {
            RadioButton rb = (RadioButton) event.getSource();
            label.setText(rb.getText());
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ToggleGroup toggleGroup = new ToggleGroup();
        opcion1.setToggleGroup(toggleGroup);
        opcion2.setToggleGroup(toggleGroup);
        opcion3.setToggleGroup(toggleGroup);

        opcion1.setOnAction(eventHandler);
        opcion2.setOnAction(eventHandler);
        opcion3.setOnAction(eventHandler);
    }
}