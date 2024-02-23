module com.example.pg14_boton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg14_boton to javafx.fxml;
    exports com.example.pg14_boton;
}