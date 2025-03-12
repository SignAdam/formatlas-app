module com.formatlas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.sql;

    opens com.formatlas to javafx.fxml;
    exports com.formatlas;
    opens com.formatlas.controllers to javafx.fxml;
    exports com.formatlas.controllers;
}