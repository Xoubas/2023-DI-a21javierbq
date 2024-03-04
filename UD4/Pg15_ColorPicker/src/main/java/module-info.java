module com.example.pg15_colorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg15_colorpicker to javafx.fxml;
    exports com.example.pg15_colorpicker;
}