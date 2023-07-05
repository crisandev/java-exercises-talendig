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
public class A_Calculo {

    public static void main( String[] args ) {
//      Realizar un programa Calculo que acepte por teclado dos nümeros y una
//      operaciån aritmética y muestre el resultado por pantalla.
//      Las operaciones a realizar serån la suma, resta, multiplicaciön, divisiön y resto
//      sobre nümeros reales (float).
        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESA UN PRIMER NUMERO: ");
        int num1 = sc.nextInt();
        System.out.print("INGRESA UN SEGUNDO NUMERO: ");
        int num2 = sc.nextInt();

        System.out.println("| ------------------------------------------- |");
        System.out.println("| INDICA EL NUMERO DE LA OPERACION A REALIZAR |");
        System.out.println("| ------------------------------------------- |");
        System.out.println("");
        System.out.println("| ------------------------------------------- |");
        System.out.println("| 1. SUMA");
        System.out.println("| 2. RESTA");
        System.out.println("| 3. MULTIPLICACION");
        System.out.println("| 4. DIVISION");
        System.out.println("| 5. RESTO");
        System.out.println("| ------------------------------------------- |");
        String option = sc.next();
        switch (option) {
            case "1":
                System.out.println("EL RESULTADO ES " + num1 + " + " + num2 + " = " + ( num1 + num2 ));
                break;
            case "2":
                System.out.println("EL RESULTADO ES " + num1 + " - " + num2 + " = " + ( num1 - num2 ));
                break;
            case "3":
                System.out.println("EL RESULTADO ES " + num1 + " x " + num2 + " = " + ( num1 * num2 ));
                break;
            case "4":
                System.out.println("EL RESULTADO ES " + num1 + " / " + num2 + " = " + ( num1 / num2 ));
                break;
            case "5":
                System.out.println("EL RESULTADO ES " + num1 + " % " + num2 + " = " + ( num1 % num2 ));
                break;
            default:
                System.out.println("LA OPCION " + option + " NO EXISTE");
        }
    }

}
