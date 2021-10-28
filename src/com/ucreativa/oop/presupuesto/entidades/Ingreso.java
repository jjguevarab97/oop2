package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;

public class Ingreso {

  public String nombre;
    String moneda;
    String periodicidad ;
    String categoria ;
    int monto ;
    Date fecha ;


    public Ingreso(){

public Gasto(String nombre,
              String moneda,
              String categoria,
      int monto){
        this.nombre = nombre;
        this.moneda = moneda;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = new Date();
      }

      public String getNombre(){
        return this.nombre;}
}
