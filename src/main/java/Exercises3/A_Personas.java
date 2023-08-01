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
public class A_Personas {
    public static void main( String[] args ) {
        String[] nombres = new String[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE 20 NOMBRES DE PERSONAS: ");
        
        
        for(int i = 0; i < nombres.length; i++){
            System.out.print("NOMBRE " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
        }
        
        System.out.println("TODOS LOS NOMBRES");
        System.out.println("");
        imprimePersona(nombres);
        
        System.out.println("NOMBBRES PARES");
        pares(nombres);
    }
    
    public static void imprimePersona(String[] nombres){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
        }
    }
    public static void pares(String[] nombres){
        for (int i = 0; i < nombres.length; i++) {
            if(i % 2 == 0){
                System.out.println("Nombre: " + nombres[i]);
            }
        }
    }
}
