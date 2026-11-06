//8. Dados tres números, indicar el mayor y el menor valor de los tres.

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Ingrese un primer número: ");
        num1 = tec.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        num2 = tec.nextDouble();

        System.out.print("Ingrese un tercer número: ");
        num3 = tec.nextDouble();


        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
            
            if (num2 > num3) {
                System.out.println("El número menor es: " + num3);
            } else {
                System.out.println("El número menor es: " + num2);
            }
             
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es: " + num2);

            if (num1 > num3) {
                System.out.println("El número menor es: " + num3);
            } else {
                System.out.println("El número menor es: " + num1);
            }
        
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es: " + num3);
            if (num1 > num2) {
                System.out.println("El número menor es: " + num2);
            } else {
                System.out.println("El número menor es: " + num1);
            }
            
        } else {
            System.out.println("Los 3 números son iguales");
        }
    }
}

