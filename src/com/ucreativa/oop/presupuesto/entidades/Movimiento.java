package com.ucreativa.oop.presupuesto.entidades;

import java.util.Date;
public abstract class Movimiento {
  private String nombre;
  private String moneda;
  private String categoria;
  private int monto;
  private Date fecha;

  public Movimiento(){}

  public Movimiento(String nombre,
                    String moneda,
                    String categoria,
                    @@ -24,7 +26,6 @@ public Movimiento(String nombre,
                    // Este Metodo es el Abstracto
                    public abstract String getDetails();


  // Defaults Gets
  String getNombre(){
    return this.nombre;
  }
  String getMoneda() {
    return moneda;
  }
  String getCategoria() {
    return categoria;
  }
  int getMonto() {
    return monto;
  }
  Date getFecha() {
    return fecha;
  }
}