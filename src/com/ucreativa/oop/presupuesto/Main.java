package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;


public class Main {
    public static void main(String[] args) {



        System.out.println("Sistema Registro de Gastos");
        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroGastos registo = new RegistroGastos();
        RegistroMovimientos registo = new RegistroMovimientos();

        while (siga) {
            System.out.println("Digite el nombre de su gasto:");
            System.out.println("Digite el nombre de su Movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la Moneda:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su gasto:");
            System.out.println("Digite la categoria de su Moviento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su gasto:");
            System.out.println("Digite el monto de su Movimiento:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Gasto nuevoGasto = new Gasto(nombre,
                    moneda,
                    categoria,
                    monto);
            Movimiento nuevoMovimiento;

            System.out.println("Indique si es un Gasto (S)");
            if (consola.nextLine().equals("S")){
                nuevoMovimiento = new Gasto(nombre,
                        moneda,
                        categoria,
                        monto);
            } else {
                System.out.println("Especifique la Periodicidad:");
                String periodicidad = consola.nextLine();

                nuevoMovimiento = new Ingreso(nombre,
                        moneda,
                        categoria,
                        monto,
                        periodicidad);
            }
            registo.addMovimiento(nuevoMovimiento);

            registo.addGastos(nuevoGasto);
            System.out.println("Todos los movientos:");
            for (Movimiento movimientos : registo.getMovimientos()) {
                System.out.println(movimientos.getNombre());
            }

            for (Gasto gastico : registo.getGastos()) {
                System.out.println("Solo Gastos:");
                for (Movimiento gastico : registo.getGastos()) {
                    System.out.println(gastico.getNombre());
                }

