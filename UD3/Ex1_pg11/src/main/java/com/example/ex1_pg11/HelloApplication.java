package com.example.ex1_pg11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane flow = new FlowPane();
//        flow.setAlignment(Pos.CENTER);
        flow.setVgap(10);
        flow.setHgap(15);
        for (int i = 0; i <= 20; i++) {
            flow.getChildren().add(new Button(String.valueOf(i)));
        }

        Scene scene = new Scene(flow, 300, 250);
        stage.setMinWidth(200);
        stage.setMinHeight(150);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}