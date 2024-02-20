package com.example.ex3_pg16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();
        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Label eventCheck = new Label();

        // Wrap buttons in StackPanes for alignment
        StackPane leftPane = new StackPane(b1);
        StackPane centerPane = new StackPane(b2);
        StackPane rightPane = new StackPane(b3);
        leftPane.setAlignment(Pos.CENTER);
        centerPane.setAlignment(Pos.CENTER);
        rightPane.setAlignment(Pos.CENTER);

        pane.setLeft(leftPane).setAl;
        pane.setCenter(centerPane);
        pane.setRight(rightPane);
        pane.setBottom(eventCheck);

        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button b = (Button) event.getSource();
                eventCheck.setText(b.getText()+" pressed");
            }
        };

        b1.setOnAction(eventHandler);
        b2.setOnAction(eventHandler);
        b3.setOnAction(eventHandler);

        Scene scene = new Scene(pane, 300, 200);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
