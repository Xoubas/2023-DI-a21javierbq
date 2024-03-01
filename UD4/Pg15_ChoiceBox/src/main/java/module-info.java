module com.example.pg15_choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pg15_choicebox to javafx.fxml;
    exports com.example.pg15_choicebox;
}