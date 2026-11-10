// 4. De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        
        int num, mayor = 0, menor = 0, cant = 1, cont = 1;
        System.out.print("¿Qué cantidad de números ingresarás?: ");
        cant = tec.nextInt();

        while (cont <= cant) {
            System.out.print("Ingresa número: ");
            num = tec.nextInt();

            if (cont == 1)
                mayor = num; 

            if (num > mayor) {
                mayor = num;
            } else {
                menor = num;
            }
            cont++;
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}