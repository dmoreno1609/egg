/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiar.frase.mayus.y.minus;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class CambiarFraseMayusYMinus {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("ingrese una frase");
        cadena = leer.nextLine();
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
    }    
}

 
