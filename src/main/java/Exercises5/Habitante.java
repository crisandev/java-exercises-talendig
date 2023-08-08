/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises5;

import java.util.Date;
import org.w3c.dom.ranges.RangeException;

/**
 *
 * @author scris
 */
public class Habitante {

    public String nacionalidad;
    private String DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private String fechaNacimiento;
    private String domicilio;
    private String provincia;
    private String CP;
    private String numHabitantes;
    private String direccion;

    public Habitante( String DNI, String nacionalidad ) {
        validarDNI(DNI, nacionalidad);
    }

    private void validarDNI( String DNI, String nacionalidad ) {
        if (DNI.length() != 8) {
            try {
                throw new Exception("Este DNI no es válido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            this.DNI = DNI;
            this.nacionalidad = nacionalidad;
        }
    }

    @Override
    public boolean equals( Object habitante ) {
        return habitante.equals(habitante);
    }

    @Override
    public String toString() {
        return ("DNI: " + this.DNI + "\n"
                 + this.apellido + ", " + this.nombre
                 + "\nEdad: " + this.edad
                 + "\nDirección: " + this.direccion 
                 );
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad( String nacionalidad ) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido( String apellido ) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad( int edad ) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento( String fechaNacimiento ) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio( String domicilio ) {
        this.domicilio = domicilio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia( String provincia ) {
        this.provincia = provincia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP( String CP ) {
        this.CP = CP;
    }

    public String getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes( String numHabitantes ) {
        this.numHabitantes = numHabitantes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion( String direccion ) {
        this.direccion = direccion;
    }

    
}
