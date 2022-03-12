module com.roomlight.roomlight {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.roomlight.roomlight to javafx.fxml;
    exports com.roomlight.roomlight;
}