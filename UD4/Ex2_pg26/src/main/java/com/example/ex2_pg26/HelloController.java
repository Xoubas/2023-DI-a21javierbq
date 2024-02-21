package com.example.ex2_pg26;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Screen;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private MenuItem increaseFont;
    @FXML
    private ContextMenu contextMenu;
    @FXML
    private MenuItem toUppercase;
    @FXML
    private TextArea textArea;

    EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            MenuItem item = (MenuItem) event.getSource();
            if (item.equals(increaseFont)) {
                Font font = textArea.getFont();
                double size = font.getSize() + 1;
                textArea.setFont(new Font(font.getFamily(), size));
            } else {
                textArea.replaceSelection(textArea.getSelectedText().toUpperCase());
            }
        }
    };


    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        contextMenu.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                contextMenu.show(textArea, );
//            }
//        });
        increaseFont.setOnAction(eventHandler);
        toUppercase.setOnAction(eventHandler);
    }
}