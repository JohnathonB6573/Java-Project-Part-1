module com.example.fxlibarysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlibarysystem to javafx.fxml;
    exports com.example.fxlibarysystem;
}