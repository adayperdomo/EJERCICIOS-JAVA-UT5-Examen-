/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Alumno
 */
public class ContadorVocales {
    private String texto;
    public ContadorVocales(String texto){
        this.texto = texto;
    }
    
    public int contarVocales(){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador += 1;
            }
        }
        return contador;
    }
    
    public static void main(String[] args){
        ContadorVocales cont = new ContadorVocales("aday");
        System.out.println("El numero de vocales es: " + cont.contarVocales());
    }
}
