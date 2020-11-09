module com.mycompany.e.catin {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.e.catin to javafx.fxml;
    exports com.mycompany.e.catin;
}
