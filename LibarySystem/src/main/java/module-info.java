module com.example.libarysystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.libarysystem to javafx.fxml;
    exports com.example.libarysystem;
}