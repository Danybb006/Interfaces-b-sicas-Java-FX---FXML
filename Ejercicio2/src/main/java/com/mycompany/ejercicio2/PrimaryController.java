package com.mycompany.ejercicio2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtDinero;
    @FXML private TextField txtB500, txtB200, txtB100, txtB50, txtB20;
    @FXML private TextField txtM10, txtM5, txtM2, txtM1;

    @FXML
    public void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());
        
        txtB500.setText(String.valueOf(dinero / 500)); dinero %= 500;
        txtB200.setText(String.valueOf(dinero / 200)); dinero %= 200;
        txtB100.setText(String.valueOf(dinero / 100)); dinero %= 100;
        txtB50.setText(String.valueOf(dinero / 50)); dinero %= 50;
        txtB20.setText(String.valueOf(dinero / 20)); dinero %= 20;
        
        txtM10.setText(String.valueOf(dinero / 10)); dinero %= 10;
        txtM5.setText(String.valueOf(dinero / 5)); dinero %= 5;
        txtM2.setText(String.valueOf(dinero / 2)); dinero %= 2;
        txtM1.setText(String.valueOf(dinero / 1));
    }

    @FXML
    public void limpiar() {
        txtDinero.clear();
        txtB500.clear(); txtB200.clear(); txtB100.clear(); txtB50.clear(); txtB20.clear();
        txtM10.clear(); txtM5.clear(); txtM2.clear(); txtM1.clear();
    }
}