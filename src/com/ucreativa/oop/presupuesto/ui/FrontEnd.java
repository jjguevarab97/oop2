package com.ucreativa.oop.presupuesto.ui;


import com.ucreativa.oop.presupuesto.logicaNegocio.*;
import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;
import com.ucreativa.oop.presupuesto.repo.FileRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.stream.Collectors;

public class FrontEnd extends JFrame {

    @@ -23,6 +22,7 @@ public FrontEnd(String titulo){
        public void build(){

            InterfaceRegistro registo = new ImplementacionRegistro(new FileRepository());
            InterfaceReportes reportes = new ImplementacionReportes(new FileRepository());

            // Create Components
            JLabel lblNombre = new JLabel("Nombre");
            @@ -92,8 +92,10 @@ public void actionPerformed(ActionEvent e) {
                reporte.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        reportes.getGastos();

                        JOptionPane.showMessageDialog(FrontEnd.super.rootPane, String.join("", reportes.getMovimientos()));

                    }
                });
