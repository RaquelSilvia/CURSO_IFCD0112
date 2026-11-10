// 1. Imprimir la suma de n números ingresados por teclado. La cantidad de números (n) se
// solicita al usuario al principio y se ingresa por teclado.

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num, suma = 0 , cantidad, cont = 1;
        System.out.print("¿Qué cantidad de números ingresarás?: ");
        cantidad = tec.nextInt();

        while (cont <= cantidad) {
            System.out.print("¿cuál es tu número?: ");
            num = tec.nextInt();
            System.out.println(num);
            suma = suma + num; // suma += num;
            cont++;

        }
        System.out.println("La suma de los números es: " + suma);
    }
}