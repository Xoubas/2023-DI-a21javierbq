module com.example.pg16_radiobuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg16_radiobuttons to javafx.fxml;
    exports com.example.pg16_radiobuttons;
}