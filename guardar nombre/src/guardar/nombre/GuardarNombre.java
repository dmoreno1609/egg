/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardar.nombre;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class GuardarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;     
        System.out.println("ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("su nombre es:" +nombre);
        
        
    }
    
}
