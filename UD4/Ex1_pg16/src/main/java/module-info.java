module com.example.ex1_pg16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_pg16 to javafx.fxml;
    exports com.example.ex1_pg16;
}