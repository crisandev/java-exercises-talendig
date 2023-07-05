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
public class F_Minutos {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("| INTRODUCE LOS SEGUNDOS: ");
        double segundos = sc.nextInt();

        int minutos = (int) Math.floor(segundos / 60);
        int segundosRestantes = (int) Math.round(( ( segundos / 60 ) - minutos ) * 60);

        System.out.println(( (int) segundos ) + " SON " + minutos + "m " + segundosRestantes + "s.");

    }
}
