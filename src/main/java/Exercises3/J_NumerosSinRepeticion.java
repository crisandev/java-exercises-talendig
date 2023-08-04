/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author scris
 */
public class J_NumerosSinRepeticion {

    public static void main( String[] args ) {
        Set<Integer> set = new HashSet();
        List<Integer> numerosRandom = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numerosRandom.add(random.nextInt(101));
        }

        for (Integer integer : numerosRandom) {
            set.add(integer);
        }

        System.out.println(numerosRandom);
        System.out.println(set);
    }
}
