/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Alumno
 */
public class Piramide {
    private int numero;
    public Piramide(int numero){
        this.numero = numero;
    }
    
    public void dibujarPiramide(){
        for(int altura = 1; altura<=numero; altura++){

            for(int espacio = 1; espacio<=numero-altura; espacio++){
                System.out.print(" ");
            }

            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Piramide pira = new Piramide(100);
        pira.dibujarPiramide();
    }
}
