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
public class E_SuperficieHabitacion {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("| INTRODUCE LA LONGITUD DE LA HABITACIÓN: ");
        double longitud = sc.nextInt();
        System.out.print("| INTRODUCE LA ANCHURA DE LA HABITACIÓN: ");
        double anchura = sc.nextInt();

        double superfie = longitud * anchura;
        System.out.println("| LA SUPERFICIE ES: " + superfie);
    }
}
