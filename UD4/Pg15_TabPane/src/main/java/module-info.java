module com.example.pg15_tabpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg15_tabpane to javafx.fxml;
    exports com.example.pg15_tabpane;
}