package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.entidades.Gasto;

public class RegistroMoviemientos {

  List<Movimiento> movimientos;

  // Constructor
  public RegistroMovimientos(){
    this.movimientos = new ArrayList<>();
  }

  // Methodo 1
  public List<Movimiento> getMovimientos(){
    return this.movimientos;
  }

  public List<Gasto> getGastos(){
    List<Gasto> respuesta = new ArrayList<>();
    for (Movimiento movimiento : this.movimientos){
      if (movimiento instanceof Gasto){
        respuesta.add((Gasto) movimiento);
      }
    }
    return respuesta;
  }

  // Methodo 2
  public void addMovimiento(Movimiento item){
    this.movimientos.add(item);

  }
}