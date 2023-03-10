/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areas;

import javax.swing.JOptionPane;

/**
 *
 * @author WORKING
 */
public class Figurita {
    private double base;
    private double altura;
    private double radio;
    private double pi = 3.1416;

    public Figurita() {
    }

    
    public Figurita(double base, double altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }
    
    public  double lectura_Datos (String msj){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Digite "+msj));
       
    }
    public double calcular_Area_Cuadrado(){
        return base*altura;
    }
    public double calcular_Area_Circulo(){
        return pi*(radio*radio);
    }
}
