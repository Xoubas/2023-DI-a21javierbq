module com.example.ex3_pg12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex3_pg12 to javafx.fxml;
    exports com.example.ex3_pg12;
}