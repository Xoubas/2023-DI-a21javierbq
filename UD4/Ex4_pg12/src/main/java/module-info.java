module com.example.ex4_pg12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex4_pg12 to javafx.fxml;
    exports com.example.ex4_pg12;
}