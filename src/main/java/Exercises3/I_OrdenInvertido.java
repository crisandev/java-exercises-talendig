/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author scris
 */
public class I_OrdenInvertido {

    public static void main( String[] args ) {
        int[] numbers = new int[10];
        List<Integer> listInverted = new LinkedList();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.ceil(Math.random() * 100);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            listInverted.add(numbers[i]);
        }

        System.out.println("ORIGINAL LIST: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i]);
        }

        System.out.println("INVERTED LIST: ");
        for (int i = 0; i < listInverted.size(); i++) {
            System.out.println(i + " - " + listInverted.get(i));
        }
    }
}
