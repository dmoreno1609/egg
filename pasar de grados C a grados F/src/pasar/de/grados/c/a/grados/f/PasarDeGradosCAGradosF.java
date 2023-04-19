/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasar.de.grados.c.a.grados.f;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class PasarDeGradosCAGradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner conversor = new Scanner(System.in);
        double F, C;
        System.out.println("ingrese la cantidad de grados celsius a convertir");
        
        C = conversor.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println(C+" grados celsius equivalen a " +F+ " grados farenheit");        
    }
    
}
