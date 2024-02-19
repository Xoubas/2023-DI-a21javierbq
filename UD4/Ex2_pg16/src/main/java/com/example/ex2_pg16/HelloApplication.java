package com.example.ex2_pg16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox box = new HBox(1);
        ContextMenu menu = new ContextMenu();
        MenuItem item1 = new MenuItem("Accion 1");
        MenuItem item2 = new MenuItem("Accion 2");

        //Events
        item1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Accion 1");
            }
        });
        item2.setOnAction(event -> System.out.println("Accion 2"));

        //HBox event handler
        box.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton()==(MouseButton.SECONDARY)) {
                    menu.show(box, mouseEvent.getScreenX(), mouseEvent.getScreenY());
                }
            }
        });

        menu.getItems().addAll(item1, item2);

        Scene scene = new Scene(box, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}