package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroMovimientos registo = new RegistroMovimientos();
        System.out.println("Que quiere usar? Fake? (F):");
        InterfaceRegistro registo;
        if (consola.nextLine().equals("F")) {
            registo = new ImplementacionSuperDummy();
        }else {
            registo = new ImplementacionRegistro();
        }

        while (siga) {
            System.out.println("Digite el nombre de su Movimiento:");
            @@ -28,37 +33,29 @@ public static void main(String[] args) {

                System.out.println("Digite el monto de su Movimiento:");
                String montoStr = consola.nextLine();
                int monto = Integer.parseInt(montoStr);

                Movimiento nuevoMovimiento;

                System.out.println("Indique si es un Gasto (S)");
                if (consola.nextLine().equals("S")){
                    nuevoMovimiento = new Gasto(nombre,
                            registo.addGasto(nombre,
                                    moneda,
                                    categoria,
                                    monto);
                    montoStr);
                } else {
                    System.out.println("Especifique la Periodicidad:");
                    String periodicidad = consola.nextLine();

                    nuevoMovimiento = new Ingreso(nombre,
                            registo.addIngreso(nombre,
                                    moneda,
                                    categoria,
                                    monto,
                                    montoStr,
                                    periodicidad);
                }
                registo.addMovimiento(nuevoMovimiento);

                System.out.println("Todos los movientos:");
                for (Movimiento movimientos : registo.getMovimientos()) {
                    System.out.println(movimientos.getNombre());
                }
                registo.getMovimientos();

                System.out.println("Solo Gastos:");
                for (Movimiento gastico : registo.getGastos()) {
                    System.out.println(gastico.getNombre());
                }
                registo.getGastos();

                System.out.println("Quiere Seguir?(`S`)");
                siga = consola.nextLine().equals("S");
            }
        }
    }