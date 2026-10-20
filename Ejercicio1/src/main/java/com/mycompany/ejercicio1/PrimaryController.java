package com.mycompany.ejercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.time.Period;

public class PrimaryController {
    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;

    @FXML
    public void calcular() {
        String[] partes = txtFecha.getText().split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);
        
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        lblResultado.setText("Tiene " + periodo.getYears() + " años con " + periodo.getMonths() + " meses");
    }

    @FXML
    public void limpiar() {
        txtFecha.clear();
        lblResultado.setText("");
    }
}