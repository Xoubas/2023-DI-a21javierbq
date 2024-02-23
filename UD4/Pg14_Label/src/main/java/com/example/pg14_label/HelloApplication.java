package com.example.pg14_label;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER);
        Label label1 = new Label("_A");
        TextField textField1 = new TextField();
        Label label2 = new Label("_B");
        TextField textField2 = new TextField();
        Label label3 = new Label("_C");
        TextField textField3 = new TextField();

        label1.setMnemonicParsing(true);
        label1.setLabelFor(textField1);
        label2.setMnemonicParsing(true);
        label2.setLabelFor(textField2);
        label3.setMnemonicParsing(true);
        label3.setLabelFor(textField3);
        hbox.getChildren().addAll(label1, textField1, label2, textField2, label3, textField3);

        Scene scene = new Scene(hbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}