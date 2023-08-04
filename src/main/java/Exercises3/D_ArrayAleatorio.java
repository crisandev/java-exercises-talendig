/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

/**
 *
 * @author scris
 */
public class D_ArrayAleatorio {

    public static void main( String[] args ) {
        int[] numerosRandom = new int[10];

        for (int i = 0; i < numerosRandom.length; i++) {
            int random;
            random = (int) Math.ceil(Math.random() * 10);

            for (int j = 0; j < numerosRandom.length; j++) {
                if (random == numerosRandom[j]) {
                    random = (int) Math.ceil(Math.random() * 10);
                    j = 0;
                }
            }
            numerosRandom[i] = random;
        }

        for (int i = 0; i < numerosRandom.length; i++) {
            System.out.println(numerosRandom[i]);
        }
    }
}
