package com.example.ex3_pg12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button b1 = new Button("B1");
        AnchorPane anchor = new AnchorPane();
        AnchorPane.setRightAnchor(b1, 10.0);
        AnchorPane.setBottomAnchor(b1, 10.0);
        anchor.getChildren().add(b1);

        Scene scene = new Scene(anchor, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}