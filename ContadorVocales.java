/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Alumno
 */
public class NumerosAmistosos {
    private int numero1;
    private int numero2; 
    public NumerosAmistosos(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Método para calcular la suma de los divisores propios de un número
    private int sumaDivisoresPropios(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // Método para determinar si los números son amistosos
    public boolean sonAmistosos() {
        int sumaDivisores1 = sumaDivisoresPropios(numero1);
        int sumaDivisores2 = sumaDivisoresPropios(numero2);

        return sumaDivisores1 == numero2 && sumaDivisores2 == numero1;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        NumerosAmistosos numeros = new NumerosAmistosos(220, 284);
        if (numeros.sonAmistosos()) {
            System.out.println("Los numeros son amistosos.");
        } else {
            System.out.println("Los numeros no son amistosos.");
        }
    }
}
