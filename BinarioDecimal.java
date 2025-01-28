/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class BinarioDecimal {
    private String numeroBinario;
    public  BinarioDecimal(String BinarioDecimal){
        this.numeroBinario = BinarioDecimal;
    }
    
    public int convertirADecimal(){
        int numeroDecimal = 0;
        int longitud = numeroBinario.length();
        
        for (int i = 0; i < longitud; i++) {
            if (numeroBinario.charAt(longitud -1 - i) == '1') {
                numeroDecimal += Math.pow(2, i);
            }
        }
        return numeroDecimal;
    }
    
    public static void main(String[] args){
        BinarioDecimal bin = new BinarioDecimal("1111");
        int decimal = bin.convertirADecimal();
        System.out.println(decimal);
    }
}
