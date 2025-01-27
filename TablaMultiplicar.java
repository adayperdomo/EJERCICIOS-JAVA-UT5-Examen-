package com.mycompany.mavenproject3;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class TablaMultiplicar {
    private int numero;
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }   
    
    public void generarTabla(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
    }
    
    public static void main(String[] args) {
        TablaMultiplicar tabla = new TablaMultiplicar(5);
        tabla.generarTabla();
    }
}
