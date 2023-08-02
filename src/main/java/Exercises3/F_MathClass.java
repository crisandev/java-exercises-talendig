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
public class F_MathClass {

    public static void main( String[] args ) {
        //Un número al azar entre 0 y 10.
        int numeroRandom = (int) Math.ceil(Math.random() * 10);
        System.out.println(numeroRandom);
        //Un número al azar entre 50 y 150.
        Random random = new Random();
        numeroRandom = random.nextInt(50, 151);
        System.out.println(numeroRandom);
        //Raíz cuadrada de 36.
        System.out.println(Math.sqrt(36));
        //Cinco elevado al cubo.
        System.out.println(Math.pow(5, 3));
        //Mayor valor entre 2 y 4.
        System.out.println(Math.max(4, 5));
        //Menor valor entre 2 y 4.
        System.out.println(Math.min(4, 5));
        //Redondeado de -4,5 al alza.
        System.out.println(Math.ceil(-4.5));
        //Redondeado de -4,5 a la baja.
        System.out.println(Math.floor(-4.5));
    }
}
