/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número
 
 */
package numero.doble.triple.y.raizcuadrada;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class NumeroDobleTripleYRaizcuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nuevo = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = nuevo.nextInt();
        double doble = (num * 2);
        System.out.println("el doble del numero " +num+ " es: "+doble);
        
        double triple = (num * 3);
        System.out.println("el triple del numero " +num+ " es: "+triple);
        
        double raiz = Math.sqrt(num);
        System.out.println("la raiz del numero " +num+ " es: " +raiz);
                
        
        
        
    }

    private static double Mathsqrt(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
