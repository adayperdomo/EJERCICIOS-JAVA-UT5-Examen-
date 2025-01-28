/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class NumeroTriangular {
    private int numero;
    public NumeroTriangular(int numero){
        this.numero = numero;
    }
    
    public void mostrarserie(){
        for (int i = 1; i <= numero; i++) {
            int triangular = (i*(i+1))/2;
            System.out.println(triangular);
        }
    }
    
    public static void main(String[] args){
        NumeroTriangular num = new NumeroTriangular(5);
        num.mostrarserie();
    }
}
