/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author scris
 */
public class K_AlmacenPalabras {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> hashMap = new HashMap();
        List<String> palabras = new ArrayList<>();

        while (true) {
            System.out.print("INTRODUCE UNA PALABRA: ");
            palabras.add(sc.next());

            System.out.println("¿Deseas introducir otra palabra?");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("NO")) {
                break;
            }
        }
        organizeHashMap(palabras, hashMap);
        System.out.println(hashMap);
    }

    public static void organizeHashMap( List<String> palabras, HashMap<String, List<String>> hashMap ) {
        for (Abecedario letter : Abecedario.values()) {
            List<String> list = new LinkedList<>();

            for (String palabra : palabras) {
                System.out.println(palabra);
                if (letter.toString().equalsIgnoreCase(String.valueOf(palabra.charAt(0)))) {
                    System.out.println(palabra);
                    list.add(palabra);
                    hashMap.put(letter.toString(), list);
                }
            }

        }

    }

    enum Abecedario {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
    }
}
