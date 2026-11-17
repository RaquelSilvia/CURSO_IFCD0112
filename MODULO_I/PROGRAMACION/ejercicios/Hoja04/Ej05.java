// 5. Repetir el ejercicio anterior, pero ingresando un número entero de cualquier cantidad de
// cifras.

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
    
        int num, divisor = 1; 
        System.out.print("Ingrese un número entero: ");
        num = tec.nextInt();

        int original = num; // guardar el número original para la segunda parte Math.log10 
        
        // para saber de cuántas cifras es el número:
        while (divisor <= num / 10) {
            divisor *= 10; 
        }

        // para mostrar las cifras de izqda. a drcha.
        // lo mismo que el anterior pero con variable divisor:
        while (divisor != 0) {
            System.out.println(num /divisor);
            num = num % divisor; 
            divisor /= 10;
        }

        // CON MATH.LOG10 (LOGARITMO EN BASE 10):
        System.out.println("Con Math.log10: ");
        // guardo total de cifras en divisor:
        divisor = Math.ceil(Math.log10(original +1));
        // convierto las cifras en primer divisor necesario para extraer de la izqda.
        divisor = Math.pow(10, divisor - 1);
        while (divisor != 0) {
            System.out.println(original /divisor);
            original = original % divisor;
            divisor = divisor / 10;
        }
    }
}