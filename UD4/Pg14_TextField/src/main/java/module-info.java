module com.example.pg14_textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg14_textfield to javafx.fxml;
    exports com.example.pg14_textfield;
}