package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.RegistroGastos;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


    }
        System.out.println("Mi nuevo Main");
        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroGastos registo = new RegistroGastos();

        Gasto gastoLuz = new Gasto();
        gastoLuz.nombre = "Luz";
        gastoLuz.moneda = "Colones";
        gastoLuz.monto = 22000;
        while (siga) {
            System.out.println("Digite el nombre de su gasto:");
            String nombre = consola.nextLine();

            Gasto gastoInternet = new Gasto();
            gastoInternet.nombre = "Internet";
            gastoInternet.moneda = "Colones";
            gastoInternet.monto = 30000;
            System.out.println("Digite la Moneda:");
            String moneda = consola.nextLine();

            RegistroGastos registo = new RegistroGastos();
            registo.gastos = new ArrayList<>();
            registo.gastos.add(gastoLuz);
            registo.gastos.add(gastoInternet);
            System.out.println("Digite la categoria de su gasto:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su gasto:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Gasto nuevoGasto = new Gasto(nombre,
                    moneda,
                    categoria,
                    monto);

            registo.addGastos(nuevoGasto);

            for (int i = 0; i < registo.gastos.size(); i++) {
                System.out.println(registo.gastos.get(i).nombre);
                for (Gasto gastico : registo.getGastos()) {
                    System.out.println(gastico.getNombre());
                }

                System.out.println("Quiere Seguir?(`S`)");
                siga = consola.nextLine().equals("S");
        }
    }
}