/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.Scanner;

/**
 *
 * @author scris
 */
public class B_Datos {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("INTRODUCE DIEZ VALORES NUMERICOS");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("POSICION " + ( i + 1 ) + ": ");
            numeros[i] = sc.nextInt();
        }

        sumaPares(numeros);
        sumaImpares(numeros);
    }

    public static void sumaPares( int[] numeros ) {
        int suma = 0;
        System.out.println("");
        System.out.println("NUMEROS PARES");
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                suma += numeros[i];
            }
        }
        
        System.out.println("SUMA TOTAL: " + suma);
    }
    
    public static void sumaImpares( int[] numeros ) {
        int suma = 0;
        System.out.println("");
        System.out.println("NUMEROS IMPARES");
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
                suma += numeros[i];
            }
        }
        
        System.out.println("SUMA TOTAL: " + suma);
    }
}
