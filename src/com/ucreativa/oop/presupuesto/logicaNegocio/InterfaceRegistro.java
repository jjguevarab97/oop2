package com.ucreativa.oop.presupuesto.logicaNegocio;

public class InterfaceRegistro {

    void getMovimientos();

    void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

    void addGasto(String nombre, String moneda, String categoria, String montoStr);

    void getMovimientos();
    void getGastos();
}
