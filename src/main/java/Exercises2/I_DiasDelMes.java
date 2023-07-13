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
public class I_DiasDelMes {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO DEL 1-12");
        int mes = sc.nextInt();
        int dias = ( mes == 2 ) ? 28 : ( mes % 2 == 0 ? 30 : 31 );

        System.out.println("EL MES " + mes + " TIENE " + dias + " DIAS");

    }
}
