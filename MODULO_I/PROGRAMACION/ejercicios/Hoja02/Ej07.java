//7. Dado un número entero n positivo, imprimir su factorial. 

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num, fact = 1; // no puede inicializar en 0 al ser para producto
        System.out.print("Ingrese un número entero: ");
        num = tec.nextInt();


        for (int i = 2; i <= num; i++) {
            // fact = fact * i;  
            fact *= i;          
        }
        System.out.println("El factorial del número ingresado es: " + num + "! = " + fact);

    }
}