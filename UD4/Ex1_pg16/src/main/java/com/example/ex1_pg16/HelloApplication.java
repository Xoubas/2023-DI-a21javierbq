package com.example.ex1_pg16;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane pane = new BorderPane();
        Rectangle rectangle = new Rectangle(50, 100);
        rectangle.setFill(Color.RED);
        pane.setCenter(rectangle);
        BorderPane.setAlignment(rectangle, Pos.CENTER);

        rectangle.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> printEventDetails("Rectangle", event));
        pane.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> printEventDetails("Pane", event));


        Scene scene = new Scene(pane, 300, 250);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private void printEventDetails(String sourceName, MouseEvent event) {
        System.out.println("Event on: " + sourceName);
        System.out.println("Source: " + event.getSource());
        System.out.println("Target: " + event.getTarget());
        System.out.println("Type: " + event.getEventType());
        System.out.println("X: " + event.getX() + ", Y: " + event.getY());
    }

    public static void main(String[] args) {
        launch();
    }
}