7. Dados dos números, indicar el mayor y el menor valor de los dos.

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double num1, num2;

        System.out.print("Ingrese un primer número: ");
        num1 = tec.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        num2 = tec.nextDouble();

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);

        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);
        
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
