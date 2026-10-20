package com.mycompany.ejercicio5;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtAlimentacion, txtRefrigerios, txtTransporte, txtTelefonia, txtOtros;
    @FXML private TextField txtTotalSemanal, txtGastoMasAlto;

    @FXML
    public void calcularEstadisticas() {
        double alimentacion = Double.parseDouble(txtAlimentacion.getText());
        double refrigerios = Double.parseDouble(txtRefrigerios.getText());
        double transporte = Double.parseDouble(txtTransporte.getText());
        double telefonia = Double.parseDouble(txtTelefonia.getText());
        double otros = Double.parseDouble(txtOtros.getText());

        double total = alimentacion + refrigerios + transporte + telefonia + otros;
        txtTotalSemanal.setText(String.valueOf((int) total)); 

        double max = alimentacion;
        String categoriaMax = "Alimentación";

        if (refrigerios > max) { max = refrigerios; categoriaMax = "Refrigerios"; }
        if (transporte > max) { max = transporte; categoriaMax = "Transporte"; }
        if (telefonia > max) { max = telefonia; categoriaMax = "Telefonía"; }
        if (otros > max) { max = otros; categoriaMax = "Otros"; }

        txtGastoMasAlto.setText(categoriaMax);
    }

    @FXML
    public void limpiar() {
        txtAlimentacion.clear(); txtRefrigerios.clear(); txtTransporte.clear();
        txtTelefonia.clear(); txtOtros.clear(); txtTotalSemanal.clear();
        txtGastoMasAlto.clear();
    }
}
