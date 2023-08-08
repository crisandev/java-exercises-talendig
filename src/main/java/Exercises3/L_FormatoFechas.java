/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author scris
 */
public class L_FormatoFechas {

    private static Date date = new Date();

    public static void main( String[] args ) {
//        fechaActual();
//        fechaFormateada();
        calculoDeFechas();
    }

    public static void fechaActual() {
        System.out.println(date.toString());
    }

    public static void fechaFormateada() {
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E dd/MM/yyyy hh:mm:ss");
        System.out.println(localDate.format(dateFormat));
    }

    public static void calculoDeFechas() {
        Calendar calendar = Calendar.getInstance();
        System.out.println();
    }
}
