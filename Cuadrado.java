/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Cuadrado {
    private int numero; // Creamos la variable entera privada "numero"
    public Cuadrado(int numero){    
        this.numero = numero;   
    }
    
    public void dibujarCuadrado(){ //Creamos el método "dibujarCuadrado"
        //Primera linea
        for (int i = 0; i < numero+2; i++) {
            System.out.print("*");
        }
        System.out.println(); //Salto de linea
        
        //lineas intermedias
        for (int i = 0; i <= numero-2; i++) {
            System.out.print("*");//primer asterisco
            for (int j = 0; j < numero; j++) {
                System.out.print(" ");//espacio en medio
            }
            System.out.print("*");//ultimo asterisco
            System.out.println();
        }
        for (int i = 0; i < numero+2; i++) {
            System.out.print("*");//ultimo asterisco y salto de linea
        }
        System.out.println();//salto de linea
    }
    
    public static void main(String[] args){ //Creamos el método main
        Scanner texto = new Scanner(System.in); //genero la variable "texto" con el Scanner
        System.out.println("Dime tu nombre:");  // salida por pantalla
        String nombre = texto.nextLine(); //creo la variable "nombre"
        System.out.println("Bienvenido/a "+ nombre);    //salida por pantalla
        
        Scanner numero = new Scanner(System.in);//genero la variable "numero" con el Scanner
        System.out.println(nombre + " Dime un numero:"); // salida por pantalla
        int num = numero.nextInt();//creo la variable "num"
        
        Cuadrado cuad = new Cuadrado(num);
        cuad.dibujarCuadrado();
    }
}
