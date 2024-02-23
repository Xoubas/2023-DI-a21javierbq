module com.example.pg14_label {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg14_label to javafx.fxml;
    exports com.example.pg14_label;
}