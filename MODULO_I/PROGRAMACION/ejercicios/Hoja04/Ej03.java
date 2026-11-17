// 3. Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente
// manera:
// ****
// *  *
// *  *
// ****

import java.util.Scanner; 

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int lado;
        System.out.print("Ingrese un número entero: ");
        lado = tec.nextInt();

        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                // Si la posición actual está en alguno de los 4 bordes del cuadrado
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                // También así:
                // Si no está en los bordes (está en el interior)
                /*if (i > 1 && i < lado && j > 1 && j < lado) {
                    System.out.print("  "); // Imprime hueco
                } else {
                    System.out.print("* "); // Imprime borde
                }*/
            }
            System.out.println();
        }
            
    }
}