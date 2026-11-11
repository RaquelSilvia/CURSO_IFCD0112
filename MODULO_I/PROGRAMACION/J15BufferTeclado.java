// Almacenamiento del buffer del teclado, cuando está leyendo Int o Double (desde el último queda en el buffer)
// si lo siguiente a leer es un String, tec.nextLine() limpia el buffer para leer correcto el tipo String.
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int num1 = tec.nextInt();
        int num2 = tec.nextInt();
        int num3 = tec.nextInt();
        tec.nextLine();

        System.out.print("")








    }
}