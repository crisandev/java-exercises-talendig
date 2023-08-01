/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.Scanner;

/**
 *
 * @author scris
 */
public class C_Frases {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[5];

        System.out.println("| INTRODUCE 5 FRASES |");

        for (int i = 0; i < frases.length; i++) {
            System.out.print("| FRASE " + i + ": ");
            frases[i] = sc.nextLine();
        }
        System.out.println("----------------------------------");
        menorFrase(frases);
    }

    public static void imprimeFrase( String[] frases ) {
        System.out.println("");
        System.out.println("| FRASES |");

        for (String frase : frases) {
            System.out.println(frase);
        }

    }

    public static void mayorFrase( String[] frases ) {
        String fraseMasLarga = "";
        //FOR I
        for (int i = 0; i < frases.length; i++) {
            fraseMasLarga = fraseMasLarga.length() < frases[i].length() ? frases[i] : fraseMasLarga;
        }
        System.out.println("LA FRASE MAS LARGA ES: ");
        System.out.println(fraseMasLarga);
    }

    public static void menorFrase( String[] frases ) {
        String fraseMasCorta = frases[0];
        //FOR LOOP
        for (String frase : frases) {
            fraseMasCorta = fraseMasCorta.length() > frase.length() ? frase : fraseMasCorta;
        }

        System.out.println("LA FRASE MAS CORTA ES: ");
        System.out.println(fraseMasCorta);
    }
}
