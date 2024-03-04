module com.example.pg15_barradeprogreso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg15_barradeprogreso to javafx.fxml;
    exports com.example.pg15_barradeprogreso;
}