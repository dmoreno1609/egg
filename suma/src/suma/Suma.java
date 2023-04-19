
package suma;

import java.util.Scanner;

public class Suma {

    
    public static void main(String[] args) {
    // se crea una variable scanner que se utiliza para leer datos del usuario    
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextInt();
        
        System.out.println("el primer numero es: " +num1+ " y el segundo numero es: " +num2);
        int resultado = num1 + num2;
        
        System.out.println("la suma de los dos numeros es:" +resultado);
        
        
    }
    
}
