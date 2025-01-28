/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class Factorial {
    private int numero;
    public Factorial(int numero){
        this.numero = numero;
    }
    
    public int calcularFactorial(){
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args){
        Factorial fac = new Factorial(5);
        System.out.println("El factorial es: " + fac.calcularFactorial());
    }
}

