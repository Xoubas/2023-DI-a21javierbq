package com.example.pg15_choicebox;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Label selectedValueLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Inicializa el ChoiceBox con algunos valores.
        choiceBox.setItems(FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3"));

        // Establece un listener para cuando cambie el valor seleccionado.
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedValueLabel.setText("Seleccionado: " + newValue);
        });
    }
}