// Combinando ejemplo del Ej03 de Hoja02
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        
        int n;
        double num, mayor = 0;
        System.out.print("¿Qué cantidad de números ingresarás?: ");
        n = tec.nextInt();

        if (n > 0) {
            System.out.print("Ingrese número: ");
            mayor = tec.nextDouble();
        }

        // for (sentencia_inicializzación; exp_lógica; sentencia_actualización)
        for (int i = 2; i <= num; i++) {    // Como ya pedí el primer número antes, empieza iteración en 2
            // procesa
            System.out.print("Ingrese número: ");
            num = tec.nextDouble();
            if (num > mayor)
                mayor = num;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
}