module com.example.pg14_checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg14_checkbox to javafx.fxml;
    exports com.example.pg14_checkbox;
}