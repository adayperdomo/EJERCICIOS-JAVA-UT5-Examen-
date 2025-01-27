/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Alumno
 */
public class VerificadorPrimo {
    private int numero;
    public VerificadorPrimo(int numero){
        this.numero = numero;
    }
    
    public boolean esPrimo(){
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        VerificadorPrimo veri = new VerificadorPrimo(7);
        System.out.println("El numero es primo: "+ veri.esPrimo());
    }
}
