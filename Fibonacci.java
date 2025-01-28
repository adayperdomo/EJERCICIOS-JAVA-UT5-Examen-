/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Fibonacci {
    private int numero;
    public Fibonacci(int numero){
        this.numero = numero;
    }
    
    public void generarSecuencia(){
        int a = 0;
        int b = 1;
        
        for (int i = 2; i < numero; i++) {
            int siguiente = a + b;
            System.out.println(" " + siguiente);
            a = b;
            b = siguiente;
        }
    }
    
    public static void main(String[] args){
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
        JOptionPane.showInputDialog("Bienvenido/a " + nombre);
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(nombre+ " Dime un numero"));
        
        Fibonacci fibo = new Fibonacci(num);
        fibo.generarSecuencia();
    }
}
