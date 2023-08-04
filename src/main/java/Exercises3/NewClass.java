/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.util.HashMap;

/**
 *
 * @author scris
 */
public class NewClass {

    public static void main( String[] args ) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Cristian", 12345);
        empIds.put("Juan", 546455);
        empIds.put("Marcos", 65765);

        System.out.println(empIds);
        System.out.println(empIds.get("Cristian"));
        System.out.println(empIds.containsKey("Cristian"));
    }
}
