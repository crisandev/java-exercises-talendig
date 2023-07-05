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
//    Escribir un programa porcentaj eN0tas que lea por teclado cinco nümeros
//    enteros correspondientes al nümero de sobresalientes, notables, aprobados,
//    suspensos y no presentados de la asignatura de Programaciön Båsica, y muestre
//    por pantalla el porcentaje de cada uno de ellos. Ademås deberå mostrar el
//    porcentaje total de presentados y de no presentados. De los presentados mostrarå
//    el porcentaje de aprobados y no aprobados. Por ejemplo si en una clase de 60
//    hubieran 5 SB, IO N, 25 A, 9 S y 11 NP la salida del programa sería:
//        SB=5 (3.33%)
//        N=IO (16. 67%)
//        (41.67%)
//        s-9 (15.00%)
//        NP=II
//        Total=
//        Total
//        Total
//        Total
//        Total
//        (18 . 33%)
//        60 (10026)
//        presentados=49 (81 67%)
//        aprobados=40 (81 . 63%)
//        suspensos—9 (18. 37%)
//        no presentados=lL (18.33%)
public class C_PorcentajeNotas {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|- PORCENTAJE DE NOTAS |");
        System.out.print("|- INTRODUCE EL NÚMERO DE SOBRESALIENTES: ");
        System.out.print("|- INTRODUCE EL NÚMERO NOTABLES: ");
        System.out.print("|- INTRODUCE EL NÚMERO APROBADOS: ");
        System.out.print("|- INTRODUCE EL NÚMERO SUSPENSOS: ");
    }
}
