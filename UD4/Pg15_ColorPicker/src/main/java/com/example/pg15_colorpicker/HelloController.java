package com.example.pg15_colorpicker;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Label colorLabel;

    @FXML
    private void initialize() {
        // Configurar el ColorPicker para que actualice el color del texto de la Label
        colorPicker.setOnAction(event -> {
            Color selectedColor = colorPicker.getValue();
            colorLabel.setTextFill(selectedColor);
        });
    }
}