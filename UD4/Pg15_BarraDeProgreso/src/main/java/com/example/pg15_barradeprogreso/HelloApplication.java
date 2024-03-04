package com.example.pg15_barradeprogreso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox();
        //Buttons
        Button aumentar = new Button("Aumentar");
        Button disminuir = new Button("Disminuir");
        //ProgressBar
        ProgressBar progressBar = new ProgressBar(0);
        ProgressIndicator progressIndicator = new ProgressIndicator(0);
        progressBar.prefWidth(150);
        vbox.getChildren().addAll(progressBar, progressIndicator, aumentar, disminuir);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

//ActionListeners
        aumentar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double newProgress = progressBar.getProgress() + 0.1;
                // Clamp the new progress value to be within 0 and 1
                newProgress = Math.min(1, newProgress); // Ensure progress does not exceed 1
                progressBar.setProgress(newProgress);
                progressIndicator.setProgress(newProgress);
            }
        });

        disminuir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double newProgress = progressBar.getProgress() - 0.1;
                // Clamp the new progress value to be no less than 0
                newProgress = Math.max(0, newProgress); // Ensure progress is not less than 0
                progressBar.setProgress(newProgress);
                progressIndicator.setProgress(newProgress);
            }
        });


        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}