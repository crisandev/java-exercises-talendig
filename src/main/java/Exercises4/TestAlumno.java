/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises4;

/**
 *
 * @author scris
 */
public class TestAlumno {

    public static void main( String[] args ) {
        Alumno alumno = new Alumno("Cristian", "Sanchez", 6);
        int[] notas = {90, 83, 89, 98, 87, 87, 87, 98, 100};
        alumno.notas = notas;

        System.out.println(alumno.calcularMediaNotas());
        alumno.mostrarInformacionAlumno();

    }
}
