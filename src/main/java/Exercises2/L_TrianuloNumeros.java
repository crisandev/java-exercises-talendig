/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises2;

/**
 *
 * @author scris
 */
public class L_TrianuloNumeros {

    public static void main( String[] args ) {
        int k = 3;
        for (int i = 1; i <= 7; i++) {
            if (i <= 4) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = 1; j <= k; j++) {
                    System.out.print(j);
                }
                k--;
            }
            System.out.println("");
        }
    }
}
