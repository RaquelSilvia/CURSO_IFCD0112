//6. Dados dos números reales, calcular su suma, diferencia, producto y división.

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double num1, num2, sum, dif, prod, div;

        System.out.print("Ingrese un primer número: ");
        num1 = tec.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        num2 = tec.nextDouble();

        sum = num1 + num2;
        dif = num1 - num2;
        prod = num1 * num2;
        div = num1 / num2;

        System.out.println("La suma de los números es: " + sum);
        System.out.println("La diferencia de los números es: " + dif);
        System.out.println("El producto de los números es: " + prod);
        System.out.println("La división de los números es: " + div);

    }
}