package com.example.ex4_pg12;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Layout and components
        GridPane grid = new GridPane();
        Label title = new Label("Welcome");
        Label userNameLabel = new Label("User name:");
        TextField userTextField = new TextField();
        Label passwordLabel = new Label("Password:");
        TextField passTextField = new TextField();
        Button loginButton = new Button("Login");

        //Constraints
        GridPane.setConstraints(title, 0, 0);
        GridPane.setConstraints(userNameLabel, 0, 1);
        GridPane.setConstraints(userTextField, 1, 1);
        GridPane.setConstraints(passwordLabel, 0, 2);
        GridPane.setConstraints(passTextField, 1, 2);
        GridPane.setConstraints(loginButton, 1, 3);
        GridPane.setHalignment(loginButton, HPos.RIGHT);

        //GridPane characteristics
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25));
        grid.setAlignment(Pos.CENTER);

        grid.getChildren().addAll(title, userNameLabel, userTextField, passwordLabel, passTextField, loginButton);

        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}