package com.example.ex1_pg26;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private StackPane rightPane;
    @FXML
    private StackPane leftPane;
    @FXML
    private StackPane centerPane;
    @FXML
    private Label eventCheck;

    EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Button b = (Button) event.getSource();
            eventCheck.setText(b.getText()+" pressed");
        }
    };


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        b1.setOnAction(eventHandler);
        b2.setOnAction(eventHandler);
        b3.setOnAction(eventHandler);
    }
}