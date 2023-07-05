/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises2;

/**
 *
 * @author scris
 */

/*
Escribir un programa llamado Intercambio que permita intercambiar el
contenido de dos variables. Dichas variables se inicializarån en el método main ( )
a un valor fijo (3 y 8 por ejemplo). Imprimir eI valor de dichas variables antes y
después del intercambio
*/
public class D_Intercambio {

    public static void main( String[] args ) {
        int varUno = 5;
        int varDos = 10;
        int varTres = varUno;
        
        System.out.println(varUno);
        System.out.println(varDos);
        varUno = varDos;
        varDos = varTres;
        System.out.println(varUno);
        System.out.println(varDos);
        
    }

}
