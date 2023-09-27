package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creamos una ventana
        Frame ventana = new Frame("Ventana de ejemplo");
        ventana.setSize(500,500);

        //Añadimos un layout
        FlowLayout layout = new FlowLayout();

        //Añadimos el layout a la ventana
        ventana.setLayout(layout);

        //Creamos un boton
        Button boton = new Button("Mi primer botoncito");

        //Añadimos el boton a la ventana
        ventana.add(boton);

        //Creamos un label
        Label label = new Label("Mi primer texto en una ventana");

        //Añadimos el label a la ventana
        ventana.add(label);


        //Creo un listener para la ventana
        ventana.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                   super.windowClosing(e);
                   System.exit(0);
             }
        });


        //Creo un listener para el boton. Todos los listener de los botones se llaman action
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Este es mi primer evento de botón");
            }
        });


        //Lanzamos la ventana
        ventana.setVisible(true);
    }
}