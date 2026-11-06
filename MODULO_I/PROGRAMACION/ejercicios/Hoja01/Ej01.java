//1. Dado un número cualquier por teclado, mostrar su valor absoluto.

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        double num, abs;

        System.out.print("Ingrese un número: ");
        num = tec.nextDouble();


        if (num > 0) {
            abs = num;
        } else {
            abs = - num;
        }

        System.out.println("El valor absoluto de " + num + " es: |" + abs + "|");
    }
}