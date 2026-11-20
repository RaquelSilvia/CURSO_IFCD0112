// 4. Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea.

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
    
        int num, cifras = 1000; // porque num es de 4
        System.out.print("Ingrese un número entero de 4 cifras: ");
        num = tec.nextInt(); 
        
        while (num != 0) {
            System.out.println(num / cifras); // muestra cifra izqda.
            num = num % cifras; // guarda en num el resto de las cifras, que va bajando (3, 2, 1)
            cifras = cifras / 10; // va bajando divisor de 1000, 100, 10, a 1 
        }
    }
}