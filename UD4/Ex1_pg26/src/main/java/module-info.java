module com.example.ex1_pg26 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_pg26 to javafx.fxml;
    exports com.example.ex1_pg26;
}