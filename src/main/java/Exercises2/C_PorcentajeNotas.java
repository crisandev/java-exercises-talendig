/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises2;

import java.text.NumberFormat;
import java.util.Locale;
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
        NumberFormat percentage = NumberFormat.getPercentInstance(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("|- PORCENTAJE DE NOTAS |");
        System.out.print("|- INTRODUCE EL NÚMERO DE SOBRESALIENTES: ");
        int sobreSalientes = sc.nextInt();
        System.out.print("|- INTRODUCE EL NÚMERO DE NOTABLES: ");
        int notables = sc.nextInt();
        System.out.print("|- INTRODUCE EL NÚMERO DE APROBADOS: ");
        int aprobados = sc.nextInt();
        System.out.print("|- INTRODUCE EL NÚMERO DE SUSPENSOS: ");
        int suspensos = sc.nextInt();
        System.out.print("|- INTRODUCE EL NÚMERO DE NO PRESENTADOS: ");
        int noPresentados = sc.nextInt();

        double total = sobreSalientes + notables + aprobados + suspensos + noPresentados;

        System.out.println("| SOBRESALIENTES: " + sobreSalientes + " (" + String.format("%.2f", 100 * sobreSalientes / total) + "%)");
        System.out.println("| NOTABLES: " + notables + " (" + String.format("%.2f", 100 * notables / total) + "%)");
        System.out.println("| APROBADOS: " + aprobados + " (" + String.format("%.2f", 100 * aprobados / total) + "%)");
        System.out.println("| SUSPENSOS: " + suspensos + " (" + String.format("%.2f", 100 * suspensos / total) + "%)");
        System.out.println("| NO PRESENTADOS: " + noPresentados + " (" + String.format("%.2f", 100 * noPresentados / total) + "%)");
        System.out.println("| TOTAL: " + ( (int) total ));

        double ttlPresentados = total - noPresentados;
        double ttlAprobados = ttlPresentados - suspensos;
        double ttlSuspensos = suspensos;
        double ttlNoPresentados = noPresentados;

        System.out.println("| TOTAL PRESENTADOS: " + ( (int) ttlPresentados ) + " (" + String.format("%.2f", 100 * ttlPresentados / total)
                 + ")%");
        System.out.println("| TOTAL APROBADOS: " + ( (int) ttlAprobados ) + " (" + String.format("%.2f", 100 * ttlAprobados / total) + ")%");
        System.out.println("| TOTAL SUSPENSOS: " + ( (int) ttlSuspensos ) + " (" + String.format("%.2f", 100 * ttlSuspensos / total) + ")%");
        System.out.println("| TOTAL NO PRESENTADOS: " + ( (int) ttlNoPresentados ) + " (" + String.format("%.2f", 100 * ttlNoPresentados
                 / total) + ")%");

    }
}
