package com.mycompany.ejercicio4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtNumero;
    @FXML private TextArea txtAreaTabla;

    @FXML
    public void calcular() {
        int n = Integer.parseInt(txtNumero.getText());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= 10; i++) {
            sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        
        txtAreaTabla.setText(sb.toString());
    }

    @FXML
    public void limpiar() {
        txtNumero.clear();
        txtAreaTabla.clear();
    }
}