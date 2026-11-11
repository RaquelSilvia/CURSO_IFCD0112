// Combinando el Ej14 de la Hoja02

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese número positivo: ");
            n = tec.nextInt();
        } while (n < 0); // El do, en do-while ("repetir...mientras") se ejecutará al menos una vez.

        for (int i = n; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println(0); // para que no continúe con la coma
    
    }
}