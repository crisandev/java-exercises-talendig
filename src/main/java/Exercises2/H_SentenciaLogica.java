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
public class H_SentenciaLogica {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INTRODUCE UN NUMERO ENTERO: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 100) {
            System.out.println("TU NUMERO SE ENCUENTRA ENTRE EL 1 Y EL 100");
        } else if (num > 100) {
            System.out.println("TU NUMERO ES MAYOR QUE 100");
        } else {
            System.out.println("TU NUMERO ES MENOR QUE 0");
        }
    }
}
