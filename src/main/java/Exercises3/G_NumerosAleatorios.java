/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.Random;

/**
 *
 * @author scris
 */
public class G_NumerosAleatorios {

    public static void main( String[] args ) {
        Random random = new Random();
        int[] randomNumers = new int[50];
        int mostRepeatedNumber = 0;
        int previousCounter = 0;
        int counter;

        for (int i = 0; i < randomNumers.length; i++) {
            randomNumers[i] = random.nextInt(5, 26);
        }

        for (int i = 0; i < randomNumers.length; i++) {
            System.out.println(randomNumers[i]);
        }

        for (int number : randomNumers) {
            counter = 0;
            for (int i = 0; i < randomNumers.length; i++) {
                if (number == randomNumers[i]) {
                    counter++;
                }
            }

            if (counter > previousCounter) {
                mostRepeatedNumber = number;
                previousCounter = counter;
            }
        }

        System.out.println("EL NUMERO MAS REPETIDO ES " + mostRepeatedNumber);
    }
}
