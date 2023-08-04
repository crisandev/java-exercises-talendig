/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author scris
 */
public class H_ListaAleatoria {

    public static void main( String[] args ) {
        List<Integer> listaRandom = new ArrayList();
        Random random = new Random();
        int maxNum = 0;
        int minNum = 0;
        int positionMaxNum;
        int positionMinNum;

        for (int i = 0; i < 100; i++) {
            listaRandom.add(random.nextInt(500));
        }

        int previousMaxNum = listaRandom.get(0);
        int previousMinNum = listaRandom.get(0);

        for (Integer num : listaRandom) {

            if (num >= previousMaxNum) {
                maxNum = num;
                previousMaxNum = num;
            }

            if (num <= previousMinNum) {
                minNum = num;
                previousMinNum = num;
            }
        }

        positionMaxNum = listaRandom.indexOf(Integer.valueOf(maxNum));
        positionMinNum = listaRandom.indexOf(Integer.valueOf(minNum));

        System.out.println("MAX NUMBER: " + maxNum + "\nMIN NUMBER: " + minNum);
        System.out.println("POSITION MAX NUMBER: " + positionMaxNum + "\nPOSITION MIN NUMBER: " + positionMinNum);
    }
}
