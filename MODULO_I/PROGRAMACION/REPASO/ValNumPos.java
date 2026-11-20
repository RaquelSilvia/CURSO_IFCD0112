// Pide al usuario que introduzca un número por teclado.
// El programa debe seguir pidiendo el número mientras este sea negativo o igual a cero.

import java.util.Scanner;

public class ValNumPos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;

        do {
            System.out.print("Ingresa un número: ");
            num = tec.nextInt();
        } while (num <= 0); 

    }
}