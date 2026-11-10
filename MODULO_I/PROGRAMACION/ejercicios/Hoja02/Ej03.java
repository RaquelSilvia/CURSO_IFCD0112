// 3. De una lista de n números ingresados por teclado, imprimir el mayor.

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int num, mayor = 0, cantidad, contador = 1;

        System.out.print("¿Qué cantidad de números ingresarás?: ");
        cantidad = tec.nextInt();
       
        while (contador <= cantidad) {
            System.out.print("Ingresa  número: ");
            num = tec.nextInt();
            // mayor = num;
            // si sólo se ingresa uno, ese mismo será el mayor, si no, entra en if:
            if (contador == 1)
                mayor = num;

            if (num > mayor) {
                mayor = num;
            
            }
            contador++;
        }
        System.out.println(mayor + " es mayor");
    }
}
