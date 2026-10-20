package com.mycompany.ejercicio3;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtNumero, txtCantCifras, txtSumaImpares, txtSumaPares;
    @FXML private TextField txtSumaTotal, txtCifraMayor, txtCifraMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    public void analizar() {
        String numStr = txtNumero.getText();
        int numero = Integer.parseInt(numStr);
        
        int sumaPares = 0, sumaImpares = 0, sumaTotal = 0;
        int max = -1, min = 10;

        for (char c : numStr.toCharArray()) {
            int digito = Character.getNumericValue(c);
            sumaTotal += digito;
            
            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }
            
            if (digito > max) max = digito;
            if (digito < min) min = digito;
        }

        txtCantCifras.setText(String.valueOf(numStr.length()));
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtCifraMayor.setText(String.valueOf(max));
        txtCifraMenor.setText(String.valueOf(min));

        StringBuilder divisores = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.append(i).append("\n");
            }
        }
        txtDivisores.setText(divisores.toString());
    }

    @FXML
    public void limpiar() {
        txtNumero.clear(); txtCantCifras.clear(); txtSumaImpares.clear();
        txtSumaPares.clear(); txtSumaTotal.clear(); txtCifraMayor.clear();
        txtCifraMenor.clear(); txtDivisores.clear();
    }
}
