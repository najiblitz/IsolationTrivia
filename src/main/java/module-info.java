module com.example.trivia {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.trivia to javafx.fxml;
    exports com.example.trivia;
}