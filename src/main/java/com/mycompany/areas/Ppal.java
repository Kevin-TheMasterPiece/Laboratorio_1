/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areas;

/**
 *
 * @author WORKING
 */
import javax.swing.JOptionPane;

public class Ppal {
    
    public static void main(String[] args){
       
        Figurita f= new Figurita();
        double base = f.lectura_Datos("la base: ");
        double altura = f.lectura_Datos("la altura: ");
        double radio = f.lectura_Datos("el radio: ");
        f = new Figurita(base, altura, radio);
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+f.calcular_Area_Cuadrado());
        JOptionPane.showMessageDialog(null, "El area del circulo es: "+f.calcular_Area_Circulo());
        
    }
    
}

