module com.example.ex1_pg11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_pg11 to javafx.fxml;
    exports com.example.ex1_pg11;
}