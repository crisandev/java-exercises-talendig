/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises2;

import java.util.Scanner;

/**
 *
 * @author scris
 */
public class B_TablaMultiplicar {
    
//      Escribir un programa TabLaMu1tip1icar que escriba por pantalla la tabla de
//      multiplicar de un nümero introducido por teclado.
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("|----------------------------|");
        System.out.println("|-   TABLA DE MULTIPLICAR   -|");
        System.out.println("|----------------------------|\n");        
        System.out.print("|- INTRODUCE UN NUMERO: ");
        int multiplicador = sc.nextInt();
        
        System.out.println("| LA TABLA DE MULTIPLICAR DEL " + multiplicador + " |");
        
        for (int i = 1; i < 12; i++) {
            System.out.println(multiplicador + " x " + i + " = " + (multiplicador*i));
        }
    }
}
