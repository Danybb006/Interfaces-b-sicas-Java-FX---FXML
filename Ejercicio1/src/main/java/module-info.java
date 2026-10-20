module com.mycompany.ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1 to javafx.fxml;
    exports com.mycompany.ejercicio1;
}
