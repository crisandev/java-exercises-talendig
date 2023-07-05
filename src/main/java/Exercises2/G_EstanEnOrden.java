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
public class G_EstanEnOrden {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("| INTRODUCE TRES NUMEROS |");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("ESTAN ORDENADOS DE MANERA ASCENDENTE");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("ESTAN ORDENADOS DE MANERA DESCENDENTE");
        }else{
            System.out.println("NO ESTAN ORDENADOS");
        }
    }
}
