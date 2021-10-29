package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Gasto;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionRegistro implements InterfaceRegistro {
    public class ImplementacionRegistro implements InterfaceRegistro, InterfaceReportes {

}
    List<Movimiento> movimientos;

    // Constructor
    public ImplementacionRegistro(){
    public ImplementacionRegistro() {
            this.movimientos = new ArrayList<>();
        }

        // Methodo 1
        public void getMovimientos(){
            public void getMovimientos() {
                for (Movimiento movimientos : movimientos) {
                    System.out.println(movimientos.getNombre());
                    System.out.println(movimientos.getDetails());
                }
            }

            @Override
            public void addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) {

                if (!moneda.equals("USD")){
                    if (!moneda.equals("USD")) {
                        System.out.println("Moneda No validad");
                    } else {
                        int monto = Integer.parseInt(montoStr);
                        @@ -48,13 +48,18 @@ public void addGasto(String nombre, String moneda, String categoria, String mont
                    }

                    // Methodo 3
                    public void getGastos(){

                        for (Movimiento movimiento : this.movimientos){
                            if (movimiento instanceof Gasto){
                                System.out.println(movimiento.getNombre());
                                public void getGastos() {
                                    for (Movimiento movimiento : this.movimientos) {
                                        if (movimiento instanceof Gasto) {
                                            System.out.println(movimiento.getDetails());
                                        }
                                    }
                                }

                                @Override
                                public void imprimirReporte() {
                                    for (Movimiento movimiento : this.movimientos) {
                                        System.out.println(movimiento.getDetails());
                                    }
                                }
                            }