module com.example.pg15_datepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg15_datepicker to javafx.fxml;
    exports com.example.pg15_datepicker;
}