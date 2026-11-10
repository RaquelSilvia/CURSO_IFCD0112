// 8. Escribir un programa que imprima todos los números pares entre dos números que se le
// pidan al usuario, incluidos los extremos si son pares.

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num1, num2;
        System.out.print("Ingrese un primer número: ");
        num1 = tec.nextInt();
        System.out.print("Ingrese un segundo número superior: ");
        num2 = tec.nextInt();

        if (num1 %2 != 0) {
            num1++;
            for (int i = num1; i <= num2; i+=2) {   // i+=2 es lo mismo que i = i+2
                System.out.println(i);
            }
        }
    }
}