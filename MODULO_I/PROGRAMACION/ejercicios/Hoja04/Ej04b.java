// Para mostrar las cifras pero al revés, de drcha. a izqda.

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
    
        int num; 
        System.out.print("Ingrese un número entero de 4 cifras: ");
        num = tec.nextInt();
        
        int original = num; // guardar el número original para la segunda parte Math.log10

        // al revés, ingreso: 1234 y muestra: 4 3 2 1
        int aux = original;
        System.out.println("Original: " + aux);
        while (aux != 0) {
            System.out.println(aux % 10);
            aux /= 10;
        }

        // El logaritmo en base 10 indica cuántos dígitos tiene un número entero
        // luego lo redondeamos hacia arriba para quedarnos con la parte entera.
        System.out.println("Imprimir el primer dígito de cada número (drcha. a izqda.):"); 
        System.out.println(Math.ceil(Math.log10(12345678)));
        System.out.println(Math.ceil(Math.log10(12345)));
        System.out.println(Math.ceil(Math.log10(12)));
    }
}