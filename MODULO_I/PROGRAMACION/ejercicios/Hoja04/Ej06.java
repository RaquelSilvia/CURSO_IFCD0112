// 6. Ingresando un valor entero, muestre por pantalla sus dígitos en orden inverso, por ejemplo:
// INGRESO: 3589, SALIDA: 9853.

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num, inverso;
        System.out.print("Ingrese un número entero: ");
        num = tec.nextInt();

        inverso = (int)Math.pow(10, Math.ceil(Math.log10(num +1))-1);
        // +1: log10 que es para contar los dígitos que hay va subiendo de cifra en cifra
        // -1: potencia de 10 según nº cifras (log10), pero va bajando según muestra cifra

        while (inverso != 0) {
            System.out.print(num % 10);
            num /= 10;
            inverso /= 10;
        }
    }
}