package com.ucreativa.oop.presupuesto.logicaNegocio;


public class ImplementacionSuperDummy implements InterfaceRegistro {
import com.ucreativa.oop.presupuesto.entidades.Movimiento;

    public class ImplementacionSuperDummy implements InterfaceRegistro, InterfaceReportes {

        @Override
        public void getMovimientos() {
            System.out.println("No haga nada");
            @@ -20,4 +23,9 @@ public void addGasto(String nombre, String moneda, String categoria, String mont
            public void getGastos() {
                System.out.println("No haga nada");
            }

            @Override
            public void imprimirReporte() {
                System.out.println("No haga nada");
            }
        }