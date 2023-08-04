/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises4;

/**
 *
 * @author scris
 */
public class Alumno {

    String nombre;
    String apellido;
    int curso;
    int[] notas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public void mostrarInformacionAlumno() {
        System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nCurso: " + this.curso);
    }

    public double calcularMediaNotas() {
        int sumaNotas = 0;

        for (int i = 0; i < this.notas.length; i++) {
            sumaNotas += this.notas[i];
        }

        double media = sumaNotas / this.notas.length;
        return media;
    }

}
