/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class NumeroAutomorfico {
    private int numero;
    public NumeroAutomorfico(int numero){
        this.numero = numero;
    }
    
    public boolean esAutomorfico(){
        int cuadrado = numero * numero;
        String numeroStr = String.valueOf(numero);
        String cuadradoStr = String.valueOf(cuadrado);
        
        return cuadradoStr.endsWith(numeroStr);
    }
    
    public static void main(String[] args){
        NumeroAutomorfico num = new NumeroAutomorfico(25);
        if (num.esAutomorfico()) {
            System.out.println("El numero es automorfico");
        }else{
            System.out.println("El numero no es automorfico");
        }
    }
}
